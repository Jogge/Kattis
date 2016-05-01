import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class speedlimit {
    public static void main(String[] args) throws IOException {
        new speedlimit();
    }

    private speedlimit() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while(!(input = reader.readLine()).equals("-1")) {
            int n = Integer.parseInt(input);

            int miles = 0;
            int time = 0;

            for(int i = 0; i < n; i++) {
                input = reader.readLine();
                int mph = Integer.parseInt(input.split(" ")[0]);
                int hours = Integer.parseInt(input.split(" ")[1]) - time;
                miles += mph * hours;
                time += hours;
            }

            System.out.println(miles + " miles");
        }
    }
}