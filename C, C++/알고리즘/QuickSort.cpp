#include<stdio.h>


int partition(int arr[], int left, int right) {

	int pivot = arr[(left + right) / 2];

	while (left <= right) {
		while (arr[left] < pivot) left++;
		while (arr[right] > pivot) right--;

		if (left <= right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}

	return left;
}


void quickSort(int arr[], int left, int right) {

	int divide = partition(arr, left, right);

	if(left < divide-1)
	quickSort(arr, left, divide-1);
	if (divide < right)
	quickSort(arr, divide, right);

}

void quickSort(int arr[], int n) {
	quickSort(arr, 0, n);
}



int main() {

	int arr[] = { 8,4,6,5,2,9,7,3,1 }; 
	
	quickSort(arr, sizeof(arr) / sizeof(int) - 1);

	for (int i = 0; i < sizeof(arr) / sizeof(int); i++) {
		printf("%d  ", arr[i]);
	}

}
