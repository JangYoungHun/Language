#include<stdio.h>


int main() {

	int arr[] = { 8,4,6,5,2,9,7,3,1 };

	//선택 정렬
	int index = 0;
	int min = 0;
	for (int i = 0; i < sizeof(arr) / sizeof(int); i++) {
		
		min = arr[i];
		index = i;

		for (int j = i+1; j < sizeof(arr) / sizeof(int); j++) {		

			if (min >  arr[j]){
				min = arr[j];
				index = j;
			}		
		}
		// swap
		arr[index] = arr[i];
		arr[i] = min;
	}


	for (int i = 0; i < sizeof(arr) / sizeof(int) ; i++) {
		printf("%d  ", arr[i]);
	}


}
