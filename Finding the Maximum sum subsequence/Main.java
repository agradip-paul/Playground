import java.util.Scanner;
class Main
{
  public static int max_sum(int size, int arr[])
  {
    int running_sum = arr[0];
    int max_sum = 0;
    for(int i = 1; i < size; i ++)
    {
      if(arr[i] > arr[i - 1])
      {
        running_sum += arr[i];
      }
      else
      {
        running_sum = arr[i];
      }
    }
    if(max_sum < running_sum)
    {
      max_sum = running_sum;
    }
    return max_sum;
  }
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int arr[] = new int[size];
    for(int i = 0; i < size; i ++)
    {
      arr[i] = in.nextInt();
    }
    System.out.print(max_sum(size, arr));
  }
}