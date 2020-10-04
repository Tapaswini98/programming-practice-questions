#include<stdio.h>
int i,j,k;
int main()
{
	for(i=5;i>=1;i--)
	{
		for(j=i;j>1;j--)
		{
			printf(" ");
		}
		for(k=5;k>=i;k--)
		{
			printf("*");
		}
		printf("\n");
	}
	return 0;
}
