import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class cd {
    public static void main(String[] args) throws IOException {
        new cd();
    }

    private cd() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int i, n, m, counter;
        int[] cd;
        String line;

        while ((line = reader.readLine()) != null) {
            String[] split = line.split(" ");
            n = Integer.parseInt(split[0]); //Jack
            m = Integer.parseInt(split[1]); //Jill
            if(n==0 && m==0) {
                return;
            }

            cd = new int[n];

            for (i = 0; i < n; i++) {
                line = reader.readLine();
                int currentCD = Integer.parseInt(line);
                cd[i] = currentCD;
            }

            counter = 0;
            for (i = 0; i < m; i++) {
                line = reader.readLine();
                int currentCD = Integer.parseInt(line);
                if (Arrays.binarySearch(cd,currentCD) >= 0) {
                    counter++;
                }
            }

            System.out.println(counter);
        }
    }
}
