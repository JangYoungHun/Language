package acmicpc.net;

import java.util.Scanner;

//https://www.acmicpc.net/problem/10872
// ���丮�� N!
//�ذ�
public class Number_10872 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int result = 1;
		int N = sc.nextInt();
		
		for(int i = 1; i <= N ;i++) {
			result = result * i;		
		}
		
		System.out.println(result);
	}

	
}
