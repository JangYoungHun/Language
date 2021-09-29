package acmicpc.net;

import java.util.Arrays;
import java.util.Scanner;

//https://www.acmicpc.net/status?user_id=wdg2325&problem_id=11399&from_mine=1
// ÇØ°á

public class Number_11399 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int result =0;
		
		int N = scanner.nextInt();
		int P[] = new int[N];
		
		for(int i=0; i<N; i++) {
			P[i] = scanner.nextInt();		
		}

		Arrays.sort(P);
		
		int n =N;
		
		for(int i=0; i<N; i++) {
			result += P[i] * n;
			n--;
		}
		
		System.out.println(result);
		
	}

}
