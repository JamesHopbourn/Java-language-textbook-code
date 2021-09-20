import java.util.Scanner;

public class P24 {
  public static void main(String args[]) {
    int i, min, max;
    int a[] = new int[10];
    Scanner scanner = new Scanner(System.in);
    for (i = 0; i < 10; i++) {
      a[i] = scanner.nextInt();
    }

    min = a[0];
    max = a[0];

    for (i = 0; i < 10; i++) {
      min = min < a[i] ? min : a[i];
      max = max > a[i] ? max : a[i];
    }
    System.out.println("最小值是：" + min);
    System.out.println("最大值是：" + max);
  }
}
