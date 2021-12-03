package acmicpc.net;
// https://www.acmicpc.net/problem/1260
// ÇØ°á
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Number_1260 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in); 
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int start = scanner.nextInt();
	
		
		boolean bridge[][] = new boolean[N+1][N+1];
		boolean visited[] = new boolean[N+1];
		
		for(int i=0; i< M; i++) {
			int index1 = scanner.nextInt();
			int index2 = scanner.nextInt();
			bridge[index1][index2] = true;
			bridge[index2][index1] = true;
		}
		
		//DFS
		Stack<Integer> stack = new Stack<Integer>();	
		
		stack.push(start);
		
		while(!stack.isEmpty()) {
			
			int top = stack.pop();
				
			if(visited[top] == true) continue;
			
			visited[top] = true;
			System.out.print(top+" ");
		
			for(int i = N; i>0; i--) {
				if(!visited[i] && bridge[top][i])
					stack.push(i);			 
			}
					
		}	
		
		System.out.println();
		visited = new boolean[N+1];
		
		//BFS
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(start);
		
		while(!queue.isEmpty()) {
			
			int top = queue.poll();
			
			if(visited[top] == true) continue;
			
			visited[top] = true;
			System.out.print(top+" ");
			
			for(int i=1; i<N+1; i++) {
				
				if(visited[i] != true && bridge[top][i]) {
					queue.add(i);
					
				}
				
			}
			
			
		}
		
	}

}
