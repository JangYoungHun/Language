package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;
//https://www.acmicpc.net/problem/14502
// 해결

public class Number_14502 {
	
	static int result = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int nm[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer ::parseInt).toArray();
		int n = nm[0];
		int m = nm[1];
		int map[][] = new int[n][m];
		

		for(int i =0; i<n; i++) {
			map[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer ::parseInt).toArray();
		}
		
		CreateWall(map, n, m, 0); 
		
		
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		br.close();
	}

	
	static void bfs(int map[][],  int n, int m) {
		
		int copy[][] = new int[n][m];
		for(int i =0; i<n; i++) {
			for(int j =0; j<m; j++) {
				copy[i][j] = map[i][j];
			}
			}
		boolean visited[][] = new boolean[n][m];
		Queue<Integer> qx = new LinkedList<Integer>();
		Queue<Integer> qy = new LinkedList<Integer>();
		
		for(int i =0; i<n; i++) {
			for(int j =0; j<m; j++) {
				if(copy[i][j] == 2) {
					qx.add(i);
					qy.add(j);
					visited[i][j] = true;
				}
			}
		}
		
		while(!qx.isEmpty() && !qy.isEmpty()) {
			
			int x = qx.poll();
			int y = qy.poll();
			//아래
			if(x+1 <n && !visited[x+1][y] && copy[x+1][y]== 0 ) {
				qx.add(x+1);
				qy.add(y);
				visited[x+1][y] =true;
				copy[x+1][y] = 2;
			}
			//위
			if(0 <= x-1&& !visited[x-1][y] && copy[x-1][y]== 0 ) {
				qx.add(x-1);
				qy.add(y);
				visited[x-1][y] =true;
				copy[x-1][y] = 2;
			}
			//왼
			
			if(0 <= y-1&& !visited[x][y-1] && copy[x][y-1]== 0 ) {
				qx.add(x);
				qy.add(y-1);
				visited[x][y-1] =true;
				copy[x][y-1] = 2;
			}
			// 오른
			if( y+1 < m && !visited[x][y+1] &&copy[x][y+1] == 0 ) {
				qx.add(x);
				qy.add(y+1);
				visited[x][y+1] =true;
				copy[x][y+1] = 2;
			}
		}
		// 0 개수 
		int count =0;
		for(int i =0; i<n; i++) {
			for(int j =0; j<m; j++) {
				if(copy[i][j] == 0)
					count ++;
			}
		}	
		result = Math.max(result, count);
	}
	
	static void CreateWall(int map[][], int n, int m, int count) {
		if(count ==3) {
			 bfs(map,  n,  m) ;
			 return;
		}
		for(int i =0; i<n; i++) {
			for(int j =0; j<m; j++) {
				if(map[i][j] == 0) {
					map[i][j] = 1;
					CreateWall(map, n,m, count+1); 
					map[i][j] = 0;
				}
					
			}
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
