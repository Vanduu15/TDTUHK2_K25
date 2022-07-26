#include<stdio.h>

int main()
{
  int n;

  printf("Enter a number: ");
  scanf("%d",&n);

  n=abs(n);
  printf("Absolute value = %d\n", n);

  return 0;
}