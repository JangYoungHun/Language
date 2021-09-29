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
	
	Student p1 = createStudent("가나다",18,3);
	printf("이름 : %s \n", p1.name); 	
	printf("나이 : %d\n", p1.age); 	
	printf("성적 : %d\n", p1.grade); 	



}
