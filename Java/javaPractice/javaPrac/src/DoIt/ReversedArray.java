package DoIt;

import java.util.Arrays;

public class ReversedArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(arr));
		for(int i =0; i<arr.length/2; i++) {
			swap(arr,i,arr.length-1-i);	
		}
		System.out.println(Arrays.toString(arr));
	} 

	static void swap(int[] arr, int index1, int index2) {
		
		int empty = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = empty;
		
	}
	
	
	
}
