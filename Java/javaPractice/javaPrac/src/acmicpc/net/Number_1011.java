package acmicpc.net;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1011
// ÇØ°á
public class Number_1011 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		for(int i=0; i<N; i++) {
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			int num3 = num2-num1;
			int cnt =0;
			int k =0;
			while(true)
			{
				if(k*(k+1) < num3) {
					cnt ++;
				}
				else {
					break;
				}			
				if(Math.pow((k+1), 2 ) < num3) {
					cnt ++;
				}
				else {
					break;
				}
				
				k++;			
			}
				System.out.println(cnt);
		}
	}

}
