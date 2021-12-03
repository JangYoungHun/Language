#include<iostream>

using namespace std;


class Person {

public:

	string name;
	int age;
	string location;

	Person(string name, int age, string location) {
		this->name = name;
		this->age = age;
		this->location = location;
	}


};


int main() {
	string name;
	int age;
	string location;
	cin >> name;
	cin >> age;
	cin >> location;
	
	Person* p = new Person(name, age, location);

	p->location = "¼­¿ï";

	cout << (*p).name<< endl;
	cout << (*p).age << endl;
	cout << (*p).location << endl;

	delete p;
}