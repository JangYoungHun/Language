package Tree_Graph;

import java.util.Scanner;
import java.util.Stack;
// https://www.youtube.com/watch?v=0Njv04WiLV0
// Stack �� �̿��� DFS
public class DFS_Stack {

	static final int MAX_N = 10;  //��� ����
	static int N, E;    // ��� ���� , �ٸ� ����
	static int[][] Graph = new int[MAX_N][MAX_N];  //���� ��� üũ 0 1
	
	
	static void dfs(int node) {
		boolean Visited[] = new boolean[MAX_N]; //�湮üũ
		
		Stack<Integer> stack = new Stack<>();
		stack.push(node);
		
		while(!stack.isEmpty()) {
			
			int curr = stack.pop();
			
			if(Visited[curr]) continue;  // �̹� ���Դ� ���̶�� �ǳ� �پ��		
			
			Visited[curr] = true;
			System.out.print(curr + " ");
			
			for(int next =0; next < N ; ++next) {
				if(!Visited[next] && Graph[curr][next] !=0) {
					stack.push(next);
					
				}				
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
