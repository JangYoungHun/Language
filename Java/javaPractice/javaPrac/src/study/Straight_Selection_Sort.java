package study;

import java.util.Arrays;

public class Straight_Selection_Sort {

	public static void main(String[] args) {	
		int[] arr = {3,6,8,4,2,3,0,5};
		selection(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}

	static void selection(int[] arr, int n) {
		int min =0;
		for(int i=0; i<n-1;i++) {
			min = i;
			for(int j = i+1; j<n; j++) {
				if(arr[min] > arr[j])
					min =j;
			}
			swap(arr,i,min);
		}

	}
	
	public static void swap(int[] arr, int n1, int n2 ) {
		int empty = arr[n1];
		arr[n1] = arr[n2];
		arr[n2] = empty;
	}
	
}
