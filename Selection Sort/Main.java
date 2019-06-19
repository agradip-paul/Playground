#include <stdio.h>
void selection_sort(int arr[], int size)
{
  int temp, min;
  for(int j = 0; j < size; j ++)
  {
    min = j;
    for(int k = j + 1; k < size; k ++)
    {
      if(arr[k] < arr[min])
      {
        min = k;
      }
    }
    temp = arr[min];
    arr[min] = arr[j];
    arr[j] = temp;
    
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
  selection_sort(arr, size);
   return 0;
}

