import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zamka {
    public static void main(String[] args) throws IOException {
        new zamka();
    }

    private zamka() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int x = Integer.parseInt(reader.readLine());

        //Min
        for(int i = l;; i++) {
            int sum = 0;
            for (char n : String.valueOf(i).toCharArray()) {
                sum += Integer.parseInt(String.valueOf(n));
            }
            if(sum == x) {
                System.out.println(i);
                break;
            }
        }

        //Max
        for(int i = d;; i--) {
            int sum = 0;
            for (char n : String.valueOf(i).toCharArray()) {
                sum += Integer.parseInt(String.valueOf(n));
            }
            if(sum == x) {
                System.out.println(i);
                break;
            }
        }
    }
}
