public class c2001{
  public static int solve(int N) {
    int temp,sum = 0;
    if (N < 10) return N;
    // 数字分离相加
    while(N != 0){
      temp = N%10;
      sum += temp;
      N = (N-temp)/10;
    }
    // 必须是 >= 否则遇到 10 就错误了
    if(sum >= 10) return solve(sum);
    return sum;
  }

  public static void main(String[] args) {
    int N = 1234567890;
    int result = solve(N);
    System.out.print(result);
  }
}
