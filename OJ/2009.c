#include <stdio.h>
#include <math.h>

int isPrime(int N){
  if (N < 2) return 0;
  for (int i = 2; i < N; i++)
    if (N%i == 0) return 0;
  return 1;
}

int split(int N){
  int temp;
  temp = N%10;
  return (N-temp)/10;
}

int main(int argc, char const *argv[])
{
  int N,temp,flag;
  scanf("%d", &N);
  for (int i = pow(10,N-1); i < pow(10,N); i++)
  {
    if (isPrime(i))
    {
      flag = 1;
      temp = i;
      while(temp > 10 && flag == 1){
        temp = split(temp);
        if(!isPrime(temp)) flag = 0;
      };
      if(flag) printf("%d\n", i);
    }
  }
  return 0;
}