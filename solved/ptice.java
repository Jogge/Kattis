import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

class ptice {
    public static void main(String[] args) throws IOException {
        new ptice();
    }

    private ptice() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        reader.readLine();

        char[] test = reader.readLine().toCharArray();
        char[][] contestants = {{'A', 'B', 'C'}, {'B', 'A', 'B', 'C'}, {'C', 'C', 'A', 'A', 'B', 'B'}};
        Integer[] score = {0, 0, 0};
        int maxScore = 0;


        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < test.length; j++) {
                if(test[j] == contestants[i][j % contestants[i].length]) {
                    score[i]++;
                }
            }

            if(score[i] > maxScore) {
                maxScore = score[i];
            }
        }

        System.out.println(maxScore);

        if(score[0] == maxScore) {
            System.out.println("Adrian");
        }

        if(score[1] == maxScore) {
            System.out.println("Bruno");
        }

        if(score[2] == maxScore) {
            System.out.println("Goran");
        }
    }
}
