package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//ÇØ°á
public class Number_5525 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int result =0;
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		char s[] = br.readLine().toCharArray();
		StringBuilder sb = new StringBuilder("I");
		for(int i=0; i<n; i++) {
			sb.append("OI");
		}
		char[] pattern = sb.toString().toCharArray();
		
		int arr[] = new int[pattern.length];
		
		int j =0;
		for(int i =1; i<pattern.length; i++) {
			while(j>0 && pattern[j] != pattern[i]) {
				j = arr[j-1];
			}
			if(pattern[j] == pattern[i]) {
				arr[i] = ++j;
			}else {
				arr[i] =0;
			}
		}
		
		int k =0;
		
		for(int i =0; i<s.length; i++) {
			while(k >0 && s[i] != pattern[k]) {
				k = arr[k-1];
			}
			if(s[i] == pattern[k]) {
				if( k == pattern.length-1 ) {
					k = arr[k];
					result++;
				}else {
					k++;
				}
			}
		}
		
		
		bw.write(String.valueOf(result));
		bw.flush();
		br.close();
		bw.close();
		}
	
}
