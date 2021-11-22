package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

//ÇØ°á
public class Number_17425 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long d[] = new long[1000000 + 1];
		Arrays.fill(d, 1);
		d[0] = 0;
	
		for (int j = 2; j <= 1000000; j++) {
			for (int k = 1; j * k <= 1000000; k++) {
				d[j * k] += j;
			}
		}
		
		for(int i = 1; i<=1000000; i++) {
			d[i] = d[i-1] + d[i];
		}
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			bw.write(String.valueOf(d[n]) + "\n");	
		}

		bw.flush();
		bw.close();
		br.close();
	}

}
