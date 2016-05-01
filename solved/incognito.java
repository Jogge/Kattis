import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

class incognito {
    public static void main(String[] args) throws IOException {
        new incognito();
    }

    private incognito() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(reader.readLine());

        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(reader.readLine());

            HashMap<String, AtomicInteger> attribute = new HashMap<>();

            for(int j = 0; j < n; j++) {
                String[] input = reader.readLine().split(" ");
                if(attribute.containsKey(input[1])) {
                    attribute.get(input[1]).incrementAndGet();
                } else {
                    attribute.put(input[1], new AtomicInteger(1));
                }
            }

            int sum = 0;

            for(AtomicInteger value : attribute.values()) {
                sum += value.get() + (value.get() * sum);
            }

            System.out.println(sum);
        }
    }
}