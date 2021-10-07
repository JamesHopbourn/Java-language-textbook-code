import java.util.Scanner;

public class Experiment03 {
  public static void main(String[] args) {
    int i, j, k; // i 是行数，j 是空格个数，k 是星星个数
    System.out.println("班级 名字 学号");
    System.out.print("请输入 n 的值：");
    Scanner text = new Scanner(System.in);
    int n = text.nextInt();
    for (i = n-1 ; i >= 0 ; i--) {
      for (j = 0 ; j  < i ; j++)   // 打印前置空格
        System.out.print(" ");
      for (k = 0 ; k < n-j ; k++) // 打印文字星号
        System.out.print("*");  
      System.out.println();
    }
  }
}