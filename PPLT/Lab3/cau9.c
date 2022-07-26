#include <stdio.h>
#include <math.h>
int swap(int);
void main()
{
int num;
printf("Nhap so N");
scanf("%d",&num);
printf("swap number: %d",swap(num));
}
int swap(int n)
{
	int temp,last,count,first,s;
	temp = n;
    last = temp % 10;
    count = (int)log10(temp);
 
    while(temp>=10)
    {
        temp /= 10;
    }
    first = temp;
    s = (last * pow(10, count) + first) + (n - (first * pow(10, count) + last));
	return s;
}