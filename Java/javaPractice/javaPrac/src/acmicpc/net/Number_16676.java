package acmicpc.net;

import java.util.Scanner;
 //https://www.acmicpc.net/problem/16676
public class Number_16676 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;

		
	Scanner sc = new Scanner(System.in);
		
	num = sc.nextInt();
	
	
	System.out.println(solve(num) );
	
	
			
			}	
	
	static int solve(int num) {
		
		int result = 0;
		
		if(num <= 10)
			result = 1;
		
		else if(num <= 110)
			result = 2;
		
		else if(num <= 1110)
			result = 3;
		
		else if(num <= 11110)
			result = 4;
		
		else if(num <= 111110)
			result = 5;
		
		else if(num <= 1111110)
			result = 6;
		
		else if(num <= 11111110)
			result = 7;
		
		else if(num <= 111111110)
			result = 8;
		
		else
			result =9;
		
		
		return result;
	}
	
	
}
