import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int row_size = in.nextInt();
    int col_size = in.nextInt();
    int matrix[][] = new int[row_size][col_size];
    for(int i = 0; i < row_size; i ++)
    {
      for(int j = 0; j < col_size; j ++)
      {
        matrix[i][j] = in.nextInt();
      }
    }
    int i, j, k;
     for(i = 0; i < col_size; i ++)
    {
      for(j = 0, k = i; k < col_size; j ++, k ++)
      {
        System.out.print(matrix[j][k] + " ");
      }
    }
  }
}