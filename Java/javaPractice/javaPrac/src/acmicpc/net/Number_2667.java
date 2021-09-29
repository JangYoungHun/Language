package acmicpc.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://www.acmicpc.net/status?user_id=wdg2325&problem_id=2667&from_mine=1
// ÇØ°á
public class Number_2667 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		int n = Integer.parseInt(br.readLine());
		boolean visited[][] = new boolean[n][n];
		char map[][] = new char[n][n];
		for(int i =0; i< n; i++) {
			map[i] = br.readLine().toCharArray();
		}
		List<Integer> results = new ArrayList<Integer>();
		
		Queue<Integer> qx = new LinkedList<Integer>();
		Queue<Integer> qy = new LinkedList<Integer>();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {			
				if(!visited[i][j] && map[i][j] == '1') {
					qx.add(i);
					qy.add(j);				
					visited[i][j] = true;
					int cnt =0;
					while(!qx.isEmpty() && !qy.isEmpty()) {
						
						int x = qx.poll();
						int y = qy.poll(); 
						cnt ++;
						if( x+1 <n && map[x+1][y] == '1'&& !visited[x+1][y]) {
							qx.add(x+1);
							qy.add(y);
							visited[x+1][y] = true;
						}
						if( 0 <= x-1 && map[x-1][y] == '1'&&!visited[x-1][y]) {
							qx.add(x-1);
							qy.add(y);
							visited[x-1][y] = true;
						}
						if(y+1 <n&& map[x][y+1] == '1'&& !visited[x][y+1]) {
							qx.add(x);
							qy.add(y+1);
							visited[x][y+1] = true;
						}
						if(0 <= y-1 &&  map[x][y-1] == '1'&&!visited[x][y-1]) {
							qx.add(x);
							qy.add(y-1);
							visited[x][y-1] = true;
						}
					}
					results.add(cnt);
				}
				
			}
		}

		
		Collections.sort(results);
		System.out.println(results.size());
		for(int i=0; i < results.size(); i++) {
			System.out.println(results.get(i));
		}
		
		br.close();

	}

}
