package acmicpc.net;

import java.util.Scanner;

//https://www.acmicpc.net/problem/17608
public class Number_17608 {

	public static void main(String[] args) {

		int arr[];
		int base;
		int result = 1;
		
		Scanner sc = new Scanner(System.in);
		
		int n =  sc.nextInt();
		
		arr = new int[n];
				
		for(int i = 0; i < n; i++)
		{			
		arr[i] = sc.nextInt();			
		}

		base = arr[n-1];
		
		
		for(int i = n-2; i >= 0; i--)
		{			
		
		if(arr[i] > base) {
			base = arr[i];
			result++;
		}
		}
	
		System.out.println(result);
	}

}
