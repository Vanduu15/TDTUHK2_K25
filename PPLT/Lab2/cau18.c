#include <stdio.h>
#include <math.h>
int main()
{
	int n, last, bientam, ans;
	printf("Enter a decimal number: ");
	scanf("%d", &n);
	
	bientam = 1;
	ans = 0;
	while (n != 0)
{
		last = n % 2;
		ans += last*bientam;
		bientam *= 10;
		n = n / 2;
}
	printf("Binary number is %d",ans);
	
	return 0;
}