import java.io.IOException;

class hello {
    public static void main(String[] args) throws IOException {
        new hello();
    }

    private hello() throws IOException {
        System.out.println("Hello World!");
    }
}