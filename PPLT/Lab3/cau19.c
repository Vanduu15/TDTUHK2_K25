#include<stdio.h>
int ans(int);
int main()
{
	int num;
	printf("Enter n: ");
	scanf("%d",&num);
	while (num<0)
	{
		printf("Enter the valid number :");
		scanf("%d",&num);
	}
	printf("ans %d la %d",num,ans(num));
return 0;
}
int ans(int n)
{
	int i;
	int s=1;
	for (i=1;i<=n;i++)
	{
		s=s*i;
	}	
	return s;
}