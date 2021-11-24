import java.util.Calendar;
import java.util.Scanner;

class myDate {
  public int year = 2020;
  public int month =1;
  public int day = 1;

  myDate() {
    Calendar cal = Calendar.getInstance();
    this.year = cal.get(Calendar.YEAR);
    this.month = cal.get(Calendar.MONTH) + 1;
    this.day = cal.get(Calendar.DATE);
  }

  myDate(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public void printInfo() {
    System.out.println(year + "-" + month + "-" + day);
  }
}

public class Test2 {
  public static void main(String[] args) {
    System.out.println("胡金栋 202012900312 软工203");
    System.out.println("依次输入日期，代表年月日：");
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    int month = sc.nextInt();
    int day = sc.nextInt();
    myDate myDate1 = new myDate(year, month, day);
    myDate myDate2 = new myDate();
    myDate1.printInfo();
    myDate2.printInfo();
  }
}
