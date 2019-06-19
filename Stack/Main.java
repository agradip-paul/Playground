#include <stdio.h>
#include <stdlib.h>
#define MAX_SIZE 20
#include <string.h>
int *array;
int tos;
void destroy()
{
  free(array);
}
void init()
{
  array = malloc(MAX_SIZE * sizeof(int));
  tos = -1;
}
void push(int num)
{
  array[++tos] = num;
}
int pop()
{
  return array[tos--];
}
void print()
{
  for(int i = 0; i <= tos; i ++)
  {
    printf("%d ", array[i]);
  }
  printf("\n");
}
int main()
{
  int operation, x;
  scanf("%d", &operation);
  char command[10];
  init();
  for(int i = 0; i < operation; i ++)
  {
    scanf("%s", command);
    if(strcmp(command, "push") == 0)
    {
      scanf("%d", &x);
      push(x);
    }
    else if(strcmp(command, "pop") == 0)
    {
      printf("%d\n",pop());
    }
    else
    {
      print();
    }
  }
  destroy();
   return 0;
}