import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      while(num >= 100)
      {
         num = num / 10;
      }
      int second_digit = num % 10;
      System.out.println(second_digit);
    }
}