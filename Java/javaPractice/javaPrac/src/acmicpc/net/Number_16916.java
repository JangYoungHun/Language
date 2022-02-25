package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

//ÇØ°á
public class Number_16916 {
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] str = br.readLine().toCharArray();
		char[] p = br.readLine().toCharArray();
		
		boolean result = false;
		int arr[] = new int[p.length];
		
		int j =0;
		for(int i =1; i<p.length; i++) {
			while(j>0 && p[i] != p[j]) {
				j = arr[j-1];
			}
			if(p[i] == p[j]) {
				arr[i] = ++j;
			}
		}
		
		
		int t =0;
		for(int k =0; k<str.length; k++) {
			while( t>0 && str[k]!=p[t]) {
				t = arr[t-1];
			}
			if(str[k]==p[t]) {
				if(t==p.length-1) {
					result = true;
					break;
				}else {
					t++;
				}
			}
		}
		
		bw.write(result ? "1" : "0");
		bw.flush();
		br.close();
		bw.close();
		}
	

}
