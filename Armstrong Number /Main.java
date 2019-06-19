import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
	    int temp = num;
	    int digit_count = 0;
       
	    if(temp == 0){
	        System.out.print(num);
	    }
	    else{
	        while(temp != 0){
	            digit_count++;
	            temp = temp / 10;
	        }
	    }
	    
	    int sum = 0;
	    int pow = 1;
        temp = num;
           
	    while(temp != 0)
	    {
	        int rem = temp % 10;
	        for(int count = 1; count <= digit_count; count++)
            {
	            pow = pow * rem;
	        }
	        sum = sum  + pow;
	        pow = 1;
	        temp = temp / 10;
	    }
	    if(sum == num){
	        System.out.print("Armstrong Number");
	    }
	    else{
	        System.out.print("Not a Armstrong Number");
	    }
	}
}