package acmicpc.net;

import java.util.Scanner;

//https://www.acmicpc.net/problem/15953
//예제 답은 나옴 
//미해결 
public class KakaoCodingTest2 {
	static int[] prize1 = {500,300,200,50,30,10};
	static int[] prize2 = {512,256,128,64,32};
	
	public static void main(String[] args) {
		
		int result =0;     // 총 상금 
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();     // 가정 횟수 
		
		for(int i = 0; i<T; i++) {
			
			int rank1 = sc.nextInt();
			int rank2 = sc.nextInt();
			
			//첫 번째 대회 상금
			if(rank1 <= 21 && rank1 != 0) {
				for(int j = 1; j <= 6; j++) {
					// 등차수열 합
					if(rank1<= (j*(j+1))/2) {     
						result +=prize1[j-1];
						break;
					}
				} 			
			}
			
			//두 번째 대회 상금
			if(rank2 <= 31 && rank2 != 0) {
				// 등비수열 합
				for(int j = 1; j <= 5; j++) {
					if(rank2<= (int)Math.pow(2, j)  - 1 ) {
						result += prize2[j-1];
						break;
					}
				} 			
			}			
			
			
			// 결과 출력
			System.out.println(result);
			result =0;		
		}		
	}

}
