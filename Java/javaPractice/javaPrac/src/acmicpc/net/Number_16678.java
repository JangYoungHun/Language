package acmicpc.net;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.Scanner;

public class Number_16678 {
//https://www.acmicpc.net/problem/16678
	//ÇØ°á
			
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int fame[];

				int N = sc.nextInt();
				fame = new int[N];
				
				
				for(int i=0; i<N; i++) {
						fame[i] = sc.nextInt();
				}
				
				Arrays.sort(fame);
				long result =0;
				int t =1;
				
				for(int i =0; i<N; i++ ) {
					if(fame[i] >=t) {
						result += fame[i]-t;
						t++;
					}
				}
				
				System.out.println(result);
				
			}

}
