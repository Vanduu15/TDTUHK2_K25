#include <stdio.h>

int main()
{
    int i, n, count = 0;
    do
{
    printf("Enter the number to check prime:");    
    scanf("%d",&n);    

    if(n<=0)
{
        printf("Enter the number to check prime:: ");
}}

    while (n<=0);
{
       for(i=2; i<n; i++)
    {
        if(n%i==0)
        count++;
    }
    if(n%i!=0)
    {
        printf("Not a Prime number\n");
    }else
    {
        printf("Prime number\n");
    }
    return 0;
}}