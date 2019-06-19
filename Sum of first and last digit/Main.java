import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int l_digit = num % 10;
      while(num >= 10)
      {
        num = num / 10;
      }
      int f_digit = num;
      int sum = f_digit + l_digit;
      System.out.println(sum);
	}
}