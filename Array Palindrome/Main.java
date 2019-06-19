import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code 
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      for(int i = 0; i < size; i ++)
      {
        arr[i] = in.nextInt();
      }
      int front = 0;
      int end = size - 1;
      int is_palindrome = 1;
      while(front <= end)
      {
        if(arr[front] != arr[end])
        {
          is_palindrome = 0;
          break;
        }
        front ++;
        end --;
      }
      if(is_palindrome == 1)
        System.out.print("Yes");
      else
         System.out.print("No");
    }
}