#include<stdio.h>
#include<windows.h>


int main() {
	
	unsigned long dw;
	
	int clr;
	
	system("title æ»≥Á«œººø‰");
	system("mode con:cols=100 lines=30 ");
	system("color 0F");
	
	for(int i =0; i<=10; i++){
		printf("\n %d", i);      
	}
	
	scanf("%d", &clr);
	
	if(clr==1){
		FillConsoleOutputCharacter(GetStdHandle(STD_OUTPUT_HANDLE),'', 100*30,  {0,0}, &dw);
	}
	
	
	
	
	return 0;
	
	
}
