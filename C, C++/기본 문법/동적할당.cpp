#include<stdio.h>
#include<stdlib.h>




int main() {

	char str[] = "Hello World";
	
	char *arr = (char*)malloc(sizeof(str));
	arr = str;
	printf("%s", arr);
	
	
free(arr);
	
	
	return 0;
}

