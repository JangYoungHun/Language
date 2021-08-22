package acmicpc.net;

import java.util.Arrays;
import java.util.Scanner;

//https://www.acmicpc.net/problem/11497
//ÇØ°á
public class Number_11497 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int testCase = scanner.nextInt();
	
		for(int i= 0; i<testCase; i++) {
			
			int N = scanner.nextInt();
			int arr[] = new int[N];
			
			for(int j=0; j<N; j++ ) {
				arr[j] = scanner.nextInt();
			}
			
			Arrays.sort(arr);
			
			int bridge[] = new int[N];
			
			int left =0;
			int right = N-1;
			
			for(int k=0; k<N; k++) {
				if(k%2==0) {
				bridge[left++] = arr[k];
				}
				else {
				 bridge[right--] = arr[k];
				}
			}
			
			int result = 0;
			
			result = Math.max(result, (int)Math.abs( bridge[0] -  bridge[N-1]));
			
			for(int j=0; j<N-1; j++ ) {
				result = Math.max(result, (int)Math.abs( bridge[j] -  bridge[j+1]));
			}
			
			System.out.println(result);
			
		}

	}

}
