package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//https://www.acmicpc.net/problem/2750

public class Number_2751  {

	public static void main(String args[]) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();

		int arr[] = new int[N];
	   for(int i = 0; i< N; i++) {
		   arr[i] = scanner.nextInt();
	   }
	   
	   for(int i =0; i < N-1; i++) {
		   
		   for(int j=0; j < N-1-i; j++) {
			   if(arr[j] <arr[j+1])
				   swap(arr,j,j+1);			   
		   }
	   }
	
	   System.out.println(Arrays.toString(arr));
	   
   }


	
	static void swap(int[] arr, int index1, int index2) {
		
		int num1 = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = num1;
		
	}
	
	
	
	
	
}
