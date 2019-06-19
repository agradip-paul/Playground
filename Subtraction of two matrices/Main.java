import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner in = new Scanner(System.in);
    int row_size = in.nextInt();
    int col_size = in.nextInt();
    int matrix_1[][] = new int[row_size][col_size];
    for(int i = 0; i < row_size; i ++)
    {
       for(int j = 0; j < col_size; j ++)
       {
         matrix_1[i][j] = in.nextInt();
       }
    }
    
    int matrix_2[][] = new int[row_size][col_size];
    for(int i = 0; i < row_size; i ++)
    {
       for(int j = 0; j < col_size; j ++)
       {
         matrix_2[i][j] = in.nextInt();
       }
    }
    
    int sub[][] = new int[row_size][col_size];
    for(int i = 0; i < row_size; i ++)
    {
       for(int j = 0; j < col_size; j ++)
       {
         sub[i][j] = matrix_1[i][j] -  matrix_2[i][j];
       }
    }
    
     for(int i = 0; i < row_size; i ++)
    {
       for(int j = 0; j < col_size; j ++)
       {
         System.out.print(sub[i][j] + " ");
       }
       System.out.println();
    }
  }
}