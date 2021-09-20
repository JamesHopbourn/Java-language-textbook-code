public class E218 {
  public static void main(String args[]) {
    int a[] = new int[10];
    float x[] = {2.5F, 6F, 9F, -13.7F};
    int i;
    int len = x.length;

    System.out.print("数组 x 各元素值为：");
    for (i = 0; i < len; i++)
      System.out.print(x[i] + " ");
    for (i = 0; i < 10; i++)
      a[i] = i + 1;
    System.out.println();

    System.out.print("数组 a 各元素值为：");
    for (i = 0; i < 10; i++)
      System.out.print(a[i] + " ");
    System.out.println();
  }
}
