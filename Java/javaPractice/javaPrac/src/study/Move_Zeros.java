package study;

import java.util.Arrays;

public class Move_Zeros {

	public static void main(String[] args) {
		// 0을 오른쪽으로 이동시키기
		int arr[] = {0,5,0,7,6,3};
		
		int i=0;
		for(int j=0; j<arr.length; j++) {
			if(arr[j] != 0) {
				arr[i] = arr[j];
				i++;
			}
		}
		for( ; i<arr.length; i++) {
			arr[i] = 0;
		}
		
	System.out.println(Arrays.toString(arr));	
	}
	


}
