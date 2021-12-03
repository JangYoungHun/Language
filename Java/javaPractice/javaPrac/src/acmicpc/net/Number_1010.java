package acmicpc.net;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1010
//ÇØ°á
public class Number_1010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		long arr[] = new long[31];
		arr[0] = 1;
		arr[1] = 1;
		
		for(int i=0; i<t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int big = (m-n) > n ? m-n : n;
			int small= m-big;
			
			long mul = 1;
			for(int j=m; j>big; j--) {
				mul *= j;
			}
			
			long result = mul / recur(small,arr);
			System.out.println(result);
		}

	}
	
	static long recur(int n, long[] arr) {
		if(arr[n] != 0)
			return arr[n];	
		return arr[n] = n*recur(n-1,arr);			
	}

}
