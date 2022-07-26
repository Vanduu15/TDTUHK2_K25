#include <stdio.h>

int main()
{
    int i, n, odd_sum = 0;
    do
{
    printf("Enter the value of n\n");
    scanf("%d", &n);
    if(n<=0)
{
        printf("Enter a valid number: ");
}
}

    while (n<=0);
{
        for (i = 1; i <= n; i++)
    {
        if (i % 2 == 1)
            odd_sum = odd_sum + i;
        
    }
    printf("Sum of all odd numbers  = %d\n", odd_sum);
    return 0;
}
}