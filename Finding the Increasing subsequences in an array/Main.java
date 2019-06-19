import java.util.Scanner;
class Main
{
  public static void increasing_sub(int size, int arr[])
  {
    for(int i = 0; i < size; i ++)
    {
      int key = arr[i];
      for(int j = i + 1; j < size; j ++)
      {
        if(key < arr[j])
          System.out.println(key + "," + arr[j]);
      }
    }
  }
  public static void main(String args[])
  {
    //your code here;
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int arr[] = new int[size];
    for(int i = 0; i < size; i ++)
    {
      arr[i] = in.nextInt();
    }
    increasing_sub(size, arr);
  }
}
