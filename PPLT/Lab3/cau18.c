#include<stdio.h>
int binary(int);
int main()
{
	int num;
	printf("Enter n ");
	scanf("%d",&num);
	printf("Binary is %d",binary(num));
	return 0;
}
int binary(int n)
{
	int a,b=1,c=0;
	while(n>0)
	{
		a=n%2;
		n=n/2;
		c=c+a*b;
		b=b*10;
	}
	return c;
}