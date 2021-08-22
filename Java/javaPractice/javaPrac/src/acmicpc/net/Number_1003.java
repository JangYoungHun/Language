package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//https://www.acmicpc.net/problem/1003
//ÇØ°á

public class Number_1003 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	
	public static void main(String[] args) throws IOException {

		int testCase = Integer.parseInt(br.readLine());
		int dnz[] = new int[41];  // zero 0  È½¼ö
		int dno[] = new int[41]; // one 1  È½¼ö

		dnz[0] = 1;
		dno[0] = 0;
		dnz[1] = 0;
		dno[1] = 1;
		for(int i =0; i<testCase; i++) {
			int N =Integer.parseInt(br.readLine());
			
		for(int j =2; j<N+1; j++) {
			dnz[j] = dnz[j-1] + dnz[j-2];		
			dno[j] = dno[j-1] + dno[j-2];
		}
			
		System.out.println(dnz[N]+" "+dno[N]);	
			
			
		}
		
		br.close();
		bw.close();
		
	}

	
}
