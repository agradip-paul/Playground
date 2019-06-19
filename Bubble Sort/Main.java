#include <stdio.h>
void bubble_sort(int arr[], int size)
{
  int temp;
  for(int j = size - 1; j >= 0; j --)
  {
    for(int k = 0; k < j; k ++)
    {
      if(arr[k] > arr[k + 1])
      {
        temp = arr[k];
        arr[k] = arr[k + 1];
        arr[k + 1] = temp;
      }
    }
  }
  for(int i = 0; i < size; i ++)
  {
    printf("%d\n", arr[i]);
  }
}
int main()
{
   // Try out your code here
  int size;
  scanf("%d", &size);
  int arr[size];
  for(int i = 0; i < size; i ++)
  {
    scanf("%d", &arr[i]);
  }
  bubble_sort(arr, size);
   return 0;
}