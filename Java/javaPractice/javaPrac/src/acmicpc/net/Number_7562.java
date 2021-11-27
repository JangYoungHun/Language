package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

//ÇØ°á
public class Number_7562 {
	
	static class Pos{
		int x;
		int y;
		int time;
		public Pos(int x, int y,int time) {
			this.time = time;
			this.x = x;
			this.y = y;
		}
	
	}
	
	public static void main(String[] args) throws IOException {
		int arr[][] = {
				{-1,-1,-2,-2,1,1,2,2},
				{2,-2,1,-1,2,-2,1,-1}
		};
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			
			int result = Integer.MAX_VALUE;
			
			int n = Integer.parseInt(br.readLine());
			int visited[][] = new int[n][n]; 
			for(int p = 0; p<n; p++) {
				for(int q = 0; q<n; q++) {
					visited[p][q] = Integer.MAX_VALUE;					
				}
			}
			int pos[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			Pos curPos = new Pos(pos[0], pos[1],0);
			int goal[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			Queue<Pos> q = new LinkedList<Pos>();
			
			q.add(curPos);
			visited[pos[0]][pos[1]] = 0;
			
			while(!q.isEmpty()) {
				Pos cur = q.poll();
				int x = cur.x;
				int y = cur.y;
				int time = cur.time;
				
				if(x == goal[0] && y == goal[1]) {
					result = Math.min(result, time);
					continue;
				}
				
				for(int k =0; k<arr[0].length; k++) {
					int nextX = x+arr[0][k];
					int nextY = y+arr[1][k];
					
					if(nextX < 0 || nextX >= n || nextY < 0 || nextY >= n)
						continue;
					
					if(visited[nextX][nextY] > time+1) {
						Pos next = new Pos(nextX,nextY,time+1);
						q.add(next);
						visited[nextX][nextY] = time+1;
					}	
				}
			}

			System.out.println(result);
		}
		
		
		br.close();
	}

}
