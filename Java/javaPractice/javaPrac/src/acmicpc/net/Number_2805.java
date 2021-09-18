package acmicpc.net;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2805
//ÇØ°á
public class Number_2805 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		long arr[] = new long[n];
		long max = 0;
		for(int i =0; i<n; i++) {
			 int num = sc.nextInt();
			 arr[i] = num;
			 max = Math.max(max, num);
		}
		
		long min = 0;
		long mid = 0;
		long sum = 0;
		while(min <= max) {
			mid = (min+max)/2;
			sum = 0;
			for(long i : arr) {
				if(i-mid > 0)
					sum+= i-mid;
			}		
			
			if(sum == m) {
				System.out.println(mid);
				return;
			}
				
			else if(sum > m) 
				min = mid+1;					
			else
				max = mid-1;
		}
		
		System.out.println(max);
	}

}
