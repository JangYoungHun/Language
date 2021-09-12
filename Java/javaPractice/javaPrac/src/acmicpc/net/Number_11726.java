package acmicpc.net;

import java.util.Scanner;

//https://www.acmicpc.net/problem/11726
public class Number_11726 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long d[] = new long[1001];
		d[1] = 1;
		d[2] = 2;
		d[3]= 3;
		
		for(int i =4; i<=n; i++) {
			d[i] = (d[i-2]+d[i-1])%10007;
		}
		
		System.out.println(d[n]);
	}

}
