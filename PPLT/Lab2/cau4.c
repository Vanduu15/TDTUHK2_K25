#include <stdio.h>

int main()
{
    int n, i, sum = 0;
    do
{
    printf("Enter a number: ");
    scanf("%d",&n);
    i = 1;

    if(n<=0)
{
        printf("Enter a valid number: ");
}
}

    while (n<=0);
{
       for (i = 1; i <= n; ++i) {
        sum += i;
    }

    printf("Sum = %d", sum);
    return 0;
}
}