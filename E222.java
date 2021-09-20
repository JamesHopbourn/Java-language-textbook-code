public class E222 {
  public static void main(String args[]) {
    int a[][] = new int[5][5];
    int i, j, temp;
    for (i = 0; i < 5; i++) {
      for (j = 0; j < 5; j++) {
        a[i][j] = i * 5 + j + 1;
      }
    }

    System.out.println("原始数组");
    for (i = 0; i < 5; i++) {
      for (j = 0; j < 5; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();

    for (i = 0; i < 5; i++) {
      for (j = 0; j < i; j++) {
        temp = a[i][j];
        a[i][j] = a[j][i];
        a[j][i] = temp;
      }
    }

    System.out.println("转置数组");
    for (i = 0; i < 5; i++) {
      for (j = 0; j < 5; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }
}
