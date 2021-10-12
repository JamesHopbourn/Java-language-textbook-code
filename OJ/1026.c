#include <stdio.h>

int GCD(int a, int b){
  if (b) while((a %= b) && (b %= a));
  return a + b;
}

int solve(int n, int k){
  int m = 1,temp = 0,count = 0;
  // 筛选质数 a
  for (int a = 2; a <= n; a++){
    // 筛选质数 b
    for (int b = 2; b <= n; b++){
      // 如果两数互质 && a < b
      if (GCD(a,b) == 1 && a < b){
        do{
          // 临时变量存储，防止 m++ 污染
          temp = a + m * k;
          if (b == temp) count++;
          m++;
        }while(b > temp);
        // m 恢复 1
        m = 1;
      }
    }
  }
  return count;
}

int main(int argc, char const *argv[])
{
  int n = 10,k = 2;
  //scanf("%d %d", &n, &k);
  printf("%d\n", solve(n,k));
  return 0;
}