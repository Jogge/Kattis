import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class different {
    public static void main(String[] args) throws IOException {
        new different();
    }

    private different() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input;

        while ((input = reader.readLine()) != null) {
            long num1 = Long.parseLong(input.split(" ")[0]);
            long num2 = Long.parseLong(input.split(" ")[1]);

            System.out.println(Math.abs(num1 - num2));
        }
    }
}
