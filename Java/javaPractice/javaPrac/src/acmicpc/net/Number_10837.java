package acmicpc.net;

import java.util.Scanner;
// https://www.acmicpc.net/problem/10837 문제
public class Number_10837 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		int K;
		int C;
		int[] M;
		int[] N;
		int[] round;  // 진행된 라운드
		int[] leftRound;
		int[] result;
		int scoreDiff; // 점수 차
		int turn = 0;  // 0= 영희 턴   1 = 동수 턴	
		K = scanner.nextInt(); 
		C = scanner.nextInt();
		
		M = new int[C];
		N = new int[C];
		round = new int[C];		
		result = new int[C];
		scanner.nextLine(); // 버퍼 지우기
		
		for(int i =0; i < C; i++) {
			
		String str =scanner.nextLine();
		String[] strs = str.split(" ");

		 
		M[i] = Integer.parseInt(strs[0]);
		N[i] = Integer.parseInt(strs[1]);		
		
		}
		// 해결못함
		for(int i =0; i < C; i++) {			
			
	//	 scoreDiff = M[i] > N[i] ? (M[i] -  N[i]) : (N[i] -  M[i]);
		 
			if(M[i] == N[i])
			{result[i] = 1;}
			
			else if(M[i] > N[i]) {
				
			 if(2*M[i] <= K+N[i])
				 result[i] = 1;				 
		 }
		 
			else if(M[i] < N[i]) {
				
				 if(2*N[i]<=K+M[i]+1)
					 result[i] = 1;					 
			 }
		 
		 	 
		 System.out.println(result[i]);

		}

}
}