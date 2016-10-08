import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class dicegame {
    public static void main(String[] args) throws IOException {
        new dicegame();
    }

    private dicegame() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int gunnar = Integer.parseInt(input[0]) + Integer.parseInt(input[1]) + Integer.parseInt(input[2]) + Integer.parseInt(input[3]);
        input = reader.readLine().split(" ");
        int emma = Integer.parseInt(input[0]) + Integer.parseInt(input[1]) + Integer.parseInt(input[2]) + Integer.parseInt(input[3]);
        if(emma < gunnar) {
            System.out.println("Gunnar");
        } else if(emma > gunnar) {
            System.out.println("Emma");
        } else if(emma == gunnar) {
            System.out.println("Tie");
        }
    }
}
