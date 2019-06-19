#include <stdio.h>
int main(){
	int num, i, j, sum = 0;
    scanf("%d", &num);
    for(i = 1; i <= num; i++)
    {
      for(j = 1; j <= i; j++)
      {
        sum = sum + 1;
        if (sum % 2 == 0)
          printf("#");
        else
          printf("*");
      }
      printf("\n");
    }
    
  	return 0;
}