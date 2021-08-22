package acmicpc.net;

import java.util.Scanner;
//https://www.acmicpc.net/problem/10844
//ÇØ°á
public class Number_10844 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
		long d[][] = new long[n+1][9];
			
		for(int i =0; i<9; i++) {
			d[1][i] = 1;
			if(n>1) {
			if(i==8)
				d[2][i] = 1;
			else
				d[2][i] = 2;
		}
		}
		

		for(int i=3; i<n+1; i++) {
			for(int j=0; j<9; j++) {
				if(j==0) 
					d[i][j] = (d[i-2][j]+ d[i-1][j+1])%1000000000 ;
					
				else if(j==8)
					d[i][j] = (d[i-1][j-1])%1000000000;
				
				else
					d[i][j] = (d[i-1][j+1] + d[i-1][j-1])%1000000000;
				
			}
	
			
		}
		
		long result =0;
		for(int i =0; i<9; i++) {
			result += d[n][i]%1000000000;	
			result %= 1000000000 ;}
		
		System.out.println(result);
			
	}

}
