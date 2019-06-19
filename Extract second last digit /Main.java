import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int f_digit = num / 10;
      int sl_digit = f_digit % 10;
      System.out.println(sl_digit);
	}
}