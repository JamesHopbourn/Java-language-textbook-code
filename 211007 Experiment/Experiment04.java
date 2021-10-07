import java.lang.Math;
import java.util.Scanner;

public class Experiment04 {
  public static void main(String[] args) {
    System.out.println("班级 名字 学号");
    System.out.print("请输入 n 的值：");
    Scanner text = new Scanner(System.in);
    int n = text.nextInt();
    int count = 0;
    for (int i = 2; i < n; i++) {
      for (int j = 2; j <= i; j++) {
        if (i == j) {
            System.out.print(i + "\t");
            count++;
            if (count %5 == 0)
              System.out.println();
        } else if (i % j == 0) {
            break;
        }
      }
    }
  }
}

