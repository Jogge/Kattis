import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class secretmessage {
    public static void main(String[] args) throws IOException {
        new secretmessage();
    }

    private secretmessage() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        for(int in = 0; in<n; in++) {
            String message = reader.readLine();
            char[] mchars = message.toCharArray();
            double l = message.length();
            int k = (int) Math.ceil(Math.sqrt(l));
            char[][] messageTable = new char[k][k];
            char[][] secretTable = new char[k][k];
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    if (i * k + j < l) {
                        messageTable[i][j] = mchars[i * k + j];
                    } else {
                        messageTable[i][j] = '*';
                    }
                }
            }

            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    secretTable[i][j] = messageTable[k - 1 - j][i];
                }
            }

            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    if (secretTable[i][j] != '*') {
                        System.out.print(secretTable[i][j]);
                    }
                }
            }
            System.out.print("\n");
        }
    }
}
