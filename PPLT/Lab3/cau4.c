#include<stdio.h>
#include<math.h>
int tong(int n);
void main()
{
	int n;
	
	printf("Enter n: ");
	scanf("%d", &n);
	while(n<0)
	{ 
		printf("Enter a valid number: ");
		scanf("%d", &n);
	}
	printf("Ket qua = %d", tong(n));
	
}
int tong(int n)
{
	int sum = 0;
	int i;
	for (i = 1; i <= n; ++i) 
{
        sum += i;
}
	return sum;
}