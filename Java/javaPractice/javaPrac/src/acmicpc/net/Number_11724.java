package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.stream.Stream;

//https://www.acmicpc.net/problem/11724
// 해결
public class Number_11724 {
	static int n ;
	static int m  ;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int nm[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		n = nm[0];
		m = nm[1];
		
		boolean bridge[][] = new boolean[n+1][n+1];
		boolean visited[] = new boolean[n+1];
		
		for(int i =0; i<m; i++) {
			
			int data[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			bridge[data[0]][data[1]] = true;
			bridge[data[1]][data[0]] = true;
		}
		
		int cnt =0;
		
		for(int i =1; i<=n; i++) {
			// 방문 X
			if(!visited[i]) {
				recur(visited, bridge,i);
				cnt++;
			}
		}
		
		
		bw.write(String.valueOf(cnt));
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	
	static void recur(boolean visited[], boolean bridge[][], int index) {
		if(!visited[index]) {
			visited[index] = true;
			for(int j=1; j<n+1; j++) {
				if(bridge[index][j]) {
					recur(visited,bridge, j);
				}
			}
	}
	}
	
}

