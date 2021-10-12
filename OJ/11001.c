#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
  int num,temp;
  scanf("%d", &num);
  int a[num];
  for (int i = 0; i < num; i++)
    scanf("%d", &a[i]);
  
  for (int i = 0; i < num - 1; i++) {
    for (int j = 0; j < num - 1 - i; j++) {
      if (abs(a[j]) < abs(a[j+1])) {
        temp = a[j+1];
        a[j+1] = a[j];
        a[j] = temp;
      }
    }
  }

  for (int i = 0; i < num; i++)
    printf("%d ", a[i]);
  return 0;
}