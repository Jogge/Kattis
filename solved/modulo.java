import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

class modulo {
    public static void main(String[] args) throws IOException {
        new modulo();
    }

    private modulo() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i = 0; i < 10; i++) {
            int input = Integer.parseInt(reader.readLine());
            hashSet.add(input % 42);
        }

        System.out.println(hashSet.size());
    }
}