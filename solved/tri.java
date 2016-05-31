import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class tri {
    public static void main(String[] args) throws IOException {
        new tri();
    }

    private tri() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        if(a==b+c) {
            System.out.println(a + "=" + b + "+" + c);
        } else if(a+b==c) {
            System.out.println(a + "+" + b + "=" + c);
        } else if(a==b-c) {
            System.out.println(a + "=" + b + "-" + c);
        } else if(a-b==c) {
            System.out.println(a + "-" + b + "=" + c);
        } else if(a==b*c) {
            System.out.println(a + "=" + b + "*" + c);
        } else if(a*b==c) {
            System.out.println(a + "*" + b + "=" + c);
        } else if(a==b/c) {
            System.out.println(a + "=" + b + "/" + c);
        } else if(a/b==c) {
            System.out.println(a + "/" + b + "=" + c);
        }
    }
}
