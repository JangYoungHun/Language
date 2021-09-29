package Sorts;

import java.util.Arrays;

public class HeapSort {

	public static void main(String[] args) {
		int arr[] = {5,9,8,3,2,1,7,6,4};
		heapSort(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}

	
	static void heapSort(int arr[], int n) {

		// 최대 힙 만들기
		for(int i=1; i < n; i++) {
			int c = i;
			while(c != 0) {		
				int root  = (c-1)/2;
				if(arr[c] > arr[root]) {
					int temp = arr[c];
					arr[c] = arr[root];
					arr[root] = temp;
					
				}	
				c = root;
			}
		}
		
		
		//오름차순 정렬
		for(int i = n-1; i>=0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			int root =0;
			int c =1;
			while(c<i) {
				c= root*2+1;
				if( c< i-1 && (arr[c] < arr[c+1] )) {
					c++;
				}
				if(c<i && arr[root] <arr[c] ) {
					int tem = arr[root];
					arr[root] = arr[c];
					arr[c] = tem;
				}
				
				root =c ;
				
			}
			
		}
		
		
		
		
	}
}
