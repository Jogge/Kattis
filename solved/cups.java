import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class cups {
    public static void main(String[] args) throws IOException {
        new cups();
    }

    private cups() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        TreeMap<Integer, String> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            try {
                map.put(Integer.parseInt(input[0]) / 2, input[1]);
            } catch (NumberFormatException e) {
                map.put(Integer.parseInt(input[1]), input[0]);
            }
        }

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
