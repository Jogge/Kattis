import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class bottledup {
    public static void main(String[] args) throws IOException {
        new bottledup();
    }

    private bottledup() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        int s = Integer.parseInt(input[0]);
        int v1 = Integer.parseInt(input[1]);
        int v2 = Integer.parseInt(input[2]);

        if(s % v1 == 0) {
            System.out.println(s / v1 + " 0");
            return;
        } else {
            for(int n = s / v1; n >= 0; n--) {
                int sLeft = (s - n * v1);
                if(sLeft % v2 == 0) {
                    System.out.println(n + " " + (sLeft / v2));
                    return;
                }
            }
        }

        System.out.println("Impossible");

    }
}
