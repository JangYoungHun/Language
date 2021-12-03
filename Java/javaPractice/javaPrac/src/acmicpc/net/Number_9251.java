package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

//https://www.acmicpc.net/problem/9251
//LCS
//ÇØ°á
public class Number_9251 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int n = str1.length();
		int m = str2.length();
		
		int arr[][] = new int [n+1][m+1];
		
		for(int i =0; i<n; i++) {
			char ch = str1.charAt(i);
			for(int j =0; j<m; j++) {
				if(ch == str2.charAt(j)) {
					arr[i+1][j+1] = arr[i][j]+1;
				}
				else {
					arr[i+1][j+1] = Math.max(arr[i][j+1], arr[i+1][j]);
				}
			}
		}
		
		System.out.println(arr[n][m]);
		bw.flush();
		bw.close();
		br.close();
	}

}
