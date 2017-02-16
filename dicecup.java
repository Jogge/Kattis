import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dicecup {
    public static void main(String[] args) throws IOException {
        new dicecup();
    }

    public dicecup() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int min = Math.min(n, m);
        int max = Math.max(n, m);

        for(int sum = min + 1; sum <= max + 1; sum++) {
            System.out.println(sum);
        }
    }
}
