import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class oddities {
    public static void main(String[] args) throws IOException {
        new oddities();
    }

    private oddities() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for(int i = 0; i < n; i++) {
            int number = Integer.parseInt(reader.readLine());
            System.out.println(number + " is " + ((number % 2) == 0 ? "even" : "odd"));
        }
    }
}
