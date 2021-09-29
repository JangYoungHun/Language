package acmicpc.net;

import java.util.Arrays;
import java.util.Scanner;
//// https://www.acmicpc.net/problem/1449
//ÇØ°á
public class Number_1449 {

	public static void main(String[] args)  {
		
		Scanner sc =new Scanner(System.in);
	
		int N = sc.nextInt();
		int L =  sc.nextInt();
		int arr[] = new int[N];
		int result=0;
		
		
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int fixed[] = new int[1001];
		
		for(int i=0; i<N; i++) {
			if(fixed[arr[i]] != 1) {
				result ++;
				for(int j =arr[i]; j < Math.min(arr[i]+L, 1001); j++ ) {
					fixed[j] = 1;
				}			
			}
			
			
		}
		
		System.out.println(result);

	}

}
