import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class simon {
    public static void main(String[] args) throws IOException {
        new simon();
    }

    private simon() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for(int i = 0; i < n; i++) {
            String line = reader.readLine();
            if(line.startsWith("simon says ")) {
                System.out.println(line.substring(11));
            } else {
                System.out.println();
            }
        }
    }
}