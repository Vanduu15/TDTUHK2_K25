#include<stdio.h>

 
int main() 
{
   int height, breadth, area,perimeter;
 
   printf("\nHeight of Rectangle : ");
   scanf("%d", &height);
 
   printf("\nBreadth of Rectangle : ");
   scanf("%d", &breadth);
 
   perimeter=2*(height+breadth);
   area = height * breadth;

   printf("\nPerimeter of Rectangle : %d", perimeter);
   printf("\nArea of Rectangle : %d", area);
  
return (0);
}