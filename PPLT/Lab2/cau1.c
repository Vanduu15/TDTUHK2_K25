#include <stdio.h>

int main()
{
    int i, n, sum=0;
    do
{
    printf("Enter number: ");
    scanf("%d",&n);
    if(n<=0)
{
        printf("Enter a valid number: ");
}}

    while (n<=0);
{
        for(i=2; i<=n; i+=2)
{
        sum += i;
}
        printf("Sum of all even number between 1 to %d = %d", n, sum);
}
    return 0;
}