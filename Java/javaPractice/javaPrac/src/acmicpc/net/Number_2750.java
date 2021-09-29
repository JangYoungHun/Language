package acmicpc.net;

import java.util.Arrays;
import java.util.Scanner;

//https://www.acmicpc.net/problem/2750
//ÇØ°á
public class Number_2750 {

	public static void main(String args[]) {
	   
	   Scanner sc = new Scanner(System.in);
	   int N = sc.nextInt();
	   int arr[] = new int[N];
	   
	   for(int i = 0; i< N; i++) {
		   arr[i] = sc.nextInt();		   
	   }
	   
	   solution(arr);
   }


	public static void solution(int arr[]) {
		
		Arrays.sort(arr);
		
		   for(int i = 0; i< arr.length; i++) {
			   System.out.println(arr[i]); 
		   }

	}
}
