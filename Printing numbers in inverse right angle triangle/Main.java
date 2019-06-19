import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int val = num;
      for(int row = 1; row <= num; row ++)
      {
        for(int col = val; col >= 1; col --)
        {
          System.out.print(col);
        }
        System.out.print("\n");
        val --;
      }
	}
}