import java.util.Scanner;
class Main
{
  public static int most_rep_elem(int size, int arr[], int freq[])
  {
    int count = 1;
    int max_count_idx = 0;
    for(int i = 0; i < size; i ++)
    {
      for(int j = i + 1; j < size; j ++)
      {
        if(arr[i] == arr[j])
        {
          count ++;
        }
      }
      freq[i] = count;
      count = 1;
    }
    for(int i = 0; i < size; i ++)
    {
      if(freq[i] > freq[max_count_idx])
      {
        max_count_idx = i;
      }
    }
    return arr[max_count_idx];
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
    int freq[] = new int[size];
    System.out.print(most_rep_elem(size, arr, freq));
  }
}