import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class sevenwonders {
    public static void main(String[] args) throws IOException, ParseException {
        new sevenwonders();
    }

    private sevenwonders() throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] input = reader.readLine().toCharArray();

        int T = 0;
        int C = 0;
        int G = 0;

        for (char c : input) {
            if (c == 'T') T++;
            else if(c == 'C') C++;
            else G++;
        }

        int points = T*T + C*C + G*G + Math.min(Math.min(T, C), G)*7;

        System.out.println(points);
    }
}
