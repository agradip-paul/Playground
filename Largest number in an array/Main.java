#include<stdio.h>
int main()
{
  //fill the code
  int size;
  scanf("%d", &size);
  int arr[size];
  for(int index = 0; index < size; index ++)
  {
    scanf("%d", &arr[index]);
  }
  int max;
  if(arr[0] > arr[1])
    max = arr[0];
  else
    max = arr[1];
  for(int index = 2; index < size; index ++)
  {
    if(max < arr[index])
      max = arr[index];
  }
  printf("%d", max);
  return 0;
}