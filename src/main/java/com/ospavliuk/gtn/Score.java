package com.ospavliuk.gtn;

public class Score {

    public static int[] getScore(int[] matrix, int[] attempt) {
        int score1 = 0, score2 = 0;
        for (int k = 0; k < 4; k++)
            for (int l = 0; l < 4; l++)
                if (matrix[k] == attempt[l])
                    score1++;
        for (int m = 0; m < 4; m++)
            if (matrix[m] == attempt[m])
                score2++;
        return new int[]{score1, score2};
    }
}
