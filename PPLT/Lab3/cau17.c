#include<stdio.h>
int checkPerfect(int);
int main()
{
	int num;
	printf("Enter n:");
	scanf("%d",&num);
	while(num<=0)
	{
		printf("Enter the valid number");
		scanf("%d",&num);
	}
	int i;
	for(i=1;i<=num;i++)
	{
		if(checkPerfect(i)==1)
		{
			printf("%d\n",i);
		}
	}
	return 0;
}
int checkPerfect(int n)
{
	int k,s=0;
	for(k=1;k<=n/2;k++)
	{
		if (n%k==0)
		{
			s=s+k;
		}
	}
	if(n==s)
	{
		return 1;
	}
}