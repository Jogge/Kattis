import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Hashtable;

class pivot {
    public static void main(String[] args) throws IOException {
        new pivot();
    }

    private pivot() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int high = 0;
        ArrayList<Integer> candidates = new ArrayList<>();
        Hashtable<Integer, Integer> result = new Hashtable<>();
        String[] input = reader.readLine().split(" ");
        for(int i = 0; i<n; i++) {
            int candidate = Integer.parseInt(input[i]);
            candidates.add(candidate);
            if (candidate > high) {
                result.put(candidate, candidate);
                high = candidate;
            }
        }
        
        int counter = 0;
        int low = candidates.get(n-1);
        if(result.containsKey(low)) counter++;

        for(int i = n-1; i>=0; i--) {
            int candidate = candidates.get(i);
            if(candidate<low) {
                low = candidate;
                if(result.containsKey(candidate)) {
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }
}
