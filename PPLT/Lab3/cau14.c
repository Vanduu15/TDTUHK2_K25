#include<stdio.h>
#include<math.h>
void checkPerfect(int);
int main()
{
	int num;
	printf("Enter n:");
	scanf("%d",&num);
	checkPerfect(num);
	return 0;
}
void checkPerfect(int n)
{
	int i;
	int s=0;
	for (i=1;i<n;i++)
	{
		if (n%i==0)
		{
			s=s+i;
		}
	}
	if(s==n)
	{
		printf("Perfect number");
	}
	else
	{
		printf("not Perfect number");
	}
}