package Sorts;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {

		int[] arr = {1,3,2,9,8,7,5,4,6};
		System.out.println(Arrays.toString(arr));
		selectionSort(arr) ;
		System.out.println(Arrays.toString(arr));
	}

public static void quickSort(int[] arr) {
	quickSort(arr, 0 , arr.length-1); 
		
	}
public static void quickSort(int[] arr, int start , int end) {
	int start2 = partition(arr, start,end);
	
	if(start < start2-1)
		quickSort(arr, start , start2-1); 
	if(start2 < end)	
		quickSort(arr, start2 , end); 
}	
public static int partition(int[] arr, int start , int end) {
	
	int pivot = arr[(start+end)/2];
	while(start<=end) {
		while(arr[start]<pivot) start++;
		while(arr[end]>pivot) end--;
		if(start<=end) {
		start++;
		end--;
		}
	}
	return start;
}
public static void swap(int[] arr, int start , int end) {
	int empty = arr[start];
	arr[start] = arr[end];
	arr[end] = empty;
}

public static void bubbleSort(int[] arr) {
	bubbleSort(arr,0,arr.length-1) ;
}
public static void bubbleSort(int[] arr, int start, int end) {
	
	if(start < end) {
	for(int i=1; i <=end; i++) {
		if(arr[i-1]>arr[i])
			swap(arr,i-1,i);		
	}
	
	 bubbleSort(arr, start,end-1);
	}
}


static void selectionSort(int[] arr) {
	selectionSort(arr, 0) ;
}

static void selectionSort(int[] arr, int start) {
	
	if(start <arr.length-1) {	
		int index = start;
		for(int i = start; i<arr.length; i++) {		
			if(arr[i] < arr[index]) {
				index = i;
			}	
		}
		swap(arr,start,index);
		selectionSort(arr,start+1);
	}
	
}

}



