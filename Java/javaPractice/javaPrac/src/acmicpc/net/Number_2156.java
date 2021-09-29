package acmicpc.net;

import java.util.Scanner;

public class Number_2156 {
	//https://www.acmicpc.net/problem/2156
	//ÇØ°á
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n+3];
		
		for(int i =3; i<n+3; i++) {
			a[i] = sc.nextInt();				
		}
		
		int d[] = new int [n+3];
		int result =0;	
		
		for(int i =3; i<n+3; i++) {		
			d[i] = Math.max(a[i-1] + d[i-3] , d[i-2]) + a[i]; 
			d[i] =Math.max(d[i-1], d[i]);
			result = Math.max(result, d[i]);
			}
		


		System.out.println(result);
	}
}
