#include<stdio.h>

int main()
{
	
    int number1,number2;
    printf("Enter number1:");
    scanf("%d",&number1);
    printf("Enter number2:");
	scanf("%d",&number2);
	if (number1>number2)
{
		printf("The maximum between two numbers is : %d \n",number1);
}
	else 
{
		printf("The maximum between two numbers is : %d",number2);	
	    
}
	return 0;
}