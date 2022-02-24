package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

//ÇØ°á
public class Number_1316 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int result =0;
		
		for(int i=0; i<n; i++) {
			result += check(br.readLine()); 
		}
		
		bw.write(String.valueOf(result));
		
		bw.flush();
		br.close();
		bw.close();
		}
	
	
	public static int check(String str) {
		HashMap<Character, Boolean> h = new HashMap<Character, Boolean>();
		
		char before = ' ';
		for(char ch : str.toCharArray()) {
			if(ch != before && h.get(ch) != null) {
				return 0;
			}
			h.put(ch, true);
			before = ch;
		}
		return 1;
	}
	
}
