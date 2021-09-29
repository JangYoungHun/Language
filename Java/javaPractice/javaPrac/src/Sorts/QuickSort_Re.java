package Sorts;

import java.util.Arrays;

public class QuickSort_Re {

	public static void main(String[] args) {
		
		int arr[] = {1,9,5,6,7,3,2,4,8};
		quickSort(arr); 
		System.out.print(Arrays.toString(arr));				
	}

	public static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length-1);
	}

static void quickSort(int[] arr, int start, int end) {
	int start2 = partition(arr,start,end);
	
	if(start < start2-1)
		quickSort(arr,start,start2-1);
	
	if(start2 < end)
		quickSort(arr,start2,end);
}

public static int partition(int[] arr, int start, int end) {
	int pivot =arr[(start+end)/2];
	while(start <= end) {
		while(arr[start] < pivot) start ++;
		while(arr[end] > pivot) end--;
		if(start <= end) {
		swap(arr, start,end);
		start++;
		end--;
		}
	}
return start;
}

static void swap(int[] arr, int start, int end) {
	int empty = arr[start];
	arr[start] = arr[end];
	arr[end] = empty;		
}
}