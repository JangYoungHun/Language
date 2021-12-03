package acmicpc.net;

import java.util.Scanner;
//https://www.acmicpc.net/problem/2579
// ÇØ°á
public class Number_2579 {
	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		int d[][] = new int[n][2];

		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		if(n==1) {
			System.out.println(arr[0]);
			return;
		}

		d[1][0] = arr[0] + arr[1];
		d[1][1] = arr[1];
		d[0][0] = arr[0];
		d[0][1] = arr[0];
		
		for(int i =2; i<n; i++) {
			d[i][0] = d[i-1][1] + arr[i];
			d[i][1] = Math.max(d[i-2][0], d[i-2][1])+ arr[i];
		}
		System.out.println(Math.max(d[n-1][0], d[n-1][1]));
	}
}
