import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;

class primesieve {
    public static void main(String[] args) throws IOException {
        new primesieve();
    }

    private primesieve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int q = Integer.parseInt(input[1]);

        BitSet candidates = new BitSet(n+1);
        candidates.set(0, 2, false);
        candidates.set(2, n+1, true);

        int primeCount = n-1;

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(candidates.get(i)) {
                for(int j = 2; j * i <= n; j++) {
                    int num = j * i;
                    if(candidates.get(num)) {
                        candidates.set(num, false);
                        primeCount--;
                    }
                }
            }
        }

        System.out.println(primeCount);

        for(int i = 0; i < q; i++) {
            int number = Integer.parseInt(reader.readLine());
            if(candidates.get(number)) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }

}
