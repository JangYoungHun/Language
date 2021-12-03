package Programmers;

import java.util.Scanner;
//https://www.acmicpc.net/problem/1654
//ÇØ°á
public class Number_1654 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		long result = Integer.MIN_VALUE;
		int k = sc.nextInt();
		int n = sc.nextInt();

		long arr[] = new long[k];
		long min = 1;
		long max = 0;
		for (int i = 0; i < k; i++) {
			int num = sc.nextInt();
			arr[i] = num;
			max = Math.max(max, num);
		}

		long mid = 0;
		long sum = 0;
		while (min <= max) {
			sum = 0;
			mid = (max + min) / 2;
			for (long i : arr) {
				sum += i / mid;
			}
			
			if(sum >= n) {
				
				min = mid+1;
			}
			else {
				max = mid-1;
			}

		}
		System.out.println(max);
	}

}
