#include <stdio.h>

int main()
{
	int angle1,angle2,angle3,sum;
	printf("Enter angle1 : ");
	scanf("%d",&angle1);
	printf("Enter angle2 : ");
	scanf("%d",&angle2);
	printf("Enter angle3 : ");
	scanf("%d",&angle3);
	sum = angle1 + angle2 + angle3;
	if(sum = 180 && angle1 > 0 && angle2 > 0 && angle3 > 0)
{
		printf("The triangle is vaild");
}
	else
{
		printf("The triangle is not vaild");
}
	return 0;
}