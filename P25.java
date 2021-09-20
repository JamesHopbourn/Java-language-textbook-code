public class P25 {
  public static void main(String args[]) {
    int i, j, sum = 0;
    int a[][] = new int[6][6]; // 实际是0-5
    for (i = 0; i < 6; i++) {
      for (j = 0; j < 6; j++) {
        a[i][j] = i * 5 + j + 1;
      }
    }

    for (i = 0; i < 6; i++) {
      for (j = 0; j < 6; j++) {
        System.out.print(a[i][j] + "\t");
      }
      System.out.println();
    }

    for (i = 0; i < 6; i++) {
      sum = sum + a[i][i];
      j = 5 - i;
      sum = sum + a[i][i];
    }
    System.out.println(sum);

    // 左边两条对角线
    for (i = 0; i < 5; i++) {
      sum = sum + a[i][i + 1];
      sum = sum + a[i + 1][i];
    }
    System.out.println(sum);

    // 右边上对角线
    for (i = 0; i <= 2; i++) {
      sum = sum + a[i][4 - i];
      sum = sum + a[4 - i][i];
    }
    sum = sum - a[2][2];
    System.out.println(sum);
  }
}
