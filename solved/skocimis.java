import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class skocimis {
    public static void main(String[] args) throws IOException {
        new skocimis();
    }

    private skocimis() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        if(b - (a + 1) > c - (b + 1)) {
            System.out.println(b - (a + 1));
        } else {
            System.out.println(c - (b + 1));
        }

    }
}
