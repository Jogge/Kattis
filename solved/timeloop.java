import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class timeloop {
    public static void main(String[] args) throws IOException {
        new timeloop();
    }

    private timeloop() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        for(int i = 1; i <= n; i++) {
            System.out.println(i + " Abracadabra");
        }
    }
}
