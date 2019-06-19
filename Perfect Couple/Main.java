import java.util.Scanner;
class Main
{
  public static void check_sum(int size, int arr[], int value)
  {
    for(int i = 0; i < size; i ++)
    {
      for(int j = i + 1; j < size; j ++)
      {
        if(value == arr[i] + arr[j])
        {
          System.out.println(arr[i] + ", " + arr[j]);
        }
      }
    }
  }
    public static void main(String args[]) 
    {
      // Type your code here
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      for(int index = 0; index < size; index ++)
      {
        arr[index] = in.nextInt();
      }
      int value = in.nextInt();
      check_sum(size, arr, value);
    }
}