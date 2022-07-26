#include<stdio.h>
#include<math.h>

int cau5(int n);
void main()
{
	int n;
	
	printf("Nhap vao n: ");
	scanf("%d", &n);
	cau5(n);
}
int cau5(int n)
{
	int last, first;
	last = n % 10;
    while(n >= 10)
    {
        n = n / 10;
    }
    first = n;
    return printf("First digit = %d and Last digit = %d", first,last);
}