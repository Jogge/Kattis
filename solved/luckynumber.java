import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class luckynumber {
    public static void main(String[] args) throws IOException {
        new luckynumber();
    }

    private luckynumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        if(n > 25) {
            System.out.println(0);
            return;
        }

        int[] result = {45, 150, 375, 750, 1200, 1713, 2227, 2492, 2492, 2225, 2041, 1575, 1132, 770, 571, 335, 180, 90, 44, 18, 12, 6, 3, 1};
        System.out.println(result[n-2]);
    }
}