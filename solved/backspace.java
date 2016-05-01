import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class backspace {
    public static void main(String[] args) throws IOException {
        new backspace();
    }

    private backspace() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char[] input = reader.readLine().toCharArray();

        char[] result = new char[input.length];
        int pointer = 0;

        for(char c : input) {
            if(c == '<') {
                if(pointer > 0) pointer--;
            } else {
                result[pointer] = c;
                pointer++;
            }
        }

        System.out.println(new String(result, 0, pointer));
    }
}
