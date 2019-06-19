#include<stdio.h>
int main()
{
  //Type your code here
  int row_size, col_size;
  scanf("%d %d", &row_size, &col_size);
  int matrix[row_size][col_size];
  for(int i = 0; i < row_size; i ++)
  {
    for(int j = 0; j < col_size; j ++)
    {
      scanf("%d", &matrix[i][j]);
    }
  }
   for(int i = 0; i < col_size; i ++)
  {
    for(int j = 0; j < row_size; j ++)
    {
      printf("%d ", matrix[j][i]);
    }
     printf("\n");
  }
  return 0;
}