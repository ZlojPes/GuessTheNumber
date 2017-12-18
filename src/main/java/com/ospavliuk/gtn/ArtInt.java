package com.ospavliuk.gtn;

import java.util.ArrayList;
import java.util.Arrays;

public class ArtInt {
    private final ArrayList<int[]> prevMoves;

    public ArtInt() {
        this.prevMoves = new ArrayList<>();
    }

    public int[] nextMove() throws WrongScoreException {
        int[] attempt = null;
        exit:
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                if (b != a) {
                    for (int c = 0; c < 10; c++) {
                        if (c != b && c != a) {
                            for (int d = 0; d < 10; d++) {
                                if (d != c && d != b && d != a) {
                                    attempt = new int[]{a, b, c, d};
                                    if (compareToPrevious(attempt)) {
                                        break exit;
                                    } else {
                                        attempt = null;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (attempt == null) {
            throw new WrongScoreException();
        }
        return attempt;
    }

    private boolean compareToPrevious(int[] attempt) {
        int[] number = new int[4];
        for (int[] move : prevMoves) {
            System.arraycopy(move, 0, number, 0, 4);
            int[] score = Score.getScore(attempt, move);
            if (score[score.length - 2] != move[4] || score[score.length - 1] != move[5] || Arrays.equals(attempt, number)) {
                return false;
            }
        }
        return true;
    }

    public void writeToLog(int[] a) {
        prevMoves.add(a);
    }

    public ArrayList<int[]> getPrevMoves() {
        return prevMoves;
    }
}
