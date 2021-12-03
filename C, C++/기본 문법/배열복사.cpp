#include <stdio.h>
#include <string.h>

int main () {
	
	char str[] = "Hello World";
	
	strcpy(str, "HaHaHa");
	
	printf("%s", str);
	return 0;
	
}
