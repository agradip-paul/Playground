/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
void determination(int size, int arr[])
{
  int batch_1_sum = 0, batch_2_sum = 0;
  for(int index = 0; index < size / 2; index ++)
  {
    batch_1_sum = batch_1_sum + arr[index];
  }
  for(int index = size / 2; index < size; index ++)
  {
    batch_2_sum = batch_2_sum + arr[index];
  }
  if(batch_1_sum == batch_2_sum)
    printf("Perfect Batch");
  else
    printf("Not a Perfect Batch");
}
int main()
{
  //Type your code here
  int size;
  scanf("%d", &size);
  int arr[size];
  for(int index = 0; index < size; index ++)
  {
    scanf("%d", &arr[index]);
  }
  determination(size, arr);
  return 0;
}