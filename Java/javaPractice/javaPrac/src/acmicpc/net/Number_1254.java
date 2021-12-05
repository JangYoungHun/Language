package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Number_1254 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int answer = 0;
		String str = br.readLine();
		
		for(int i =0; i<str.length(); i++) {
			String s = str.substring(i);
			boolean result = ispan(s);
			if(result) {
				answer = i+str.length();	
				bw.write(String.valueOf(answer));				
				bw.flush();
				br.close();
				bw.close();
				return;
			}		
		}
		answer = str.length()*2;
		
		bw.write(String.valueOf(answer));
		
		bw.flush();
		br.close();
		bw.close();
		}
	
	public static boolean ispan(String str) {
		
		int start = 0;
		int end = str.length()-1;
		
		while(start < end) {
			if(str.charAt(start) != str.charAt(end)) {
				return false;
			}
			else {
				start++;
				end--;
			}
		}
		
		return true;
		
	}
}

