#include<stdio.h>
int main() {
    // Type your code here
  int sum_of_number(int num)
  {
    int sum = 0;
    for(int i =1; i <= num; i++)
    {
      sum = sum + i;
    }
    return sum;
  }
  int number;
  scanf("%d", &number);
  int result = sum_of_number(number);
  printf("%d", result);
  	return 0;
}