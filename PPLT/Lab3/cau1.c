#include<stdio.h>
#include<math.h>

int tong(int n);
void main()
{
    int n;
    printf(" Enter n:");
    scanf("%d", &n);
    tong(n);
    printf("\nKQ is: %d", tong(n));
}

int tong(int n)
{
    int s = 0;
    int i;
    while(n<0)
    {
        printf("Enter a valid number\n");
        scanf("%d",&n);
    }
    for (i=1;i<=n;i++)
     {
        if( i % 2 == 0)
        {
           s = s + i;
        }
     }
    return s;
}
