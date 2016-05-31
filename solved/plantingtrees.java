import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

class plantingtrees {
    public static void main(String[] args) throws IOException {
        new plantingtrees();
    }

    private plantingtrees() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        PriorityQueue<Integer> trees = new PriorityQueue<>();

        String[] input = reader.readLine().split(" ");
        for(int i = 0; i < n; i++) {
            trees.add(Integer.parseInt(input[i]));
        }

        int day = 0;

        for(int i = 0; i < n; i++) {
            int d = n - i + trees.poll();
            if(day < d) {
                day = d;
            }
        }

        System.out.println(day + 1);
    }
}