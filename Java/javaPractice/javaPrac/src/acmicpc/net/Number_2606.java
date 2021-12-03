package acmicpc.net;

import java.util.Scanner;
import java.util.Stack;
//https://www.acmicpc.net/problem/2606
//해결

public class Number_2606 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		int cnt=0;
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int bridgeNum =  scanner.nextInt();
		int visited[] = new int[N+1];
		int bridge[][] = new int[N+1][N+1];		
		for(int i =0; i<bridgeNum; i++) {
			int index1 = scanner.nextInt();
			int index2 = scanner.nextInt();
			bridge[index1][index2]= 1;
			bridge[index2][index1]= 1;
		}
		
		stack.push(1);

		
		while(!stack.isEmpty()) {
			
			int pop = stack.pop();
			
			if(visited[pop] == 1) continue;  // 이미 나왔던 것이라면 건너 뛰어라	
			
	
			visited[pop] = 1;
			
			for(int i =1; i<N+1; i++) {
				if(visited[i] != 1 && bridge[pop][i] == 1) {
					stack.push(i);					
				}	
			}		
		}
		for(int i =1; i<N+1; i++) {
			if(visited[i] == 1)
				cnt++;
		}
		
		System.out.println(cnt-1);
		
	}

}
