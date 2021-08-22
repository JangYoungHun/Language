#include<stdio.h>


void merge(int arr[], int l, int p, int r) {

	int b[100];
	int i = l;
	int j = p + 1;
	int k = 0;

	while (i <= p && j <= r) {

		if (arr[i] <= arr[j]) {
			b[k++] = arr[i++];
		}
		else {
			b[k++] = arr[j++];
		}
	}
	while (i <= p) {
		b[k++] = arr[i++];
	}

	while (j <= r) {
		b[k++] = arr[j++];
	}

	k--;

	while (k >= 0) {
		arr[l + k] = b[k];
		k--;
	}

}



void mergeSort(int arr[], int l, int r) {

	if (l < r) {

		int p = (l + r) / 2;

		mergeSort(arr, l, p);
		mergeSort(arr, p + 1, r);

		merge(arr, l, p, r);

	}
	else
		return;

}

int main() {


	int arr2[] = { 3,1,6,8,5,2,4,7,9 };
	int num = (sizeof(arr2) / sizeof(int)) - 1;
	mergeSort(arr2, 0, num);

	for (int i = 0; i < sizeof(arr2) / sizeof(int); i++) {
		printf("%d ", arr2[i]);
	}

}