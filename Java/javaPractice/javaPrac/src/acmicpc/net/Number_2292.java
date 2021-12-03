package acmicpc.net;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2292
//ÇØ°á

public class Number_2292 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int result = 1;
		// 1     7      19      37 ......
		//    6     6*1     6*2   ....... 6*n
		// An = 1+3n(n-1)     
		
		while(1+3*result*(result-1) < N) {		
			result ++;		
		}
		
		System.out.println(result);
	}
	
	
	

}
