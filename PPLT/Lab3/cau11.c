#include<stdio.h>
void checkpalindrome(int);
void main()
{
	int num;
	printf("Enter n:");
	scanf("%d",&num);
	checkpalindrome(num);
}
void checkpalindrome(int n)
{
	int t, f=0,b;
	b=n;
	while(b>0)
	{
		t=b%10;
		f=f*10+t;
		b=b/10;
	}
	if(f==n)
	{
		printf("Palindrome number");
	}
	else
	{
		printf("Not Palindrome Number");
	}
}