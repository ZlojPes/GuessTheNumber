package com.ospavliuk.gtn;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Game {
    Gui gui;
    ArtInt artInt;
    Mixer mixer;
    private boolean gameStarted;
    private int userWinCounter, compWinCounter;
    private ArrayList<int[]> userMoves;
    private int[] compNum, userNum;
    private File scoreFile;
    private int moveCounter;

    public boolean isGameStarted() {
        return gameStarted;
    }

    public void setGameStarted(boolean gameStarted) {
        this.gameStarted = gameStarted;
    }

    public Game() {
        gui = new Gui(this);
        gui.setVisible(true);
        scoreFile = new File((new JFileChooser()).getFileSystemView().getDefaultDirectory().toString() + "\\num");
        initGlobalScore();
    }

    public void start() {
        if (gameStarted) {
            artInt = new ArtInt();
            mixer = new Mixer();
            moveCounter = 0;
            userMoves = new ArrayList<>();
            Gui.Settings settings = gui.getCurrentSettings();
//            if (settings.typeGame1 == 0 && settings.guess2 == 0)
            compNum = RandomGen.getRandom();
            if (settings.guess2 == 1) {
                userNum = compNum;
            }
            if (settings.ownNumber3Enabled && settings.ownNumber3 == 1) {
                userNum = RandomGen.getRandom();
                new Ticker("Ваше число установлено как " + userNum[0] + userNum[1] + userNum[2] + userNum[3], gui);
            }
        } else {
            gui.print("Прервано пользователем");
        }
    }

    public int getMoveCounter() {
        return moveCounter;
    }

    public void enter(String inputNumber) {
        Gui.Settings settings = gui.getCurrentSettings();
        UniqueDigits un = new UniqueDigits(inputNumber.toCharArray());
        if (gameStarted) {
            if (settings.numberInputEnabled) {
                if (un.isValidNumber()) {
                    int[] userNumber = un.getIntArray();
                    gui.print(true, userNumber);
                    gui.print(true, getRemoteScore(userNumber));
                    int[] userScore = getRemoteScore(userNumber);
                    userMoves.add(new int[]{userNumber[0], userNumber[1], userNumber[2], userNumber[3], userScore[0], userScore[1]});
                    gui.setNumberInputText("");
                    try {
                        int[] compScore = getCompScore();
                        if (settings.numberInputEnabled && compScore != null) {
                            checkWinner(userScore, compScore);
                        } else {
                            gui.manualScorePrepare();
                        }
                    } catch (WrongScoreException ex) {
                        wrongScore();
                    }
                }
            } else {
//                keyboardEnabled(true);
                calculateScore();
            }
        } else {
            if (un.isValidNumber()) {
                new Ticker("Ваше число установлено как " + inputNumber + ". Нажмите \"начать игру!\" для старта", gui);
                userNum = un.getIntArray();
                gui.setStartButtonEnabled(true);
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
        gui.print("Вы допустили ошибку при вводе счёта в одном из ходов. Вам засчитывается техническое поражение.");
        gui.stopGame();
    }

    private void checkWinner(int[] userScore, int[] compScore) {
        Gui.Settings settings = gui.getCurrentSettings();
        moveCounter++;
        try {
            if (settings.ownNumber3 == 2 && compScore[1] < 4) {
                artInt.nextMove();
            }
            if (userScore[1] == 4 || compScore[1] == 4) {
                printAll();
                if (userScore[1] == 4 && compScore[1] == 4) {
                    gui.print("Ничья!");
                    gui.stopGame();
                } else if (userScore[1] == 4) {
                    gui.print("Вы выиграли!");
                    userWinCounter++;
                    gui.stopGame();
                } else if (compScore[1] == 4) {
                    gui.print("Вы проиграли!");
                    if (settings.typeGame1 == 0 && settings.guess2 == 0)
                        gui.print("Вашей целью было число " + compNum[0] + compNum[1] + compNum[2] + compNum[3]);
                    compWinCounter++;
                    gui.stopGame();
                }
                gui.setGlobalScore(new int[]{userWinCounter, compWinCounter});
            } else {
                gui.nextMove();
            }
        } catch (WrongScoreException ex) {
            wrongScore();
        }
    }

    protected void printAll() {
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
        Gui.Settings settings = gui.getCurrentSettings();
        int[] score;
        int[] artIntMove = artInt.nextMove();
        int[] mixedMove = mixer.getMix(artIntMove);
        gui.print(false, mixedMove);
        if (settings.ownNumber3 != 2)
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
        Gui.Settings settings = gui.getCurrentSettings();
        if (settings.typeGame1 == 0) {
            int[] score = Score.getScore(compNum, intArray);
            return new int[]{score[score.length - 2], score[score.length - 1]};
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }


    public static void main(String[] args) {
        Game game = new Game();
    }


    private void initGlobalScore() {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader(scoreFile));
            String s = reader.readLine();
            String[] score = s.split(":");
            userWinCounter = Integer.parseInt(score[0]);
            compWinCounter = Integer.parseInt(score[1]);
            gui.setGlobalScore(new int[]{userWinCounter, compWinCounter});
        } catch (FileNotFoundException e) {
            try {
                writer = new BufferedWriter(new FileWriter(scoreFile));
                writer.write("0:0");
            } catch (IOException e1) {
                Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, (String) null, e1);
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
