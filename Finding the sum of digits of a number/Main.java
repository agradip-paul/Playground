#include <stdio.h>
int main() {
	//Type your code
  int num, sum = 0;
  scanf("%d", &num);
  while(num != 0)
  {
    int rem = num % 10;
    sum = sum + rem;
    num = num / 10;
  }
  printf("%d", sum);
	return 0;
}