import java.util.Calendar;
import java.util.Scanner;

public class CalenderFebruary {
    public static void main(String[] args) {
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入要查询的年份：");
            int year = sc.nextInt();

            Calendar cal = Calendar.getInstance();
            cal.set(year, 2, 1);
            cal.add(Calendar.DATE, -1);

            System.out.println(cal.get(Calendar.DATE));
        }
    }
}
