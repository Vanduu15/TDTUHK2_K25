#include <stdio.h>
#include <math.h>
 
int main()
{
  	int Number, FirstDigit, DigitsCount, LastDigit,  SwapNum;
 
  	printf("\n Please Enter any Number: ");
  	scanf("%d", & Number);
  	
  	DigitsCount = log10(Number); 	
  	FirstDigit = Number / pow(10, DigitsCount);
  	
  	LastDigit = Number % 10;
  	
  	SwapNum = LastDigit;
  	SwapNum = SwapNum  * (round(pow(10, DigitsCount)));
  	SwapNum = SwapNum + Number % (int)(round(pow(10, DigitsCount)));
  	SwapNum = SwapNum - LastDigit;
  	SwapNum = SwapNum + FirstDigit;
	    
	printf(" \n The Number after Swapping First Digit and Last Digit =  %d", SwapNum);
 
  	return 0;
}