package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.stream.Stream;

//복습 필요
public class Number_2098 {
	
	static int map[][];
	static int dp[][];
	static int n;
	static final int INF = 11000000;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		map = new int[n][];
		
		for(int i =0; i<n; i++) {
			map[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		
		dp = new int[n][(1 <<n) -1];
		
		for(int i =0; i<n; i++) {
			Arrays.fill(dp[i], INF);
		}
		
		bw.write(String.valueOf(dfs(0,1)));
		bw.flush();
		br.close();
		bw.close();
		}
	
	
	public static int dfs(int node, int visited) {
		
		if(visited == (1<<n)-1) {
			if(map[node][0] == 0) {
				return INF;
			}
			return map[node][0];
		}
		
		if(dp[node][visited] != INF) {
			return dp[node][visited];
		}
		
		for(int i =0; i<n; i++) {
			if((visited &(1<<i)) == 0  && map[node][i] !=0) {
				dp[node][visited] = Math.min(dp[node][visited], dfs(i, visited |(1<<i)) + map[node][i]);
			}
		}
		
		return dp[node][visited];
	}
	
	
	
}
