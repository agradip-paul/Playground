import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int fact = 1, i = 1;
      while(i <= num)
      {
        fact = fact * i;
        i ++;
      }
      System.out.println(fact);
	}
}