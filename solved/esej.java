import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class esej {

    private char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int d = 0;


    public static void main(String[] args) throws IOException {
        new esej();
    }

    private esej() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int min = Math.max(new Integer(line.split(" ")[0]), (new Integer(line.split(" ")[1]))/2+1);
        for(int i = 0; i < min; i++) {
            System.out.print(((i==0) ? "" : " ") + getWord());
        }
    }

    private String getWord() {
        String word = "" + alphabet[a] + alphabet[b] + alphabet[c] + alphabet[d];
        a++;
        if(a >= 26) {
            a = 0;
            b++;
            if(b >= 26) {
                b = 0;
                c++;
                if(c >= 26) {
                    c= 0;
                    d++;
                    if(d >= 26) {
                        a = 0;
                        b = 0;
                        c = 0;
                        d = 0;
                    }
                }
            }
        }
        return word;
    }
}
