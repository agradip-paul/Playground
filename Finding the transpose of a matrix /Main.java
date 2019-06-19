import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // Type your code here
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
    int temp = row_size;
    row_size = col_size;
    col_size = temp;
     for(int i = 0; i < row_size; i ++)
    {
      for(int j = 0; j < col_size; j ++)
      {
        System.out.print(matrix[j][i] + " ");
      }
       System.out.println();
    }
  }
}