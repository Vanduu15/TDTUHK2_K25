#include<stdio.h>
int checkPrime(int);
int main ()
{
	int num,x;
	printf("Enter n: ");
	scanf("%d",&num);
	while (num<0)
	{
		printf("Enter the valid number :");
		scanf("%d",&num);
	}
	int i;
	for(i=1;i<=num;i++)
	{
		if (checkPrime(i)==1)
		{
			printf("%d\n",i);
		}
	}
}
int checkPrime(int n)
{
	int i,x=0;
	for (i=2;i<=n/2;i++)
	{
		if (n%i==0)
		{
			x=1;
			return 0;
		}
	}
	    if (n==1)
		{
			return 1;
		}
		else if (x==0)
		{
			return 1;
		}
		
}