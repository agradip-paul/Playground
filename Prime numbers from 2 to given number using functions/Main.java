import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	    Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
	   
	    for(int i = 2; i <= num; i++)
	    {
	        if(is_prime(i))
	        {
	            System.out.println(i);
	        }
	    }
	    
	}
	public static boolean is_prime(int num)
	{
	    boolean isprime = true;
	    for(int n = 2; n <= num / 2; n ++)
	    {
	        if(num % n == 0)
	        {
	            isprime = false;
	            break;
	        }
	    }
	    return isprime;
	}
}