#include<stdio.h>
void checkPrime(int);
int main()
{
	int num;
	printf("Enter N:");
	scanf("%d",&num);
	checkPrime(num);
	return 0;
}
void checkPrime(int n)
{
	int i,x=0;
	for (i=2;i<=n/2;i++)
	{
		if (n%i==0)
		{
			printf("This is Prime");
			x=1;
			break;
		}
	}
	    if (n==1)
		{
			printf("This isn't Prime");
		}
		else if (x==0)
		{
			printf("Day la so Prime");
		}
		
}