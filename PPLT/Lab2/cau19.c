#include <stdio.h>
#include <math.h>
int main()
{
	int n, b;
	printf("Enter a number: ");
	scanf("%d", &n);
		
	while(n < 1) 
	{
		printf("The input isn't correct, enter it again: ");
		scanf("%d",&n);
	}
	
	int i;
	b = 1;
	for(i = 1; i <= n; i++)
{
		b = b * i;
}
	printf("The Factorial of %d is %d", n, b);
	
	return 0;
}