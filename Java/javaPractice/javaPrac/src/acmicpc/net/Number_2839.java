package acmicpc.net;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2839
/// ÇØ°á
public class Number_2839 {

	public static void main(String args[]) {
		
		int cnt =-1;
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		// 5X + 3Y = N
		
		int i=0;
		while(5*i <= N) {
			
			int j=0;
			while(5*i + 3*j <= N) {
				
				if( 5*i + 3*j  == N) {
					if(cnt == -1)
						cnt = i+j;
					else {
					cnt = Math.min(cnt, i+j);
					}
					
				}		
				
				j++;
			}
			
			
			i++;
		}
		
		
		
		System.out.println(cnt);
		
		
		
	}
	
	
	
}
