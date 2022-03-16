import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);

        long date = 1000*60*60;
        Date d2 = new Date(date);
        System.out.println(d2);

        // 获取 timestamp
        System.out.println("timestamp: " + d1.getTime());
        System.out.println("timestamp: " + d1.getTime() * 1.0 /1000/60/60/24/365);

        // 设置日期
        long time = 1000*60*60*24;
        d1.setTime(time);
        System.out.println(d1.getTime());
    }
}
