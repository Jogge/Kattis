import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class twostones {
    public static void main(String[] args) throws IOException {
        new twostones();
    }

    public twostones() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(reader.readLine());

        if(n % 2 == 0) System.out.println("Bob");
        else System.out.println("Alice");
    }
}
