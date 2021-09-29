package Sorts;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {5,9,8,3,2,1,7,6,4};
		System.out.println(Arrays.toString(arr));
		BubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void BubbleSort(int[] arr) {
		BubbleSort(arr, 0,  arr.length-1);
	}

	static void BubbleSort(int[] arr, int start, int end) {
	
		if( 0 < end) {
			for(int i = 1; i <= end; i++) {
				
				if(arr[i-1] > arr[i])
					swap(arr, i-1 , i);				
			}
		BubbleSort(arr ,start, end-1);
		}
	}
	public static void swap(int[] arr, int index1, int index2) {
		int num = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = num;
	}
	
	
	
}
