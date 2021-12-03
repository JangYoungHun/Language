package acmicpc.net;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2609
//ÇØ°á
public class Number_2609 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int result = 0;
		
		if(num1 > num2)  
			result =recur(num1,num2);
		else
			result =recur(num2,num1);
		
		System.out.println(result);
		System.out.println((num1*num2)/result);
	}

	
	static int recur(int n1, int n2) {
		
		if(n2 ==0)
			return n1;
		
		return recur(n2,n1%n2);
		
	}
	
}
