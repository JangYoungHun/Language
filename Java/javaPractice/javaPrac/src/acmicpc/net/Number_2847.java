package acmicpc.net;

import java.util.Arrays;
import java.util.Scanner;

public class Number_2847 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int arr[] = new int[N];
		
		for(int i =0; i< N; i++) {		
			arr[i] = sc.nextInt();	
		}
		
		int p = N-1;
		int result =0;
		while(p>=1) {
			
			if(arr[p] <= arr[p-1] ) {
				arr[p-1]--;
				result ++;
			}
			else
				p--;
			
		}
		
		System.out.println(result);
	}

}
