 package acmicpc.net;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1934
//ÇØ°á
public class Number_1934 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =0; i<n; i++) {
		long num1 = sc.nextInt();
		long num2 = sc.nextInt();
		
		long result = 0;
		
		if(num1 > num2)  
			result =recur(num1,num2);
		else
			result =recur(num2,num1);
		System.out.println((num1*num2)/result);
		}
	}

	
	static long recur(long n1, long n2) {
		
		if(n2 ==0) 
			return n1;
		
		return recur(n2,n1%n2);
		
	}
}
