package acmicpc.net;

import java.util.Scanner;

//https://www.acmicpc.net/problem/10870
// �Ǻ���ġ��  0, 1 ~~
// �ذ�
public class Number_10870 {
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		int num1 = 0;
		int num2 = 1;
		int num3 = num1 + num2;
		
		for(int i =2; i <N; i++) {
			
			num1 = num2;
			num2 = num3;
			num3 = num1 + num2;
		}
		
		if(N==0)
			System.out.println(0);
		else
		System.out.println(num3);

	}

}
