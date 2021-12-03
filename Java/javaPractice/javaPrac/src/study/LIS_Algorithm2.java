package study;

import java.util.ArrayList;
import java.util.List;


public class LIS_Algorithm2 {

	public static void main(String[] args) {
		
		int arr[] = { 4,7,1,2,3,4,0,8};
		int n = arr.length;
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		
		for(int i =0; i<n; i++) {
			int value = list.get(list.size()-1);
			if(value < arr[i]) {
				list.add(arr[i]);
			}
			else {
				int index = binarySearch(0, list.size()-1, arr[i], list);
				index = (index < 0) ? (index+1)*(-1) : index;
				list.set(index, arr[i]);
			}
				
		}
		
		System.out.println(list.toString());
		
}
	
	static int binarySearch(int left, int right, int num, List<Integer> list) {
		
		while(left <= right) {
			int p = (left+right)/2;
			if(list.get(p) == num) {
				return p;
			}
			else if(list.get(p)  < num) {
				left = p+1;				
			}
			else {
				right = p-1;
			}			
		}
			return (-1)*(left+1);
	}
	
}