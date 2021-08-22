package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.stream.Stream;

//https://www.acmicpc.net/problem/1149
// ÇØ°á
public class Number_1149 {
	
	static long result = Long.MAX_VALUE;
	static int n ;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
	
		n = Integer.parseInt(br.readLine());

		int a[][] = new int[n+1][3];
		int d[][] = new int[n+1][3];

		
		for(int i =1; i<=n; i++) {
			a[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer ::parseInt).toArray();
		}
		
		for(int i=1; i <=n; i++) {
			d[i][0] = Math.min(d[i-1][1],d[i-1][2])+ a[i][0];
			d[i][1] = Math.min(d[i-1][0],d[i-1][2])+ a[i][1];
			d[i][2] = Math.min(d[i-1][0],d[i-1][1])+ a[i][2];
		}
		
		bw.write( String.valueOf(Math.min(Math.min(d[n][0], d[n][1]) , d[n][2])) );
	
		bw.flush();
		bw.close();
		br.close();
	}

	}
	

