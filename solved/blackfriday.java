import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class blackfriday {
    public static void main(String[] args) throws IOException {
        new blackfriday();
    }

    private blackfriday() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        String[] numbers = new String[6];

        String[] input = reader.readLine().split(" ");

        for(int i = 0; i < n; i++) {
            int number = Integer.parseInt(input[i]);
            if(numbers[number-1]==null) {
                numbers[number-1] = i + "";
            } else {
                numbers[number-1] = "dead";
            }
        }

        for(int i = 5; i>=0; i--) {
            if(numbers[i]!=null && !numbers[i].equals("dead")) {
                System.out.println((Integer.parseInt(numbers[i])+1) + "");
                return;
            }
        }

        System.out.println("none");
    }
}
