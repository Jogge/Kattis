import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class simpleaddition {
    public static void main(String[] args) throws IOException {
        new simpleaddition();
    }

    private simpleaddition() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n1 = new BigInteger(reader.readLine());
        BigInteger n2 = new BigInteger(reader.readLine());
        System.out.println(n1.add(n2).toString());
    }
}
