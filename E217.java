public class E217 {
  public static void main(String args[]) {
    int i, sum = 0;
    for (i = 1; i <= 100; i++) {
      if (i % 7 != 0)
        continue;
      sum = sum + i;
    }
    System.out.print("sum = " + sum);
  }
}
