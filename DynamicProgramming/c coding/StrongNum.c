#include<stdio.h>
int n,i,temp,rem,fact,sum=0;
int main()
{
	printf("enter the number:");
	scanf("%d",&n);
	temp = n; 
	while(n!=0)
	{
		rem = n%10;
		fact = 1;
		for(i=1;i<=rem;i++)
		{
			fact = fact*i;
		}
		sum+=fact;
		n/=10;
	}
	if(sum==temp)
	{
		printf("strong number.");
	}
	else
	printf("not a strong number.");
	return 0;	
}
