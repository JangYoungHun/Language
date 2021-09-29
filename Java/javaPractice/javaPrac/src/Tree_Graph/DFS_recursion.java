package Tree_Graph;

import java.util.Scanner;
import java.util.Stack;
// https://www.youtube.com/watch?v=0Njv04WiLV0
// 재귀를 이용한 DFS
public class DFS_recursion {


	static final int MAX_N = 10;  //노드 개수
	static int N, E;    // 노드 개수 , 다리 개수
	static int[][] Graph = new int[MAX_N][MAX_N];  //인접 노드 체크 0 1
	static boolean Visited[] = new boolean[MAX_N]; //방문체크
	
	static void dfs(int node) {
		Visited[node] = true;
		System.out.print(node+ " ");
		
		for(int next = 0; next <N; ++next) {
			
			if(!Visited[next] && Graph[node][next] !=0 ) {
				dfs(next);			
			}			
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();		
		E = scanner.nextInt();
		
		for(int i = 0; i<E; i++) {
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			Graph[num1][num2] = Graph[num2][num1] = 1; 
						
		}		
		dfs(0);	 
	}
}
