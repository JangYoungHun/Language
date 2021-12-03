package Programmers;

//https://programmers.co.kr/learn/courses/30/lessons/43165
//ÇØ°á
public class Number_43165 {
	static int cnt =0;
	public static void main(String[] args) {
	
		int arr[] = {1, 1, 1, 1, 1};
		dfs(arr, 0, 0, 3);
		System.out.println(cnt);
	}
	
	
	public static void dfs(int arr[], int index, int value, int target) {
		
		if(index >= arr.length) {
			if( value == target )
				cnt++;
			return;
		}
		
		dfs(arr, index+1, value+arr[index],target); 
		dfs(arr, index+1, value - arr[index],target); 
		
	}
}
