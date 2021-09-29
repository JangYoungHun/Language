package acmicpc.net;

import java.util.Scanner;
//https://www.acmicpc.net/problem/11057
//�ذ�
public class Number_11057 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int d[][] = new int[n+1][10];
		
		for(int i =0; i<10; i++) {
			d[1][i] = 1;
		}

		for(int i =1; i<=n; i++) {
			for(int j=0; j<10; j++) {
				for(int k=0; k<=j; k++) {
					d[i][j] += d[i-1][k]%10007;
					d[i][j] %= 10007;
				}
			}
		}
		
		long result =0;
		for(int i =0; i<10; i++) {
				result += d[n][i]%10007;
			
		}
		System.out.println(result%10007);
	}

}
