import java.util.Scanner;
class Main
{
  public static void insertion_sort(int size, int arr[])
{
  for(int idx1 = 1; idx1 < size / 2; idx1++)
  {
    int idx2 = idx1 - 1;
    int key = arr[idx1];
    while(idx2 >= 0 && arr[idx2] > key)
    {
      arr[idx2 + 1] = arr[idx2];
      idx2 --;
    }
    arr[idx2 + 1] = key;
  }
  for(int idx1 = size / 2; idx1 < size; idx1++)
  {
    int idx2 = idx1 - 1;
    int key = arr[idx1];
    while(idx2 >= size / 2 && arr[idx2] < key)
    {
      arr[idx2 + 1] = arr[idx2];
      idx2 --;
    }
    arr[idx2 + 1] = key;
  }
   for(int i = 0; i < size; i ++)
    {
      System.out.print(arr[i] + " ");
    }
}
  public static void main(String args[])
  {
    //type your code;
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int arr[] = new int[size];
    for(int i = 0; i < size; i ++)
    {
      arr[i] = in.nextInt();
    }
    insertion_sort(size, arr);
  }
}