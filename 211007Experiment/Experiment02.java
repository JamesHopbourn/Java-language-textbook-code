import java.util.Scanner;

public class Experiment02 {
  public static void main(String[] args) {
    System.out.println("班级 名字 学号");
    System.out.print("请输入 x 的值：");
    Scanner text = new Scanner(System.in);
    int x = text.nextInt(),sum = 0;
    for (int i = 0 ; i <= x ; i++)
      sum += i;
    System.out.print("sum = " + sum);
  }
}