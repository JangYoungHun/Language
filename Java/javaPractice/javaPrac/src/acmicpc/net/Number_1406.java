package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

//ÇØ°á
public class Number_1406 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	


		Stack<Character> front = new Stack<Character>();
		Stack<Character> back= new Stack<Character>();
		for(char ch : br.readLine().toCharArray()) {
			front.push(ch);
		}
		int n = Integer.parseInt(br.readLine());
		

		
		for(int i =0; i<n; i++) {
			String command[] = br.readLine().split(" ");
			String com = command[0];
			Character ch = ' ';
			if(command.length >1)
			   ch = command[1].charAt(0);
			
			switch(com) {
			case "L": 
				if(!front.isEmpty())
					back.push(front.pop());
				break;
			case "D":
				if(!back.isEmpty())
					front.push(back.pop());
				break;
			case "B":{
				if(!front.isEmpty())
					front.pop();
			}
				break;
			case "P":{
				front.push(ch);
			}
				break;
			}
			
		}
		
		StringBuilder sb = new StringBuilder();
		
		while(!front.isEmpty()) {
			sb.append(front.pop());
		}
		sb = sb.reverse();
		
		while(!back.isEmpty()) {
			sb.append(back.pop());
		}
		bw.write(sb.toString());
		
		bw.flush();
		bw.close();
		br.close();
	}

}
