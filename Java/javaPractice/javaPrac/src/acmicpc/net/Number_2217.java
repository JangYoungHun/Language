package acmicpc.net;

import java.util.Arrays;
import java.util.Scanner;

//https://www.acmicpc.net/problem/2217
public class Number_2217 {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); 
		int arr[] = new int[N];
		for(int i=0; i<N; i++) {
			
			arr[i] = sc.nextInt(); 
		}
		
		Arrays.sort(arr); 
		 
		int result = 0;
		
		for(int i=0; i<N; i++) {
			result = Math.max(result, arr[i]*(arr.length-i)); 
		}
		
		System.out.println(result);
	}

}
