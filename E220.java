import java.util.Scanner;

public class E220 {
  public static void main(String args[]) {
    int a[] = {21, 13, 52, 0, -15, 16, 18, 1, 6, 2, -20, 17, 9, 23, 8};
    int i, num, num_at = 0;
    boolean bool = false;

    System.out.print("数组各元素值为：");
    for (i = 0; i < a.length; i++)
      System.out.print(a[i] + " ");
    System.out.println();

    System.out.print("请输入待查找的数字：");
    Scanner scanner = new Scanner(System.in);
    num = scanner.nextInt();

    for (i = 0; i < a.length; i++) {
      if (a[i] == num) {
        bool = true;
        num_at = i;
        break;
      }
    }
    if (bool)
      System.out.print(num + " 找到了，所在数组下标为" + num_at);
    else
      System.out.print(num + " 未找到");
  }
}
