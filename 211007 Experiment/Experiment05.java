import java.util.Scanner;

public class Experiment05 {
  public static void main(String[] args) {
    System.out.println("班级 名字 学号");
    System.out.print("请输入购买件数的值：");
    Scanner text = new Scanner(System.in);
    int x = text.nextInt();
    int UnitPrice = 100;
    double TotalPrice = 0;
    if (x <  10) TotalPrice = (x * UnitPrice) * 1.0;
    else if (x >= 10) TotalPrice = (x * UnitPrice) * 0.9;
    else if (x >= 30) TotalPrice = (x * UnitPrice) * 0.8;
    else if (x >= 50) TotalPrice = (x * UnitPrice) * 0.7;
    System.out.print("总价 = " + TotalPrice);
  }
}
