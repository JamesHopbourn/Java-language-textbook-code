import java.util.Scanner;

public class Experiment01 {
  public static void main(String[] args) {
    System.out.println("班级 名字 学号");
    System.out.print("请输入 x 的值：");
    Scanner text = new Scanner(System.in);
    double x = text.nextDouble();
    double y = 0; 
    if (x < 1)   y = x;
    else if (x <= 10) y = 3 * x - 1;
    else if (x > 10)  y = 4 * x + 2;
    System.out.print("y = " + y);
  }
}