public class P23 {
  public static void main(String args[]) {
    int i, j, num = 15;

    for (i = num; i > 0; i--) {
      for (j = 0; j < i; j++)
        System.out.print("* ");
      System.out.println();
    }

    System.out.println();

    // 行数计算
    for (i = num; i > 0; i--) {
      // 打印空格
      for (j = 0; j < num - i; j++)
        System.out.print("  ");
      // 打印星号
      for (j = 0; j < i; j++)
        System.out.print("* ");
      // 行末换行
      System.out.println();
    }
  }
}
