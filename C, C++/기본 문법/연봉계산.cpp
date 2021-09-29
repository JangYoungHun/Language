#include <stdio.h>


int main() {

	// Date : 2020-05-15
	
	printf("학번  : 201715131 \n");
	printf("이름 : 장용훈\n ");

	int ySalary;   //연봉 
	int mSalary;   // 월 수령액  

	printf("\n 연봉 (단위 : 만원) 을 입력하세요: ");
	scanf("%d", &ySalary);
	
	mSalary = ySalary / 12;
	printf("\n 월 수령액 : %d \n ", mSalary);
	

	return 0;

}
