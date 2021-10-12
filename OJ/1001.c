#include <stdio.h>

int main(int argc, char const *argv[])
{
  int row,subject,column,count;
  scanf("%d %d", &row, &subject);
  column = subject + 2;
  int a[row][column];
  for (int i = 0; i < row; i++)
    for (int j = 0; j < column; j++)
      scanf("%d", &a[i][j]);

  for (int i = 0; i < row; ++i)
  {
    // 检查平均分
    int aver = a[i][0] + a[i][1] + a[i][2];
    aver = (aver/subject);
    if (aver != a[i][3]){
      count++;
      continue;
    }

    // 检查单科分
    for (int j = 0; j < subject; j++)
      if (a[i][j] > 100 || a[i][j] < 0) count++;
  }

  printf("%d",count);
  return 0;
}