import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class deathstar {

    public static void main(String[] args) throws IOException {
        new deathstar();
    }

    private deathstar() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        int n = new Integer(input);

        for (int i = 0; i < n; i++) {
            String[] line = reader.readLine().split(" ");
            if (i != 0) {
                System.out.print(" ");
            }
            int output = 0;
            for (int j = 0; j < n; j++) {
                output |= new Integer(line[j]);
            }
            System.out.print(output);
        }
    }
}
