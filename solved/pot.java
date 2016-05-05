import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class pot {
    public static void main(String[] args) throws IOException {
        new pot();
    }

    private pot() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int sum = 0;

        for(int i = 0; i < n; i++) {
            String input = reader.readLine();
            int number = Integer.parseInt(input.substring(0, input.length() - 1));
            int pow = Integer.parseInt(input.substring(input.length() - 1, input.length()));
            sum += Math.pow(number, pow);
        }

        System.out.println(sum);
    }
}
