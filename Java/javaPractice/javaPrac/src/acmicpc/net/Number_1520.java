package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class Number_1520{
	
	static int map[][];
	static int d[][];
	static boolean visited[][];
	static int n;
	static int m;
	static int result = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] mn = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		m = mn[0];
		n = mn[1];
		d = new int[m][n];
		visited = new boolean[m][n];
		map= new int[m][];
		
		for(int i =0; i<m; i++) {
			map[i] =  Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}

		bw.write(String.valueOf(dfs(0, 0)));
		bw.flush();
		br.close();
		bw.close();
		}
	
	static int dfs(int x, int y) {
		
		if(visited[x][y]) {
			return d[x][y];		
		}
		if( (x ==m-1 && y==n-1)) {
			return 1;
		}

		if(0<=x-1 && map[x-1][y] < map[x][y]) {
			d[x][y] += dfs(x-1, y);
		}
		if(x+1<m && map[x+1][y] < map[x][y]) {
			d[x][y] += dfs(x+1, y);
		}
		if(0<=y-1 && map[x][y-1] < map[x][y]) {
			d[x][y] += dfs(x, y-1);
		}
		if(y+1 <n && map[x][y+1] < map[x][y]) {
			d[x][y] += dfs(x, y+1);
		}
		
		visited[x][y] = true;
		return d[x][y];
	}
	
}
