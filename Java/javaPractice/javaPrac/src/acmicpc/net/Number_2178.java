package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

//https://www.acmicpc.net/problem/11950
// 해결
public class Number_2178 {

	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String nm[] =br.readLine().split(" ");
		int n = Integer.parseInt( nm[0] );
		int m =  Integer.parseInt( nm[1] );
		int moveCnt[][] = new int[n][m];
		moveCnt[0][0] = 1;
		boolean visited[][]= new boolean[n][m];
		char map[][] = new char[n][m];
		
		for(int i=0; i<n; i++) {
			map[i] = br.readLine().toCharArray();
		}

		
		Queue<Integer> qx = new LinkedList<Integer>();
		Queue<Integer> qy = new LinkedList<Integer>();
		
		qx.add(0);
		qy.add(0);
		visited[0][0] = true;
		
		while(!qx.isEmpty() && !qy.isEmpty()) {
			
			int x = qx.poll();
			int y = qy.poll();
		
			
			if(x== n-1 && y ==m-1)
				break;
			
		
			   // 아래
			if( x+1 <n && map[x+1][y] == '1' &&!visited[x+1][y]) {
				qx.add(x+1); 
				qy.add(y);
				moveCnt[x+1][y] = moveCnt[x][y]+1;
				visited[x+1][y] = true;
			}
			   // 위
			if( 0<= x - 1  && map[x-1][y] == '1' &&!visited[x-1][y]) {
				qx.add(x-1); 
				qy.add(y);	
				moveCnt[x-1][y] = moveCnt[x][y]+1;
				visited[x-1][y] = true;
			}
			// 오른쪽
			if( y+1< m  && map[x][y+1] == '1' &&!visited[x][y+1]) {
				qx.add(x); 
				qy.add(y+1);
				moveCnt[x][y+1] = moveCnt[x][y]+1;
				visited[x][y+1] = true;
			}
			//왼쪽
			if( 0<= y - 1  && map[x][y-1] == '1' &&!visited[x][y-1]) {
				qx.add(x); 
				qy.add(y-1);
				moveCnt[x][y-1] = moveCnt[x][y]+1;
				visited[x][y-1] = true;
			}
		}
		
		
		
		System.out.println(moveCnt[n-1][m-1]);
	}


}
