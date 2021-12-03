package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.stream.Stream;


//https://www.acmicpc.net/status?user_id=wdg2325&problem_id=2493&from_mine=1
//ÇØ°á
public class Number_2493 {
	
	static class Node{
		int value;
		int index;
		Node(int value, int index){
			this.value = value;
			this.index = index;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int result[] = new int[n];
		
		Stack<Node> stack = new Stack<Node>();
		stack.push(new Node( Integer.parseInt(st.nextToken()), 1));
		int index =2;
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
				while(!stack.isEmpty()) {
					if(stack.peek().value < num) {
						stack.pop();
						}
					else
						break;
				}
				if(!stack.isEmpty())
					result[index-1] = stack.peek().index;
				stack.push(new Node(num, index++));
			}
			
			for(int i =0; i<n; i++) {
				bw.write(String.valueOf(result[i]));
				if(i != n-1)
					bw.write(" ");
			}
			bw.flush();
			br.close();
			bw.close();
		}
		


}
