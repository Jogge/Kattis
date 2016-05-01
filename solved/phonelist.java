import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

class phonelist {

    public static void main(String[] args) throws IOException {
        new phonelist();
    }

    private phonelist() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int t = new Integer(line);

        TestLoop:
        for(int i = 0; i < t; i++) {
            int n = new Integer(reader.readLine());
            TreeSet<String> numbers = new TreeSet<>();
            for(int j = 0; j < n; j++) {
                numbers.add(reader.readLine());
            }

            for(String number : numbers) {
                String number2 = numbers.higher(number);
                if(number2 != null && number2.startsWith(number)) {
                    System.out.println("NO");
                    continue TestLoop;
                }
            }
            System.out.println("YES");
        }
    }
}