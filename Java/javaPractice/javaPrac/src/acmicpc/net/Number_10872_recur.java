package acmicpc.net;

import java.util.Scanner;

//https://www.acmicpc.net/problem/10872
// ���丮�� N!
//�ذ�
public class Number_10872_recur {
	static int result = 1;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		int N = sc.nextInt();
		recur(N);
	}



static void recur(int n) {
	
	if(n == 0) {
		System.out.println(result);
		return;	
	}
	result = result*n;
	recur(n-1);
	
}
	


}