#include<stdio.h>
#include<string.h>

struct Student{
	char name[20];
	int age;
	int grade;
}; 


Student createStudent(char name[], int age, int grade){
	
	struct Student s;
	
	strcpy(s.name,name);
	
	s.age = age;
	s.grade = grade;
	
	return s;
}


int main(){
	
	Student p1 = createStudent("������",18,3);
	printf("�̸� : %s \n", p1.name); 	
	printf("���� : %d\n", p1.age); 	
	printf("���� : %d\n", p1.grade); 	



}
