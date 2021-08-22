package acmicpc.net;

import java.util.Scanner;

//https://www.acmicpc.net/problem/9095
// ÇØ°á
public class Number_9095 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
	
		int nums[] = new int[12];
		nums[1] = 1;
		nums[2] = 2;
		nums[3] = 4;

		for(int i =0; i < t; i++) {
			int num = sc.nextInt();
			System.out.println(solution(nums, num));
		}

	}
	static int solution(int arr[], int n) {
		if(arr[n] !=0)
			return arr[n];
		
		return arr[n] = solution(arr,n-1) + solution(arr,n-2) + solution(arr,n-3);
	}
}

