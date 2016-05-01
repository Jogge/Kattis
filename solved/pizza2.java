import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class pizza2 {
    public static void main(String[] args) throws IOException {
        new pizza2();
    }

    private pizza2() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        double radius = Integer.parseInt(input.split(" ")[0]);
        double crust = Integer.parseInt(input.split(" ")[1]);

        double a1 = Math.PI * Math.pow(radius, 2.0);
        double a2 = Math.PI * Math.pow(radius-crust, 2.0);
        System.out.println(a2 / a1 * 100.0);
    }
}
