package com.ospavliuk.gtn;

import java.util.ArrayList;
import java.util.Arrays;

public class ArtInt3 {
    private final ArrayList<int[]> log;

    public ArtInt3() {
        this.log = new ArrayList<>();
    }

    public int[] nextMove() throws WrongScoreException {
        int[] allowedByLog = new int[4];
        exit:
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                if (b != a) {
                    for (int c = 0; c < 10; c++) {
                        if (c != b && c != a) {
                            for (int d = 0; d < 10; d++) {
                                if (d != c && d != b && d != a) {
                                    int[] attempt = new int[]{a, b, c, d};
                                    if (compareToLog(attempt)) {
                                        allowedByLog = attempt;
                                        break exit;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (Arrays.equals(allowedByLog, new int[]{0, 0, 0, 0}))
            throw new WrongScoreException();
        return allowedByLog;
    }

    private boolean compareToLog(int[] attempt) {
        int[] shortLog = new int[4];
        for (int[] fromLog : log) {
            System.arraycopy(fromLog, 0, shortLog, 0, 4);
            int[] score = Score.getScore(attempt, fromLog);
            if (score[score.length - 2] != fromLog[4] || score[score.length - 1] != fromLog[5] || Arrays.equals(attempt, shortLog))
                return false;
        }
        return true;
    }

    public void writeToLog(int[] a) {
        log.add(a);
    }

    ArrayList<int[]> getLog() {
        return log;
    }
}
