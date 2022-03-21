package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.stream.Stream;

public class Number_12865 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] nk = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = nk[0];
		int k = nk[1];
		
		int w[] = new int[n+1];
		int p[] = new int[n+1];
		
		int [][] dp = new int[n+1][k+1];
		
		for(int i =1; i<=n; i++) {
			int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			w[i] = arr[0];
			p[i] = arr[1];
		}
		
		
		for(int i =1; i<=n; i++) {
			for(int j =1; j<=k; j++) {
				dp[i][j] = dp[i-1][j];
				if(j-w[i] >=0) {
					dp[i][j] = Math.max(dp[i-1][j], p[i] + dp[i-1][j-w[i]]);
				}
			}
		}
		
		bw.write(String.valueOf(dp[n][k]));
		
		bw.flush();
		br.close();
		bw.close();
		}

}
