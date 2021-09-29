#include<stdio.h>


void InsertSort(int arr[] ,int N) {

	for(int i =0; i< N; i++){
		int j =i;
		while(j >0 && arr[j] < arr[j-1]){
			int temp = arr[j];
			arr[j] = arr[j-1];
			arr[j-1] = temp;
			j--;		
		}
	
	}
	


}


int main(){

	int arr[] = {1,5,6,8,7,4,3,9,2};
	int N = sizeof(arr)/sizeof(arr[0]);
	
	InsertSort(arr, N);
	
	for(int i =0; i< N; i++){
		printf("%d ", arr[i]);
	
	}
}

