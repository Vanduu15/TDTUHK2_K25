#include<stdio.h> 
#include<math.h>

int main()   
{   
    int i, n, s = 0 ;   
  
    printf("\n Enter the number \n") ;   
    scanf("%d", &n) ;   
 
    for(i = 1 ; i<n ; i++)   
{   
    if(n%i == 0)   
    s = s + i ;   
}    

    if (s == n)   
{       
       printf("\n %d is a Perfect Number", n) ;   
}
    else 
{
        printf("\n%d is not the Perfect Number", n) ;   
}
    return 0;   
}