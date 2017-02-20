import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class detaileddifferences {
    public static void main(String[] args) throws IOException {
        new detaileddifferences();
    }

    private detaileddifferences() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String line = reader.readLine();
            System.out.println(line);
            char[] l1 = line.toCharArray();
            line = reader.readLine();
            System.out.println(line);
            char[] l2 = line.toCharArray();
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < l1.length; j++) {
                if(l1[j] == l2[j]) sb.append('.');
                else  sb.append('*');
            }

            System.out.println(sb.toString());
            System.out.println();
        }
    }
}
