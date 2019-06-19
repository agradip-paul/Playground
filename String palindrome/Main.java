#include<stdio.h>
int main()
{
  //Type your code here
  char str[20];
  scanf("%s", str);
  int len = strlen(str);
  int front = 0;
  int end = len - 1;
  int is_palindrome = 1;
  while(front <= end)
  {
    if(str[front] != str[end])
    {
      is_palindrome = 0;
      break;
    }
    front ++;
    end --;
  }
  if(is_palindrome == 1)
      printf("%s is a palindrome", str);
    else
      printf("%s is not a palindrome", str);
  return 0;
}