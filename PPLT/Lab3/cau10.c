#include<stdio.h>
int changenumber(int);
int main()
{
	int num;
    printf("Enter N:");
    scanf("%d",&num);
    printf("Change number%d",changenumber(num));
	return 0;
}
int changenumber(int n)
{
	int t, f=0;
	while(n>0)
	{
		t=n%10;
		f=f*10+t;
		n=n/10;
	}
	return f;
}