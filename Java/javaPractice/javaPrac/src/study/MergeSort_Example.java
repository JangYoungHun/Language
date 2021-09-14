package study;

import java.util.Arrays;

public class MergeSort_Example {
	
	static int[] buff;
	
	public static void main(String[] args) {
		int[] arr = {22,5,11,32,120,68,70};
		mergeSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	static void mergeSort(int[] arr) {
		buff = new int[arr.length];
		mergeSort(arr ,0, arr.length-1);
		buff = null;
	}
	
	static void mergeSort(int[] arr, int left , int right) {
		
		if(left < right) {
			
			int pl = left;
			int pr = right;
			int center = (left + right)/2;
			
			mergeSort(arr,left,center);
			mergeSort(arr,center+1,right);
			
			int i;
			int k =0;
			
			for(i = left;  i<= center; i++)
				buff[k++] = arr[i];
			
			int p =left;
			int j =0;
			
			while(i<=right && j < k) 
				arr[p++] = (buff[j] <= arr[i]) ? buff[j++] : arr[i++];
			
			while(j < k) 
				arr[p++] = buff[j++];
			
		}
		
		
		
	}
}
