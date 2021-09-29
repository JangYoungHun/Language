package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.stream.Stream;

//https://www.acmicpc.net/problem/1932
// ÇØ°á
public class Number_1932 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		
		int n = Integer.parseInt(br.readLine());
		
		int p[][] = new int[n][];
		
		for(int i =0; i<n; i++) {
			p[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer ::parseInt).toArray();
		}
		
		for(int i =1; i<n; i++) {
			for(int j = 0; j<p[i].length; j++) {
				if(j>0) {
					if(j == p[i-1].length)
						p[i][j] += p[i-1][j-1] ;
					else
						p[i][j] += Math.max(p[i-1][j], p[i-1][j-1]);
				}
				else
					p[i][j] += p[i-1][j];
			}	
		}
		long result = Long.MIN_VALUE;
		for(int i =0; i<p[n-1].length; i++) {
			result = Math.max(result, p[n-1][i]);
		}
		
		bw.write(String.valueOf(result));

		bw.flush();
		bw.close();
		br.close();

		
	}

}
