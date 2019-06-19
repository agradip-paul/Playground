import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int num = in.nextInt();
      int val = 0;
      for(int row = 1; row <= num; row ++)
      {
        for(int col = 1; col <= row; col ++)
        {
          val = val + 1;
          if(val % 2 == 1)
            System.out.print("*");
          else
            System.out.print("#");
        }
        System.out.print("\n");
      }
    }
}