import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int f_digit = num / 100;
      int l_digit = num % 10;
      int sum = f_digit + l_digit;
      System.out.println(sum);
	}
}