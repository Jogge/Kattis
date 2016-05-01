import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class mixedfractions {
    public static void main(String[] args) throws IOException {
        new mixedfractions();
    }

    private mixedfractions() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input;

        while(!(input = reader.readLine()).equals("0 0")) {
            int num = Integer.parseInt(input.split(" ")[0]);
            int den = Integer.parseInt(input.split(" ")[1]);

            System.out.println("" + (num / den) + " " + (num % den) + " / " + den);
        }
    }
}
