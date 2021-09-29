package Sorts;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = {5,9,8,3,2,1,7,6,4};
		System.out.println(Arrays.toString(arr));
		 selectionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	static void selectionSort(int[] arr) {
		selectionSort(arr, 0);
	}
	
	static void selectionSort(int[] arr, int start) {
		
		if(start<arr.length-1) {
			int index = start;
			
			for(int i = start; i<arr.length; i++) {					
				if( arr[index] > arr[i] ) {
					index = i;
				}				
			}
			swap(arr,start,index);
			
			selectionSort(arr, start+1);
		}
	}
	
	public static void swap(int[] arr, int index1, int index2) {
		int num = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = num;
	}
}
				