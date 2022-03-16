import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        // cal.get
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年" + month + "月" + day + "日");

        // cal.add
        cal.add(Calendar.YEAR, 1);
        System.out.println(cal.get(Calendar.YEAR));
        cal.add(Calendar.YEAR, -1);
        // 十年后的第五天
        cal.add(Calendar.YEAR, 10);
        cal.add(Calendar.DAY_OF_MONTH, 5);
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH) + 1;
        day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年" + month + "月" + day + "日");

        // cal.set
        cal.set(2012, 12, 27);
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH) + 1;
        day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年" + month + "月" + day + "日");
    }
}