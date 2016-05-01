import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

class memory2 {
    public static void main(String[] args) throws IOException {
        new memory2();
    }


    private memory2() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double n = Integer.parseInt(reader.readLine());
        System.out.println(c(n,0));
    }

    private TreeMap<Integer, TreeMap<Integer, Double>> map = new TreeMap<>();

    private double c(double n, double f) {
        if(n == f) {
            return n;
        }

        if(n==0) {
            return 0;
        }

        if(!map.containsKey((int) n)) {
            map.put((int) n, new TreeMap<>());
        }

        if(map.get((int) n).containsKey((int) f)) {
            return map.get((int) n).get((int) f);
        }

        double result = 0;

        double subresult = f/(2*n-f);
        if(subresult > 0) result += subresult * (c(n-1,f-1)+1);

        subresult = (2*n-2*f)/(2*n-f)   * f / (n*2-f-1);
        if(subresult > 0) result += subresult * (c(n-1,f)+2);

        subresult = (2*n-2*f)/(2*n-f)   * 1 / (n*2-f-1);
        if(subresult > 0) result += subresult * (c(n-1,f)+1);

        subresult = (2*n-2*f)/(2*n-f)   * (2*n-f-1-f-1) / (n*2-f-1);
        if(subresult > 0) result += subresult * (c(n,f+2)+1);

        map.get((int) n).put((int) f, result);

        return result;
    }
}
