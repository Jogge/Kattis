import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class _4thought {
    public static void main(String[] args) throws IOException {
        new _4thought();
    }

    private _4thought() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());

        HashMap<Integer, String> combinations = new HashMap<>();
        combinations.put(-60,"4 - 4 * 4 * 4 = -60");
        combinations.put(-16,"4 - 4 - 4 * 4 = -16");
        combinations.put(-15,"4 / 4 - 4 * 4 = -15");
        combinations.put(-8,"4 + 4 - 4 * 4 = -8");
        combinations.put(-7,"4 / 4 - 4 - 4 = -7");
        combinations.put(-4,"4 / 4 / 4 - 4 = -4");
        combinations.put(-1,"4 - 4 - 4 / 4 = -1");
        combinations.put(0,"4 + 4 - 4 - 4 = 0");
        combinations.put(1,"4 + 4 / 4 - 4 = 1");
        combinations.put(2,"4 / 4 + 4 / 4 = 2");
        combinations.put(4,"4 + 4 / 4 / 4 = 4");
        combinations.put(7,"4 + 4 - 4 / 4 = 7");
        combinations.put(8,"4 + 4 + 4 - 4 = 8");
        combinations.put(9,"4 + 4 + 4 / 4 = 9");
        combinations.put(15,"4 * 4 - 4 / 4 = 15");
        combinations.put(16,"4 + 4 + 4 + 4 = 16");
        combinations.put(17,"4 * 4 + 4 / 4 = 17");
        combinations.put(24,"4 + 4 + 4 * 4 = 24");
        combinations.put(32,"4 * 4 + 4 * 4 = 32");
        combinations.put(60,"4 * 4 * 4 - 4 = 60");
        combinations.put(68,"4 + 4 * 4 * 4 = 68");
        combinations.put(256,"4 * 4 * 4 * 4 = 256");

        for(int i = 0; i < m; i++) {
            int n = Integer.parseInt(reader.readLine());
            String combination = combinations.get(n);
            if(combination == null) {
                System.out.println("no solution");
            } else {
                System.out.println(combination);
            }
        }
    }
}
