import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    while(num != 0)
    {
      int rem = num % 10;
      System.out.print(rem);
      num = num / 10;
    }
  }
}