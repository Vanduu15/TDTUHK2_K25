#include<stdio.h>
#include<math.h>

int cau6(int n);
void main()
{
	int n;
    printf("Enter the number:");    
    scanf("%d",&n);
    printf("Sum is=%d",cau6(n));
}

int cau6(int n)
{   int m;
    int sum=0;
    while(n>0)    
{    
    m=n%10;    
    sum=sum+m;    
    n=n/10;    
}    
    return sum;
}