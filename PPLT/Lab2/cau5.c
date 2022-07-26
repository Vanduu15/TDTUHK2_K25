#include <stdio.h>
#include <stdio.h>

int main()
{
    int n, firstD, lastD;
    
    printf("Enter any number: ");
    scanf("%d", &n);
    lastD = n%10; 
    while (n>=10)
{
	n/=10;
}	
	firstD = n; 
        

    printf("First digit = %d\n", firstD);
    printf("Last digit = %d\n", lastD);

    return 0;
     
}