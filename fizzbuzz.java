import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fizzbuzz {
    public static void main(String[] args) throws IOException {
        new fizzbuzz();
    }

    public fizzbuzz() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        long x = Long.parseLong(input[0]);
        long y = Long.parseLong(input[1]);
        long n = Long.parseLong(input[2]);

        for (int i = 1; i <= n; i++) {
            boolean fizz = i % x == 0;
            boolean buzz = i % y == 0;
            if (fizz && buzz) System.out.println("FizzBuzz");
            else if (fizz) System.out.println("Fizz");
            else if (buzz) System.out.println("Buzz");
            else System.out.println(i);
        }
    }
}
