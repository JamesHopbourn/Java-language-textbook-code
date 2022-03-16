import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) throws ParseException {
        // Date to String
        System.out.println(
                new SimpleDateFormat("G y年M月d日 Z E H:m:s:S a").format(new Date())
        );

        // String to Date
        String date = "2021-08-02 12:12:12";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = sdf2.parse(date);
        System.out.println(dd);
    }
}