import java.util.Scanner;
class Main
{
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
      for(int index_1 = 0; index_1 < size - 1; index_1 ++)
     {
       for(int index_2 = index_1 + 1; index_2 < size; index_2 ++)
       {
         for(int index_3 = index_2 + 1; index_3 < size; index_3 ++)
         {
           System.out.print("(" + arr[index_1] + ", " + arr[index_2] + ", " + arr[index_3] + ")" + " ");
         }
       }
       System.out.println();
     }
    }
}