#include<stdio.h>



int main()
{
	
	char scanff[20];
	char getss[20];
	
	scanf("%s", &scanff);
	//  scanf("%[^\n]s", &scanff);      [^\n] 공백포함  
	gets(getss);

	 
	 
	gets(getss);
	
	printf("scanff : %s", scanff);
	printf("getss : %s" , getss);
	
	
	return 0;
	
	
	
}

