import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class tutorial {
    public static void main(String[] args) throws IOException {
        new tutorial();
    }

    private tutorial() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        int t = Integer.parseInt(input[2]);

        int[] fac = new int[]{1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

        if(t == 1) {
            if(n <= 12 && fac[n] <= m) {
                System.out.println("AC");
            } else {
                System.out.println("TLE");
            }
        } else if(t == 2) {
            if(n <= 29 && Math.pow(2, n) <= m) {
                System.out.println("AC");
            } else {
                System.out.println("TLE");
            }
        } else if(t == 3) {
            if(n < 178 && Math.pow(n, 4) <= m) {
                System.out.println("AC");
            } else {
                System.out.println("TLE");
            }
        } else if(t == 4) {
            if(n <= 1000 && Math.pow(n, 3) <= m) {
                System.out.println("AC");
            } else {
                System.out.println("TLE");
            }
        } else if(t == 5) {
            if(n < 31623 && Math.pow(n, 2) <= m) {
                System.out.println("AC");
            } else {
                System.out.println("TLE");
            }
        } else if(t == 6) {
            if(n < 39620078 && (n * (Math.log(n) / Math.log(2))) <= m) {
                System.out.println("AC");
            } else {
                System.out.println("TLE");
            }
        } else {
            if(n <= m) {
                System.out.println("AC");
            } else {
                System.out.println("TLE");
            }
        }
    }
}