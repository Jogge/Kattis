import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class heritage {

    public static void main(String[] args) throws IOException {
        new heritage();
    }

    private String name;
    private HashMap<String, BigInteger> calc = new HashMap<>();

    private heritage() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int n = Integer.parseInt(input.split(" ")[0]);
        name = input.split(" ")[1];
        TreeMap<String, BigInteger> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            input = reader.readLine();
            map.put(input.split(" ")[0], new BigInteger(input.split(" ")[1]));
        }

        BigInteger result = getNumber("", map);

        result = result.mod(new BigInteger("1000000007"));

        System.out.println(result.toString());

    }

    private BigInteger getNumber(String currentPrefix, TreeMap<String, BigInteger> map) {

        if(calc.containsKey(currentPrefix)) {
            return calc.get(currentPrefix);
        }

        BigInteger result = BigInteger.ZERO;

        char charValue = name.charAt(currentPrefix.length());
        String currentChar = String.valueOf(charValue);
        charValue++;
        String nextChar = String.valueOf(charValue);

        for (Map.Entry<String, BigInteger> entry : map.subMap(currentChar, nextChar).entrySet())
        {
            String prefix = currentPrefix + entry.getKey();
            if (name.startsWith(prefix)) {
                if (name.equals(prefix)) {
                    result = result.add(entry.getValue());
                } else {
                    result = result.add((entry.getValue()).multiply(getNumber(prefix, map)));
                }
            }
        }
        calc.put(currentPrefix, result);
        return result;
    }
}