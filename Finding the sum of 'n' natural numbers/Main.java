import java.util.Scanner;
class Main
{
  public static int sum(int num)
  {
    if(num != 0)
      return num + sum(num - 1);
    else
      return 0;
  }
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    System.out.print(sum(num));
  }
}