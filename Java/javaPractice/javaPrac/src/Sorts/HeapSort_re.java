package Sorts;

import java.util.Arrays;

public class HeapSort_re {

	public static void main(String[] args) {
		int n = 9;
		int arr[] = {2,8,9,4,6,5,7,3,1};
		
		
		//최소힙 만들기
		for(int i=1; i<n; i++) {
			int c = i;
			int root = 0;
			while(c>0) {
				root = (c-1)/2;
				if(arr[root] > arr[c]) {
					int temp = arr[root];
					arr[root] = arr[c];
					arr[c] = temp;
				}
				c = root;
			}
		}
		
		//정렬하기
		for(int i =n-1; i>0; i--) {
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			
			int root = 0;  
			int c =0;
			while(c<i) {
				c = root*2+1;		
				if(c+1 <i && arr[c] > arr[c+1]) {
					c++;
				}
				if(c < i && arr[root] >arr[c] ) {
					int tem = arr[root];
					arr[root] = arr[c];
					arr[c] = tem;
				}
				root = c;
			}	
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
