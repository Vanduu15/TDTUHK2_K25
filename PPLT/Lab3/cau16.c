#include<stdio.h>
#include<math.h>
int Armstrong(int);
int main ()
{
	int num;
	printf("Enter n:");
	scanf("%d",&num);
	while (num<0)
	{
		printf("Enter the valid number :");
		scanf("%d",&num);
	}
	int i;
for (i=1;i<=num;i++)
{
	if (Armstrong(i)==1)
	{
		printf("%d\n",i);
	}
}
	return 0;
}
int Armstrong(int n)
	{
	int t,b;
	int dem=0;
	int a=0;
	t=n;
	while (t >0)
	{
		t=t/10;
		dem=dem+1;
	}
	t=n;
	while (t>0)
	{
		b=t%10;
		a= a + pow(b,dem);
		t=t/10;
	}
	if (n==a)
	{
		return 1;
	}
	else
	{
		return 0;
	}
	}