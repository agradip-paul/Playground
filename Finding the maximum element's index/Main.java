import java.util.Scanner;
class Main
{
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
    int max_idx = 0;
    if(arr[0] > arr[1])
      max_idx = 0;
    else
      max_idx = 1;
    for(int index = 2; index < size; index ++)
    {
      if(arr[max_idx] < arr[index])
        max_idx = index;
    }
    System.out.println(max_idx);
  }
}