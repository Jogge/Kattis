import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class simonsays {
    public static void main(String[] args) throws IOException {
        new simonsays();
    }

    private simonsays() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for(int i = 0; i < n; i++) {
            String line = reader.readLine();
            if(line.startsWith("Simon says")) {
                System.out.println(line.substring(10));
            }
        }
    }
}