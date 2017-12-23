package com.ospavliuk.gtn;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Game implements GuiObserver {
    private Gui gui;
    private Gui.State state;
    private ArtInt artInt;
    private Mixer mixer;
    private boolean gameStarted;
    private int userWinCounter, compWinCounter;
    private ArrayList<int[]> userMoves;
    private int[] compNum, userNum;
    private File scoreFile;
    private int moveCounter;

    private Game() {
        gui = new Gui(this);
        gui.setVisible(true);
        scoreFile = new File((new JFileChooser()).getFileSystemView().getDefaultDirectory().toString() + "\\num");
        initGlobalScore();
        gui.registerObserver(this);
    }

    private void start() {
        if (gameStarted) {
            artInt = new ArtInt();
            mixer = new Mixer();
            moveCounter = 0;
            writeGlobalScore(userWinCounter, compWinCounter + 1);
            userMoves = new ArrayList<>();
            Gui.State state = gui.getCurrentState();
            compNum = RandomGen.getRandom();
            if (state.guess2 == 1) {
                userNum = compNum;
            }
            if (state.ownNumber3Enabled && state.ownNumber3 == 1) {
                userNum = RandomGen.getRandom();
                new Ticker("Ваше число установлено как " + userNum[0] + userNum[1] + userNum[2] + userNum[3], gui);
            }
        } else {
            gui.print("Прервано пользователем");
            initGlobalScore();
        }
    }

    public int getMoveCounter() {
        return moveCounter;
    }

    public void enter(String inputNumber) {
        UniqueDigits un = new UniqueDigits(inputNumber.toCharArray());
        if (gameStarted) {
            if (state.numberInputEnabled) {
                if (un.isValidNumber()) {
                    int[] userNumber = un.getIntArray();
                    gui.print(true, userNumber);
                    gui.print(true, getRemoteScore(userNumber));
                    int[] userScore = getRemoteScore(userNumber);
                    userMoves.add(new int[]{userNumber[0], userNumber[1], userNumber[2], userNumber[3], userScore[0], userScore[1]});
                    gui.clearInputField();
                    try {
                        int[] compScore = getCompScore();
                        if (state.numberInputEnabled && compScore != null) {
                            checkWinner(userScore, compScore);
                        } else {
                            gui.manualScorePrepare();
                        }
                    } catch (WrongScoreException ex) {
                        wrongScore();
                    }
                }
            } else {
                calculateScore();
            }
        } else {
            if (un.isValidNumber()) {
                new Ticker("Ваше число установлено как " + inputNumber + ". Нажмите \"начать игру!\" для старта", gui);
                userNum = un.getIntArray();
                gui.enableStartButton();
            } else new Ticker("Проверьте данные и попробуйте еще раз!", gui);
        }
    }

    void calculateScore() {
        int[] score1 = new int[]{userMoves.get(userMoves.size() - 1)[4], userMoves.get(userMoves.size() - 1)[5]};
        int[] score2 = gui.getManualScore();
        gui.print(false, score2);
        ArrayList<int[]> log = artInt.getPrevMoves();
        int[] last = log.get(log.size() - 1);
        int[] output = new int[]{last[0], last[1], last[2], last[3], score2[0], score2[1]};
        artInt.getPrevMoves().remove(log.size() - 1);
        artInt.writeToLog(output);
        gui.setManualScoreEnabled(false);
        checkWinner(score1, score2);
    }

    private void wrongScore() {
        gui.print("Вы допустили ошибку при\nвводе счёта в одном из ходов.\nВам засчитывается техничес-\nкое поражение.");
        gui.stopGame();
    }

    private void checkWinner(int[] userScore, int[] compScore) {
        moveCounter++;
        try {
            if (state.ownNumber3 == 2 && compScore[1] < 4) {
                artInt.nextMove();
            }
            if (userScore[1] == 4 || compScore[1] == 4) {
                printAll();
                gameStarted = false;
                gui.stopGame();
                if (userScore[1] == 4 && compScore[1] == 4) {
                    gui.print("Ничья!");
                    writeGlobalScore(++userWinCounter, ++compWinCounter);
                } else if (userScore[1] == 4) {
                    gui.print("Вы выиграли!");
                    writeGlobalScore(++userWinCounter, compWinCounter);
                } else if (compScore[1] == 4) {
                    gui.print("Вы проиграли!");
                    if (state.typeGame1 == 0 && state.guess2 == 0)
                        gui.print("Вашей целью было число " + compNum[0] + compNum[1] + compNum[2] + compNum[3]);
                }
                initGlobalScore();
            } else {
                gui.nextMove();
            }
        } catch (WrongScoreException ex) {
            wrongScore();
        }
    }

    private void printAll() {
        gui.clearScreen();
        if (userMoves.size() == artInt.getPrevMoves().size()) {
            for (int i = 0; i < userMoves.size(); i++) {
                moveCounter = i;
                gui.setHideEnemyMoves(false);
                int[] a = userMoves.get(i);
                int[] b = artInt.getPrevMoves().get(i);
                gui.print(true, new int[]{a[0], a[1], a[2], a[3]});
                gui.print(true, new int[]{a[4], a[5]});
                gui.print(false, mixer.getMix(new int[]{b[0], b[1], b[2], b[3]}));
                gui.print(false, new int[]{b[4], b[5]});
            }
        }
    }

    private int[] getCompScore() throws WrongScoreException {
        int[] score;
        int[] artIntMove = artInt.nextMove();
        int[] mixedMove = mixer.getMix(artIntMove);
        gui.print(false, mixedMove);
        if (state.ownNumber3 != 2)
            score = Score.getScore(userNum, mixedMove);
        else {
            artInt.writeToLog(artIntMove);
            return null;
        }
        gui.print(false, score);
        int[] toLog = new int[6];
        System.arraycopy(artIntMove, 0, toLog, 0, 4);
        System.arraycopy(score, 0, toLog, 4, 2);
        artInt.writeToLog(toLog);
        return score;

    }

    private int[] getRemoteScore(int[] intArray) {
        if (state.typeGame1 == 0) {
            int[] score = Score.getScore(compNum, intArray);
            return new int[]{score[score.length - 2], score[score.length - 1]};
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }


    public static void main(String[] args) {
        new Game();
    }


    private void initGlobalScore() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(scoreFile));
            String s = reader.readLine();
            String[] score = s.split(":");
            userWinCounter = Integer.parseInt(score[0]);
            compWinCounter = Integer.parseInt(score[1]);
            gui.setGlobalScore(userWinCounter, compWinCounter);
        } catch (FileNotFoundException | NumberFormatException e) {
            writeGlobalScore(0, 0);
        } catch (IOException e3) {
            e3.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void writeGlobalScore(int user, int comp) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileWriter(scoreFile));
            writer.print(user + ":" + comp);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

    @Override
    public void guiStateChanged(Gui.State state) {
        this.state = state;
        if(gameStarted!=state.startButtonGaming){
            gameStarted=state.startButtonGaming;
            start();        }
    }
}
