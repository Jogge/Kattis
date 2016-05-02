import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class bestcompression {
    public static void main(String[] args) throws IOException {
        new bestcompression();
    }

    private bestcompression() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        BigInteger n = new BigInteger(input[0]);
        int b = Integer.parseInt(input[1]) + 1;

        if(new BigInteger("2").pow(b).subtract(n).signum() == 1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
