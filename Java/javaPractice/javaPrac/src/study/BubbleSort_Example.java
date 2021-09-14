package study;

import java.util.Arrays;

public class BubbleSort_Example {

	public static void main(String[] args) {
		int[] arr = {3,6,8,4,2,3,0,5};
		bubbleSort(arr, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	public static void bubbleSort(int[] arr,  int length) {
		int last =0;
		for(int i=0; i<length; i++ ) {
			if(arr[i]>arr[i+1]) {
				swap(arr, i, i+1);
				last  = i;
			}	
		}
			if(last ==0)
				return;
			else
				bubbleSort(arr,last);
		
	}
	
	public static void swap(int[] arr, int n1, int n2 ) {
		int empty = arr[n1];
		arr[n1] = arr[n2];
		arr[n2] = empty;
	}
	
	
}
