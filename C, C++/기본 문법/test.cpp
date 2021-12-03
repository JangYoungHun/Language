#include<iostream>

typedef struct Box{
	char* name = "dsadsa";
	int age = 12;
};

int main(){
	
	Box* a = new Box();
	Box* b = new Box();
	

	std::cout << "\n a 주소: ";
	std::cout << a;
    
	std::cout << "\n b 주소: ";
	std::cout << b;
	
	std::cout << "------------------------------------------------------"<< std::endl;
	
	Box* c = b;
	std::cout << "\n c 주소: ";
	std::cout << c;
	
	Box* d = std::move(b);

}