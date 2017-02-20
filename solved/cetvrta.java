import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class cetvrta {
    public static void main(String[] args) throws IOException {
        new cetvrta();
    }

    private cetvrta() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] x = new int[3], y = new int[3];
        for(int i = 0; i < 3; i++) {
            String[] input = reader.readLine().split(" ");
            int[] point = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
            x[i] = point[0];
            y[i] = point[1];
        }

        String result = "";

        if(x[0] == x[1]) result += x[2];
        else if(x[0] == x[2]) result += x[1];
        else result += x[0];

        result += " ";

        if(y[0] == y[1]) result += y[2];
        else if(y[0] == y[2]) result += y[1];
        else result += y[0];

        System.out.println(result);
    }
}
