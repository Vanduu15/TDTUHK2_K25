#include<stdio.h> 
#include<math.h>

int main()    
{    
    int n,r,sum=0,value;    
    printf("Enter number = ");    
    scanf("%d",&n);    
    value=n;    
    while(n>0)    
{    
    r=n%10;    
    sum=sum+pow(r,3);    
    n=n/10;    
}    
    if(value==sum)    
    printf("Value is armstrong number ");    
    else    
    printf("Value is not armstrong number");    
    return 0;  
}   