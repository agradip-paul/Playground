import java.util.Scanner;
class Main
{
  public static int greatest_num(int num_1, int num_2)
  {
    int max;
    if(num_1 > num_2)
      max = num_1;
    else
      max = num_2;
    return max;
  }
	public static void main (String[] args)
    {
	  Scanner in = new Scanner(System.in);
      int num_1 = in.nextInt();
      int num_2 = in.nextInt();
      int num_3 = in.nextInt();
      int result = greatest_num(num_1, num_2);
      System.out.print(greatest_num(result, num_3));
	}
}