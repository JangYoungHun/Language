package acmicpc.net;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2193
//ÇØ°á
public class Number_2193 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    int n= sc.nextInt();

		long arr[] = new long[91];
		arr[1] = 1;
		arr[2] = 1;
		
		System.out.println(fibonacci(n, arr));
	
	}

	static long fibonacci(int n, long arr[]) {
		
		if(n==0)
			return 0;
		
		if(arr[n] !=0)
			return arr[n];
		
		else 
			return arr[n] = fibonacci(n-1, arr)+fibonacci(n-2, arr);

	}
	
}
