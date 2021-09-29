package acmicpc.net;

import java.util.Arrays;
import java.util.Scanner;

//https://www.acmicpc.net/problem/15903
//ÇØ°á
public class Number_15903 {

	public static void main(String[] args) {
	
	
		long sum;
		long result =0;

		Scanner scanner = new Scanner(System.in);
		
		
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		long arr[] = new long[N];
							
	
		
		
		for(int i =0; i < N ; i++ )
		{
			arr[i] = scanner.nextInt();				
		}
		
		
		for(int i =0; i < M; i++ )
		{
			Arrays.sort(arr);
			sum = arr[0] + arr[1];
			arr[0] = sum;
			arr[1] = sum;
					
		}
		for(long i : arr)
		{
			result += i;	
		}
			
		System.out.println(result);

	}

}
