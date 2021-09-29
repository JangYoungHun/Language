package acmicpc.net;

import java.util.Scanner;
//https://www.acmicpc.net/problem/9461
// ÇØ°á
public class Number_9461 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long arr[] = new long[101]; 

		int t = sc.nextInt();
		
		for(int i =0; i <t; i++) {
			int n = sc.nextInt();
			System.out.println(solution(arr,n));
		}

	}
	
	static long solution(long arr[] ,int num) {
		if(num ==1)
			return 1;
		if(num == 2)
			return 1;
		if(num == 3)
			return 1;
		
		if(arr[num] != 0)
			return arr[num];
		
		return arr[num] = solution(arr,num-3)+ solution(arr,num-2);
		
		
	}
}
