package Array;

import java.util.Arrays;

public class Sort_Colors {

	public static void main(String[] args) {
		int arr[] = {1,0,2,2,0,1,2,1,0};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	
	static void sort(int[] arr) {
		
		int left = 0;
		int right = arr.length-1;
		int p = 0;
		
		while(p++<=right) {
			if(arr[p] == 0) {
				swap(arr, left, p);
				left++;
			}
			else if(arr[p] == 2) {
				swap(arr, right, p);
				right--;
			}
				
		}
	}


	private static void swap(int[] arr, int left, int p) {
	int temp = arr[left];
	arr[left]= arr[p];
	arr[p] = temp;	
	}
	
}
