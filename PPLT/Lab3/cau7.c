#include<stdio.h>
#include<math.h>
int cau7(int n);
void main()
{
	int n;
	printf("Enter n: ");
	scanf("%d", &n);
	printf("Ans = %d",cau7(n));
}
int cau7(int n)
{
	int product = 1;
	int last;
    while(n != 0)
    {
		last = n%10;
		product *= last;
		n = n / 10;
    }
    return product;
}