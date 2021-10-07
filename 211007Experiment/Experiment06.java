import java.lang.Math;
import java.util.Scanner;

public class Experiment06 {
  public static void main(String[] args) {
    System.out.println("班级 名字 学号");
    int x = 0, y = 0;
    Scanner text = new Scanner(System.in);
    do{
      System.out.print("请输入 x 的值：");
      x = text.nextInt();   
    }while(x != 1 && x != 10 && x != 20);
    if (x == 1)  y = x;
    if (x == 10) y = (int)Math.pow(x,2);
    if (x == 20) y = (int)Math.pow(x,3) + (int)Math.pow(x,2) + 1;
    System.out.print("y = " + y);
  }
}