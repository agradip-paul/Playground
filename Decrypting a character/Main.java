import java.util.Scanner;
public class Main
{
    public static void main(String args[]) 
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      char alpha = in.next().charAt(0);
      int key = in.nextInt();
      if(alpha >= 'a' && alpha <= 'z')
      {
        alpha = (char) (alpha - key);
        if(alpha < 'a')
        {
          alpha = (char) (alpha + 26);
        }
      }
       else if(alpha >= 'A' && alpha <= 'Z')
      {
        alpha = (char) (alpha - key);
        if(alpha < 'A')
        {
          alpha = (char) (alpha + 26);
        }
      }
      System.out.println(alpha);
    }
}