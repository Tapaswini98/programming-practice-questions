#include<stdio.h>
int a,b,j,i,x,y,p,q;
int main()
{
	for(i = 1;i<=5;i++)
	{
		for(j = i;j<=5;j++)          //both increment in for loop
		{
			printf("*");
		}
		printf("\n");
	}
	return 0;
}

