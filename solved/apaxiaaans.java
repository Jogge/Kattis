import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class apaxiaaans {
    public static void main(String[] args) throws IOException {
        new apaxiaaans();
    }

    private apaxiaaans() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder result = new StringBuilder();

        char lastChar = '.';
        for(char c : reader.readLine().toCharArray()) {
            if(lastChar != c) {
                result.append(c);
                lastChar = c;
            }
        }

        System.out.println(result);
    }
}
