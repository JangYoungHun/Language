package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

//https://www.acmicpc.net/problem/7576
// 해결

public class Number_7576 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int mn[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int m = mn[0];
		int n = mn[1];
				
		int map[][] = new int[n][m];
		boolean matured[][] = new boolean[n][m];
		
		for(int i =0; i<n; i++) {
			map[i] =  Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		
		Queue<Integer> qx = new LinkedList<Integer>();	
		Queue<Integer> qy = new LinkedList<Integer>();
		
		for(int i =0; i<n; i++) {		
			for(int j =0; j<m; j++) {
				if(map[i][j] == 1) {
					qx.add(i);
					qy.add(j);
					matured[i][j] = true;
				}
				else if(map[i][j] == -1) {
					matured[i][j] = true;
				}
			}		
		}
		
		int cnt =-1;
		while(!qx.isEmpty() && !qy.isEmpty()) {
			int qsize = qx.size();
			for(int i =0; i<qsize ; i++) {
				int x = qx.poll();
				int y = qy.poll();
			
			//오른쪽
				if(y+1<m && !matured[x][y+1] && map[x][y+1] != -1) {
					matured[x][y+1] = true;
					qx.add(x);
					qy.add(y+1);
				}
				//왼쪽
				if(0 <=y-1 && !matured[x][y-1] && map[x][y-1] != -1) {
					matured[x][y-1] = true;
					qx.add(x);
					qy.add(y-1);
				}
				//위쪽
				if(0 <=x-1 && !matured[x-1][y] && map[x-1][y] != -1) {
					matured[x-1][y] = true;
					qx.add(x-1);
					qy.add(y);
				}
				//아래쪽
				if(x+1 <n && !matured[x+1][y] && map[x+1][y] != -1) {
					matured[x+1][y] = true;
					qx.add(x+1);
					qy.add(y);
				}
			}
		cnt++;
		}
		
		// 안익은것이 있는지 확인
		for(int i =0; i<n; i++) {		
			for(int j =0; j<m; j++) {
				if(!matured[i][j]) {
					bw.write("-1");
					bw.flush();
					return;
				}
			}		
		}
		
		
		bw.write(String.valueOf(cnt));
		
		bw.flush();
		bw.close();
		br.close();
	}

}
