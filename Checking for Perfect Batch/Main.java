import java.util.Scanner;
class Main
{
  public static void batch_3(int size, int arr[])
  {
    int sum_1 = 0, sum_2 = 0;
    for(int index = 0; index < (size / 2) + 1; index ++)
    {
       sum_1 = sum_1 + arr[index];
    }
    for(int index = size / 2; index < size; index ++)
    {
       sum_2 = sum_2 + arr[index];
    }
    if(sum_1 == sum_2)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch"); 
  }
  
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int arr[] = new int[size];
    for(int index = 0; index < size; index ++)
    {
      arr[index] = in.nextInt();
    }
    batch_3(size, arr);
  }
}