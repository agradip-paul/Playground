#include<stdio.h>
int main()
{
  int num,f_digit,sl_digit;
  scanf("%d",&num);
  f_digit = num/10;
  sl_digit = f_digit%10;
  printf("%d",sl_digit);
  
  return 0;
}