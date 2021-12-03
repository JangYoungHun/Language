#include<iostream>


void change1(int num){
	num = 100;
}
int change2(int num){
	return num = 100;
}

void change3(int* num){
	*num = 100;
}

void change4(int& num){
	num = 90;
}

int main(){
	
	int a = 6;
	int b = 6;
	int* c;
	int num = 6;
	c = &num;
	int d=6;

	
	change1(a);
	std::cout << a <<"\n" ;
	std::cout << change2(b) <<"\n" ;
	change3(c);
	std::cout << *c <<"\n" ;
	change4(d);
	std::cout << d <<"\n" ;
}

