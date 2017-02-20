import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class spavanac {
    public static void main(String[] args) throws IOException, ParseException {
        new spavanac();
    }

    private spavanac() throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat dateFormat = new SimpleDateFormat("H m");
        Date date = dateFormat.parse(reader.readLine());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, -45);
        System.out.println(dateFormat.format(calendar.getTime()));
    }
}
