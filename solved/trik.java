import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class trik {
    public static void main(String[] args) throws IOException {
        new trik();
    }

    private trik() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] moves = reader.readLine().toCharArray();
        int cup = 1;

        for(char move : moves) {
            if(move == 'A') {
                if(cup == 3) continue;
                cup = 3 - cup;
            } else if(move == 'B') {
                if(cup == 1) continue;
                cup = 5 - cup;
            } else {
                if(cup == 2) continue;
                cup = 4 - cup;
            }
        }
        System.out.println(cup);
    }
}
