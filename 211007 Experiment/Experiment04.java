import java.lang.Math;
import java.util.Scanner;

public class Experiment04 {
  public static void main(String[] args) {
    System.out.println("班级 名字 学号");
    System.out.print("请输入 x 的值：");
    Scanner text = new Scanner(System.in);
    int n = text.nextInt(), count = 0;

    for (int i = 2 ; i < n ; i++) {
      if (isPrime(i)){
        System.out.print(i + "\t");
        count++;
        if (count % 5 == 0) System.out.println();
      }
    }
  }

  public static boolean isPrime(int N) {
    if (N < 2) return false;
    for (int i  = 2 ; i <= Math.sqrt(N) ; i++)
      if (N % i == 0) return false;
    return true;
  }
}