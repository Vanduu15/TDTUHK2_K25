#include<stdio.h>
#include<math.h>
void checkAmrstrong(int);
int main()
{
	int num;
	printf("Enter n:");
	scanf("%d",&num);
	checkAmrstrong(num);
	return 0;
}
void checkAmrstrong(int n)
{
	int t,dem,a,b;
	dem=0;
	a=0;
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
		printf("%d Armstrong number",n);
	}
	else
	{
		printf("%d not Armstrong number",n);
	}
}