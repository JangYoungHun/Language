package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// ÇØ°á
public class Number_17413 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		StringBuilder answer = new StringBuilder();
		StringBuilder sb = new StringBuilder();
		boolean open = false;
		for(int i=0; i<str.length(); i++) {		
			char ch = str.charAt(i);
			if(!open) {
				if(ch == '<') {		
					answer.append(sb.reverse().toString());
					answer.append("<");			
					sb =  new StringBuilder();
					open = true;
				}
				else if(ch == ' ') {				
					answer.append(sb.reverse().toString());
					answer.append(ch);
					sb =  new StringBuilder();
				}
				else {
					sb.append(ch);
				}
			}

			else {
				answer.append(ch);
				if(ch == '>') {
					open = false;			
				}			
			}
		}
		
		answer.append(sb.reverse().toString());
		
		bw.write(answer.toString());
		bw.flush();
		br.close();
		bw.close();
		}

}
