import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here
    Scanner in = new Scanner(System.in);
    int row_size = in.nextInt();
    int col_size = in.nextInt();
    int mat_1[][] = new int[row_size][col_size];
    int flag = 0;
    for(int i = 0; i < row_size; i ++)
    {
      for(int j = 0; j < col_size; j ++)
      {
        mat_1[i][j] = in.nextInt();
      }
    }
    int mat_2[][] = new int[row_size][col_size];
    for(int i = 0; i < row_size; i ++)
    {
      for(int j = 0; j < col_size; j ++)
      {
        mat_2[i][j] = in.nextInt();
      }
    }
    for(int i = 0; i < row_size; i ++)
    {
      for(int j = 0; j < col_size; j ++)
      {
        if(mat_1[i][j] != mat_2[i][j]) 
        {
          flag = 1;
          break;
        }
      }
    }
    if(flag == 0)
      System.out.print("Yes");
    else
      System.out.print("No");
  }
}