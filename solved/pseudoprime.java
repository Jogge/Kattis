import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class pseudoprime {
    public static void main(String[] args) throws IOException {
        new pseudoprime();
    }

    private pseudoprime() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while (!(input = reader.readLine()).equals("0 0")) {
            BigInteger p = new BigInteger(input.split(" ")[0]);
            BigInteger a = new BigInteger(input.split(" ")[1]);
            if (!isPrime(p.intValue()) && a.equals(a.modPow(p, p))) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2)
            if (n % i == 0) return false;
        return true;
    }
}
