#include <stdio.h>
int main() 
{
    int n, reversed = 0, re, number;

    printf("Enter an integer: ");
    scanf("%d", &n);
    number = n;
    while (n != 0) {
    re = n % 10;
    reversed = reversed * 10 + re;
    n /= 10;
}
    if (number == reversed)
        printf("%d is a palindrome.", number);
    else
        printf("%d is not a palindrome.", number);

    return 0;
}