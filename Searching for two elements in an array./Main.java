#include<stdio.h>
int main()
{
  //Type your code here
  int arr_size;
  scanf("%d", &arr_size);
  int arr[arr_size];
  for(int index = 0; index < arr_size; index ++)
  {
    scanf("%d", &arr[index]);
  }
  int search_elem_1;
  scanf("%d", &search_elem_1);
  int search_elem_2;
  scanf("%d", &search_elem_2);
  int element_1_index = -1;
  int element_2_index = -1;
  for(int index = 0; index < arr_size; index ++)
  {
     if(search_elem_1 == arr[index])
       element_1_index = index;
    
     if(search_elem_2 == arr[index])
       element_2_index = index;
  }
  printf("%d\n", element_1_index);
  printf("%d", element_2_index);
  return 0;
}