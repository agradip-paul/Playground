import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	  Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      for(int row = 1; row <= num; row ++)
      {
        for(int space = 1; space <= num - row; space ++)
        {
          System.out.print(" ");
        }
        for(int col = 1; col <= 2 * row - 1; col ++)
        {
          System.out.print("*");
        }
        System.out.print("\n");
      }
	}
}