import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class judging {

    public static void main(String[] args) throws IOException {
        new judging();
    }

    private judging() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int n = new Integer(input);

        HashMap<String, Integer> DOMjudge = new HashMap<>();

        for (int i = 0; i < n; i++) {
            input = reader.readLine();
            if(DOMjudge.containsKey(input)) {
                DOMjudge.put(input, DOMjudge.get(input) + 1);
            } else {
                DOMjudge.put(input, 1);
            }
        }

        HashMap<String, Integer> kattis = new HashMap<>();

        for (int i = 0; i < n; i++) {
            input = reader.readLine();
            if(kattis.containsKey(input)) {
                kattis.put(input, kattis.get(input) + 1);
            } else {
                kattis.put(input, 1);
            }
        }

        int result = 0;

        for(String s : DOMjudge.keySet()) {
            if(kattis.containsKey(s)) {
                result += Math.min(DOMjudge.get(s), kattis.get(s));
            }
        }

        System.out.println(result);
    }
}
