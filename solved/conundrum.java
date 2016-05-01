import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class conundrum {
    public static void main(String[] args) throws IOException {
        new conundrum();
    }

    private conundrum() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String cipher = reader.readLine();
        char[] chars = cipher.toCharArray();
        char[] cryp = {'P','E','R'};
        int counter = 0;
        for(int i = 0; i<chars.length; i++) {
            if(chars[i]!=cryp[(i)%3]) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
