package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.stream.Stream;

//복습필요
public class Number_1029 {
	static int n;
	static int dp[][][];
	static int[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Stream.of(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
		}
		
		dp = new int[n][1<<15][10];
		bw.write(String.valueOf(recur(0, 1, 0)));
		
		bw.flush();
		br.close();
		bw.close();
		}
	
	
	static int recur(int node, int visit, int cost) {
		
		if(visit == (1<<n)-1)
			return dp[node][visit][cost] = 1;
		
		if(dp[node][visit][cost] != 0)
			return dp[node][visit][cost];

		dp[node][visit][cost] = 1;
		
		for(int i =0; i<n; i++) {
			if((visit & (1<<i)) ==0  && arr[node][i]>= cost) {
				dp[node][visit][cost] = Math.max(dp[node][visit][cost], recur(i, visit | (1<<i), arr[node][i]) + 1);
			}
		}
		
		return dp[node][visit][cost];
	}
}
