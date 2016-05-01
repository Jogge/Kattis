import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class reversebinary {
    public static void main(String[] args) throws IOException {
        new reversebinary();
    }

    private reversebinary() throws IOException {
        System.out.println(Integer.parseInt(new StringBuilder(Integer.toBinaryString(new Integer(new BufferedReader(new InputStreamReader(System.in)).readLine()))).reverse().toString(), 2));
    }
}
