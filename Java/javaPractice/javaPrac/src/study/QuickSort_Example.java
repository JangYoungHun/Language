package study;

import java.util.Arrays;

public class QuickSort_Example {

	public static void main(String[] args) {
	
		int[] arr = {3,6,8,4,2,3,0,5};
		System.out.println(Arrays.toString(arr));
		quickSort(arr, 0 , arr.length-1);
			System.out.println("hello");
			System.out.println(Arrays.toString(arr));
	}

	
	
	static public void quickSort(int[] arr, int left, int right) {
		
		int pl = left;
		int pr = right;
		int pivot = arr[(pl+pr)/2]; 
		
		do {
			while(arr[pl]<pivot) pl++;
			while(arr[pr]>pivot) pr--;
			if(pl <= pr)
				swap(arr, pl++, pr--);
			
		}while(pl <=pr);
		
		if(left < pr)  quickSort(arr, left , pr);
		if(right > pl) quickSort(arr, pl , right);
	}
	
	
	public static void swap(int[] arr, int n1, int n2 ) {
		int empty = arr[n1];
		arr[n1] = arr[n2];
		arr[n2] = empty;
	}
	
	
}
