import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class bijele {
    public static void main(String[] args) throws IOException {
        new bijele();
    }

    private bijele() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        int[] numbers = {1, 1, 2, 2, 2, 8};

        for(int i = 0; i < 6; i++) {
            if(i > 0) {
                System.out.print(" ");
            }
            int number = Integer.parseInt(input[i]);
            System.out.print(numbers[i] - number);
        }
    }
}
