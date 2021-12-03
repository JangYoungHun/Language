package acmicpc.net;

import java.util.Scanner;

//https://www.acmicpc.net/problem/10870
// 피보나치수  0, 1 ~~
// 해결
public class Number_10870_recur {

	static int N ;
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		N = sc.nextInt();
		
		recur(0,1,0);

	}

	static void recur( int num1, int num2, int cnt) {
		
		if(cnt == N) {
			System.out.println(num1);
			return;
		}
		
		recur(num2, num1+num2, cnt+1);		
		
	}
	
	
	
	
}
