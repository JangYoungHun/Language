package acmicpc.net;

import java.util.Scanner;
//https://www.acmicpc.net/problem/2579
//ÇØ°á
public class Number_2579_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		int a[] = new int[n+3];
		for(int i =3; i<n+3; i++) {
			a[i] = sc.nextInt();			
		}
		
		int d[] = new int[n+3];

		for(int i =3; i<n+3; i++) {
			d[i] = Math.max(d[i-3]+ a[i-1], d[i-2]) + a[i];
		}
		
		System.out.println(d[n+2]);
		
	}
}
