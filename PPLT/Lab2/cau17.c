#include<stdio.h>  
#include<math.h>
int main()
{
	int m, n , p, q, last, ans;    
	printf("Enter a number:");    
	scanf("%d",&n); 
	
	while(n < 1) 
{
		printf("The input isn't correct, enter it again: ");
		scanf("%d",&n);
}
		for(p = 1;p <= n;p++)
{
		int q;
		int count = 0;
        for(q = 1;q < p;q++)
{
            if(p%q==0)
{
                count += q;
}}
		if (count == p)
{
		    printf("%d ", p);
}}
		return 0;
}