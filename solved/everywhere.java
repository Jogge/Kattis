import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class everywhere {
    public static void main(String[] args) throws IOException {
        new everywhere();
    }

    private everywhere() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(reader.readLine());
            HashSet<String> visited = new HashSet<>();
            int cityCount = 0;
            for (int j = 0; j < n; j++) {
                if(visited.add(reader.readLine())) cityCount++;
            }
            System.out.println(cityCount);
        }
    }
}
