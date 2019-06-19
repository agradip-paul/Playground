import java.util.Scanner;
class Main
{
  public static int factorial(int num)
  {
    if(num != 0)
      return num * factorial(num - 1);
    else
      return 1;
  }
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    System.out.print(factorial(num));
  }
}