package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//ÇØ°á
public class Number_1701 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int result = 0;
		
		for(int i=0; i<=str.length(); i++) {
			char[] part = str.substring(i,str.length()).toCharArray();
			
			int arr[] = new int[part.length];
			
			int j=0;
			for(int k =1; k<part.length; k++ ) {
				while(j>0 && part[j] != part[k]) {
					j = arr[j-1];
				}
				if(part[j] == part[k]) {
					arr[k] = ++j;
				}else {
					arr[k] = 0;
				}
			}
			
			for(int p =0; p< arr.length; p++) {
				result = Math.max(result, arr[p]);
			}
			
		}
		
		bw.write(String.valueOf(result));
		
		
		bw.flush();
		br.close();
		bw.close();
		}
	
}
