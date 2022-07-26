#include <stdio.h>
int cau8(int);
void main()
{
	int num;
	printf("Hay nhap so N: ");
	scanf("%d",&num);
	printf("So chu so la: %d",cau8(num));
}
int cau8(int n)
{
	int t,cau8=0;
	while(n>0)
	{
		t=n%10;
		cau8=cau8+1;
		n=n/10;
	}
	return cau8;
}