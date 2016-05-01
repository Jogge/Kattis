import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class aaah {
    public static void main(String[] args) throws IOException {
        new aaah();
    }

    private aaah() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String JonMariusSays = reader.readLine();
        String DoctorWants = reader.readLine();
        if (JonMariusSays.length() >= DoctorWants.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}
