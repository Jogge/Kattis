import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class nizovi {
    public static void main(String[] args) throws IOException {
        new nizovi();
    }

    private nizovi() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char[] input = reader.readLine().toCharArray();

        StringBuilder result = new StringBuilder();
        int spaces = 0;

        for(int i = 0; i < input.length; i++) {
            char c = input[i];

            if(c == '}') {
                spaces--;
            }

            for(int j = 0; j < spaces; j++) {
                result.append("  ");
            }

            if(c == '{') {
                spaces++;
                result.append("{\n");
            } else if(c == '}') {
                if(i + 1 < input.length && input[i + 1] == ',') {
                    result.append("},\n");
                    i++;
                } else {
                    result.append("}\n");
                }
            } else {
                int j = i;
                while (j < input.length && input[j] != '{' && input[j] != '}' && input[j] != ',') {
                    result.append(input[j]);
                    j++;
                }
                if(j < input.length && input[j] == ',') {
                    i = j;
                    result.append(",\n");
                } else {
                    i = j - 1;
                    result.append("\n");
                }
            }
        }

        System.out.print(result.toString());
    }
}
