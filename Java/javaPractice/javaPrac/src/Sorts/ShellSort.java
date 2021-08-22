package Sorts;

import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {
		int arr[] = {1,9,5,6,7,3,2,4,8};
		shellSort(arr,arr.length);
		System.out.print(Arrays.toString(arr));

	}
	
	
	static void shellSort(int arr[],int N) {
		
		for(int i =N/2; i > 0; i /= 2) {
			
			for(int j = i; j<N; j++) {
				
				int h;
				int temp = arr[j];
				
				for(h=j-i; h>=0 && arr[h] > arr[j]; h -= i) 
					arr[h+i] = arr[h];
				
			arr[h+i] = temp;	
				
			
				
			}
			
			
			
		}
		
		
		
		
		
	}
	

}
