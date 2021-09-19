package acmicpc.net;

import java.util.Arrays;
import java.util.Scanner;

//https://www.acmicpc.net/problem/1037
//ÇØ°á
public class Number_1037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long arr[] = new long[n];
		
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[0]*arr[n-1]);	
	}

}
