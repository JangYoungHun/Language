package acmicpc.net;

import java.util.Scanner;

public class Number_1748 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = 0;
		
		int val = 1;
		while(n >= Math.pow(10, val)) {
			val++;
		}
		
		if(val == 1) {
			result = n;
		}
		else {
			for(int i = 1; i<val; i++) {
				result += 9*Math.pow(10, i-1)*i;
			}
			
			int start = (int) Math.pow(10, val-1);
			result += (n-start+1)*(val);
		}

		System.out.println(result);
	}
}
