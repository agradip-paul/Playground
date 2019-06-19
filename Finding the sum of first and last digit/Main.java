#include <stdio.h>
int main() {
	//Type your code
  int num, l_digit, sum = 0;
  scanf("%d", &num);
  l_digit = num % 10;
  while(num >= 10)
  {
    num = num / 10;
  }
  int f_digit = num;
  sum = f_digit + l_digit;
  printf("%d", sum);
	return 0;
}