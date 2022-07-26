#include<stdio.h>

int main()
{
    
    int i,n,table=1;
    printf("Enter any number : ");
    scanf("%d",&n);
    printf("Table of  %d \n",n);
    for(i=1;i<=10;i++)
{
    table=n*i;
    printf("%d",table);
}
return 0;
}