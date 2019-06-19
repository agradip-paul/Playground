#include<stdio.h>
int main()
{
  //Type your code here
  int row_size, col_size;
  scanf("%d %d", &row_size, &col_size);
  int matrix_1[row_size][col_size];
  int matrix_2[row_size][col_size];
  for(int i = 0; i < row_size; i ++)
  {
    for(int j = 0; j < col_size; j ++)
    {
      scanf("%d", &matrix_1[i][j]);
    }
  }
   for(int i = 0; i < row_size; i ++)
  {
    for(int j = 0; j < col_size; j ++)
    {
      scanf("%d", &matrix_2[i][j]);
    }
  }
  for(int i = 0; i < row_size; i ++)
  {
    for(int j = 0; j < col_size; j ++)
    {
      printf("%d ", matrix_1[i][j] - matrix_2[i][j]);
    }
    printf("\n");
  }
}