package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_15990 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		long d[][] = new long[100001][4];
		d[1][1] = 1;
		d[2][2] = 1;
		d[3][1] = 1;
		d[3][2] = 1;	
		d[3][3] = 1;
		
		for(int i =4; i<100001; i++) {
			d[i][1] =  (d[i-1][2]  % 1000000009 + d[i-1][3]  % 1000000009) % 1000000009;
			d[i][2] =  (d[i-2][1]  % 1000000009+ d[i-2][3]  % 1000000009) % 1000000009;
			d[i][3] =  (d[i-3][1]  % 1000000009 + d[i-3][2]  % 1000000009) % 1000000009;
		}
		
		for(int i = 0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			bw.write(String.valueOf((d[n][1]%1000000009+ d[n][2]%1000000009+d[n][3]%1000000009)%1000000009) + "\n" );
		}
	
		bw.flush();
		br.close();
		bw.close();
		}
}
