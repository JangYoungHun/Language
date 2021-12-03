#include <stdio.h>

#define Plus1(a,b) a-b
#define Plus2(a,b) (a)*(b)
int main() {
	int uni = Plus1('b','a');
	printf("%c", uni);
	
	printf("%c \n", Plus1('b','a'));
	printf("%d", Plus2(1+4,2));
	
}
