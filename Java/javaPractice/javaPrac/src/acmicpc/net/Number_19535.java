package acmicpc.net;

import java.util.Scanner;

//미해결 
// 메모리 초과

public class Number_19535 {
	static int bridge[][];
	static int N;
	static int G=0;
	static int D=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		bridge = new int[N+1][N+1];
		 int input[] = new int[2*N];
		 
		 int k =0;
		for(int i =0; i<N-1; i++) {
			int index1 = sc.nextInt();
			input[k] = index1;
			int index2 = sc.nextInt();
			input[k+1] = index2;
			bridge[index1][index2] =1;
			bridge[index2][index1] =1;	
			k += 2;
		}
	
		for(int i=0; i<N; i+=2) {
			 D += bridgeNum(input[i],input[i+1]) * bridgeNum(input[i+1],input[i]); 		
		}
		
		for(int i=0; i<N+1; i++) {
			findG(i);
		}
		
		
		if(G != 0 && D/G==3 && D%G ==0)
			System.out.println("DUDUDUNGA");
		else{
			if(D > G)
				System.out.println("D");
			else if(G > D)
					System.out.println("G");
		}
	}
		static int bridgeNum(int start, int except) {
				int returnNum =0;
			for(int i=1; i<N+1; i++) {
				if(bridge[start][i] ==1 && i != except) {
					returnNum++;
				}			
			}	
			return returnNum;
		}	
		
		static void findG(int start) {			
		int bridgeNum = 0;		
		for(int i =0; i<N+1; i++) {
			if(bridge[start][i] ==1){
				bridgeNum++;
			}			
		}	
		if(bridgeNum >= 3) {
			//nC3     
			G += factorial(bridgeNum) / factorial(bridgeNum-3)/factorial(3);		
		}		
	}
	static int factorial(int n) {	
		
		if(n==0)
			return 1;		
		if(n <= 1)
			return n;
		return factorial(n-1) * n;	
	}
		
		
		
		
		
//		for(int i =1; i< N+1; i++) {
//		findD(i,0, new int[N+1]);
//		findG(i);
//		}
////		System.out.println(D/2);
////		System.out.println(G);
//		
//		D = D/2;
//		
//		if(G != 0 && D/G==3 && D%G ==0)
//			System.out.println("DUDUDUNGA");
//		else{
//			if(D > G)
//				System.out.println("D");
//			else if(G > D)
//					System.out.println("G");
//		}
//			
//	}
//	
//	static void findD(int start, int count, int[] visited) {	
//		if(count == 3) {
//			D++;
//			return;
//		}	
//		visited[start] = 1;
//		for(int i=0; i<N+1; i++) {
//			if(bridge[start][i] == 1 && visited[i] !=1) {		
//				findD(i ,count+1,visited);
//			}	
//		}
//			return;
//	}
//	
//	static void findG(int start) {	
//		
//		int bridgeNum = 0;
//		
//		for(int i =0; i<N+1; i++) {
//			if(bridge[start][i] ==1){
//				bridgeNum++;
//			}			
//		}
//		
//		if(bridgeNum >= 3) {
//			//nC3     
//			G += factorial(bridgeNum) / factorial(bridgeNum-3)/factorial(3);
//			
//		}
//		
//	}
//
//	static int factorial(int n) {	
//		
//		if(n==0)
//			return 1;
//		
//		if(n <= 1)
//			return n;
//	
//		return factorial(n-1) * n;
//		
//	}
//	

}
