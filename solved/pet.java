import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class pet {
    public static void main(String[] args) throws IOException {
        new pet();
    }

    private pet() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int best = 0;
        int bestSum = 0;

        for(int i = 1; i <= 5; i++) {
            String[] input = reader.readLine().split(" ");
            int sum = 0;
            for(String s : input) {
                sum += Integer.parseInt(s);
            }
            if(sum > bestSum) {
                bestSum = sum;
                best = i;
            }
        }

        System.out.println("" + best + " " + bestSum);
    }
}
