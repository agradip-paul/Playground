import java.util.Scanner;
public class Main
{
  public static int gcd_of_two_numbers(int num_1, int num_2)
  {
    int min, hcf = 0;
    if(num_1 < num_2)
      min = num_1;
    else
      min = num_2;
    while(min >= 1)
    {
      if((num_1 % min == 0) && (num_2 % min == 0))
      {
        hcf = min;
        break;
      }
      min --;
    }
    return hcf;
  }
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int num_1 = in.nextInt();
      int num_2 = in.nextInt();
      int num_3 = in.nextInt();
      int result = gcd_of_two_numbers(num_1, num_2);
      System.out.print(gcd_of_two_numbers(result, num_3));
	}
}