package acmicpc.net;

import java.util.Scanner;

//https://www.acmicpc.net/problem/5086
//ÇØ°á
public class Number_5086 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1== 0 && num2 ==0)
			break;
		
		String str = "neither";
		
		if(num1 <num2) {
			if(num2%num1 == 0)
				str = "factor";			
		}
		else if(num1 > num2) {
			if(num1%num2 == 0)
				str = "multiple";	
		}
		
		System.out.println(str);
	}
	}

}
