import java.util.Scanner;

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
