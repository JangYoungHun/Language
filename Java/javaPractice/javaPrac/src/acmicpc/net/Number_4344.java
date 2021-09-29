package acmicpc.net;

import java.util.Scanner;

//https://www.acmicpc.net/problem/4344
// ÇØ°á
public class Number_4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i =0; i <testCase; i++) {
			int N = sc.nextInt();
			float sum=0;
		
			int scores[] = new int[N] ;
			
			for(int j=0; j < N; j++) {
				int num = sc.nextInt();
				scores[j] = num;
				sum += num;
			}		
			float avg = sum/N;
			
			float beyond =0;
			
			for(int k=0; k < N; k++) {
				if(scores[k] > avg)
					beyond++;
			}
			
			System.out.print( String.format("%.3f", (beyond/N)*100 ));
			System.out.println("%");
		}
		
	}

}
