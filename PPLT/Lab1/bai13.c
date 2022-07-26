#include <stdio.h>
#include <stdlib.h>
int main()
{
	int phy,che,bio,math,com;
	float per;
	printf("The mark of Physics is : ");
	scanf("%d",&phy);
	printf("The mark of Chemistry is : ");
	scanf("%d",&che);
	printf("The mark of Biology is : ");
	scanf("%d",&bio);
	printf("The mark of Mathematics : ");
	scanf("%d",&math);
	printf("The mark of Computer : ");
	scanf("%d",&com);
	per = (phy + che + bio + math + com) / 5;
	printf("The percentage is : %1.f%% \n",per);
	if (per > 90){printf("Grade A");
	}
	else if (per > 80){printf("Grade B");
	}
	else if (per > 70){printf("Grade C");
	}
	else if (per > 60){printf("Grade D");
	}
	else if (per > 40){printf("Grade E");
	}
	else if (per <= 40){printf("Grade F");
	}
    return 0;		
}