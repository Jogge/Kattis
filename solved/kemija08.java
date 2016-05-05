import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class kemija08 {
    public static void main(String[] args) throws IOException {
        new kemija08();
    }

    private kemija08() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char[] input = reader.readLine().toCharArray();

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < input.length; i++) {
            result.append(input[i]);
            if(input[i] == 'a' || input[i] == 'e' || input[i] == 'i' || input[i] == 'o' || input[i] == 'u') {
                i = i + 2;
            }
        }

        System.out.println(result);
    }
}