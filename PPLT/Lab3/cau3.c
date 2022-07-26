#include<stdio.h>
#include<math.h>

int table(int n);
void main()
{
	int n;
	
	printf("Nhap vao n: ");
	scanf("%d", &n);
	
	table(n);
	
}
int table(int n)
{
	int table = 0;
	int i;
	for (i = 1; i <= 10; i ++)
	{
		table = n * i;
		printf("%d * %i = %d\n", n, i, table);
	}
	return table;
}