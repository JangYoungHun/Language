package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

import java.util.Queue;
import java.util.stream.Stream;

//https://www.acmicpc.net/problem/2206
//ÇØ°á
public class Number_2206 {

	static class Node {
	
		int x;
		int y;
		int wall;
		Node(int x, int y, int wall) {
			this.x = x;
			this.y = y;
			this.wall = wall;
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int result = -1;

		int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = arr[0];
		int m = arr[1];
		int map[][] = new int[n][m];

		for (int i = 0; i < n; i++) {
			map[i] = Stream.of(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
		}

		int num = solution(map, n, m);
		
		if(num != -1) {
			result = num;
		}
		
		System.out.println(result);

		bw.flush();
		bw.close();
		br.close();
	}

	static int solution(int map[][],int n, int m) {
			
			int cnt = 0;
			
			boolean[][][] visited = new boolean[n][m][2];

			visited[0][0][0] = true;
			
			int[][] move = {
					{0,1},
					{0,-1},
					{1,0},
					{-1,0}
			};
			
			Queue<Node> q = new LinkedList<Node>();
			
			q.add(new Node(0, 0, 0));
			

			while(!q.isEmpty()) {
				int qSize = q.size();
				 cnt ++;				 
				for(int i =0; i<qSize; i++) {
					Node top = q.poll();
					
					 if(top.x == n-1 && top.y == m-1){
						 return cnt;
					 }
					 
					for(int j=0; j<move.length; j++) {
						int x = top.x+move[j][0];
						int y = top.y+move[j][1];
						
						if(x<0 || n<=x || y<0 || m <= y)
							continue;
						
						if(top.wall == 1 ) {
						 if(map[x][y] == 0 &&!visited[x][y][1]) {
							 visited[x][y][1] = true;
							 q.add(new Node(x,y,1));
						 }
						}
						else if(top.wall == 0){
							 if(map[x][y] == 0 && !visited[x][y][0]) {
								 visited[x][y][0] = true;
								 q.add(new Node(x,y,0));
							 }
							 else  if(map[x][y] == 1&&!visited[x][y][0]) {
								 visited[x][y][0] = true;
								 q.add(new Node(x,y,1));
							 }
						}
						
						
					}
				}				
			}
			return -1;
		}
}
