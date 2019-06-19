import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int index = 0; index < arr_size; index ++)
      {
        arr[index] = in.nextInt();
      }
      int search_element_1 = in.nextInt();
      int search_element_2 = in.nextInt();
      int element_1_index = -1;
      int element_2_index = -1;
      for(int index = 0; index < arr_size; index ++)
      {
        if(search_element_1 == arr[index])
        {
          element_1_index = index;
        }
        if(search_element_2 == arr[index])
        {
          element_2_index = index;
        }
      }
      System.out.println(element_1_index);
      System.out.println(element_2_index);
    }
}