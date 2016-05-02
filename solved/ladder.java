import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ladder {
    public static void main(String[] args) throws IOException {
        new ladder();
    }

    private ladder() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        double height = Double.parseDouble(input[0]);
        double angle = Math.toRadians(Double.parseDouble(input[1]));

        System.out.println((int) Math.ceil(height / Math.sin(angle)));
    }
}
