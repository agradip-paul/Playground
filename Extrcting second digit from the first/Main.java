#include <stdio.h>
int main() {
	//Type your code
  int num;
  scanf("%d", &num);
  while(num >= 100)
  {
    num = num / 10;
  }
  int second_digit = num % 10;
  printf("%d",second_digit);
	return 0;
}