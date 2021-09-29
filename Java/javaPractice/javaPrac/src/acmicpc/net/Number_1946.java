package acmicpc.net;
//https://www.acmicpc.net/problem/1946

import java.util.Arrays;
import java.util.Scanner;

public class Number_1946 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int textCase = sc.nextInt();
			
		for(int i =0; i< textCase; i++) {
			
			int N = sc.nextInt();

			int cnt =1;
			int rate[] = new int[N+1];
				
			for(int j =0; j< N; j++) {		
				rate[sc.nextInt()] = sc.nextInt();	
			}
			
			int temp = rate[1];
			for(int j =2; j< N+1; j++) {		
				if(temp >= rate[j]) {
					temp = rate[j];
					cnt++;			
				}
			}
			 System.out.println(cnt);
		}

	}

}
