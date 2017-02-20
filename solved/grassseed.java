import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class grassseed {
    public static void main(String[] args) throws IOException {
        new grassseed();
    }

    private grassseed() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double price = Double.parseDouble(reader.readLine());
        int lawnsCount = Integer.parseInt(reader.readLine());
        double cost = 0;
        for (int i = 0; i < lawnsCount; i++) {
            String[] input = reader.readLine().split(" ");
            double width = Double.parseDouble(input[0]);
            double length = Double.parseDouble(input[1]);
            cost += width * length * price;
        }
        System.out.println(cost);
    }
}
