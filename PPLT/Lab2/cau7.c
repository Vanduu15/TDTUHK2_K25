#include<stdio.h>
int main()
{
    int n, lastD, product = 1;
    printf("Enter a number: ");
    scanf("%d", &n);
    while(n != 0)
{
        lastD = n % 10; 
        product *= lastD;
        n /=  10;  
}
    printf("%d", product);
    return 0;
}