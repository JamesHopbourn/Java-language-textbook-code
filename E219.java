public class E219 {
  public static void main(String args[]) {
    int num[][] = new int[3][5];
    int i, j;
    for (i = 0; i < 3; i++)
      for (j = 0; j < 5; j++)
        num[i][j] = i * 5 + j + 1;

    System.out.println("二维数组 num 各元素值为");
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 5; j++)
        System.out.print(num[i][j] + " ");
      System.out.println();
    }
  }
}
