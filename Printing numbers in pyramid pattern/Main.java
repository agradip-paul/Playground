import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	  Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int val = 0;
      for(int row = 1; row <= num; row ++)
      {
        for(int space = 1; space <= num - row; space ++)
        {
          System.out.print(" ");
        }
        for(int col = 1; col <= row; col ++)
        {
          val = val + 1;
          System.out.print(val + " ");
        }
        System.out.print("\n");
      }
	}
}