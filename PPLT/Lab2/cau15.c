#include <stdio.h>
#include <math.h>
int main()
{
    int i,k,n;
    do
{
    printf("Enter the number till which you want prime numbers\n");
    scanf("%d",&n);   

    if(n<=0)
{
     printf("Enter the number till which you want prime numbers\n");
}}

    while (n<=0);
    for(i=2;i<=n;i++)
{
        int c=0;
        for(k=1;k<=i;k++)
{
            if(i%k==0)
{
                c++;
}
}
         
       if(c==2)
{
            printf("%d ",i);
}}
    return 0;
}