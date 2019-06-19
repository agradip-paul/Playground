import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int k = in.nextInt();
      int arr[] = new int[size];
      for(int i = 0; i < size; i ++)
      {
        arr[i] = in.nextInt();
      }
      int freq[] = new int[k];
      for(int i = 0; i < k; i ++)
      {
        freq[i] = 0;
      }
      for(int i = 0; i < size; i ++)
      {
        freq[arr[i] - 1] ++;
      }
      for(int i = 0; i < k; i ++)
      {
        System.out.print(i + 1 + " " + freq[i]);
        System.out.println();
      }
    }
}