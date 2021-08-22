package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

//https://www.acmicpc.net/problem/4963
// ÇØ°á
public class Number_4963 {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int moveX[] = {0,1,-1};
		int moveY[] = {0,1,-1};
		
		while(true){
			
		int wh[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		if(wh[0] == 0 && wh[1] ==0)
			break;
		
		int w = wh[0];
		int h = wh[1];
		
		int map[][] = new int[h][w];
		boolean visited[][] = new boolean[h][w];
		
		for(int i =0; i<h; i++) {
			
			map[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
		}
		
		Queue<Integer> qX = new LinkedList<Integer>();
		Queue<Integer> qY = new LinkedList<Integer>();
		
		int cnt =0;
		
		for(int i =0; i<h; i++) {
			for(int j =0; j<w; j++) {
				
			if( map[i][j] == 1 && !visited[i][j] ) {
				visited[i][j]  = true;
				 cnt ++;
				qX.add(i);
				qY.add(j);
				
				while(!qX.isEmpty() && !qY.isEmpty()) {
					int x = qX.poll();
					int y = qY.poll();
					
					for(int p =0; p <moveX.length; p++) {
						for(int k =0; k <moveY.length; k++) {
							int nextX = x+moveX[p];
							int nextY = y+moveY[k];
							if( 0 > nextX  || nextX >= h || 0> nextY || nextY >= w ) 
								continue;
								
								if(!visited[nextX][nextY] && map[nextX][nextY] == 1) {
									visited[nextX][nextY] = true;
									qX.add(nextX);
									qY.add(nextY);
								}
							
						}
					}
				}
			}
		
		}
		}
		
		bw.write(String.valueOf(cnt) + "\n");
	}
		
		bw.flush();
		bw.close();
		br.close();

	}
	
}

