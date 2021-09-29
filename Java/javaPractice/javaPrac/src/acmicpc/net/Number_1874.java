package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
//https://www.acmicpc.net/problem/1874
//ÇØ°á
public class Number_1874 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> stack = new Stack<Integer>();
		
		int n = Integer.parseInt(br.readLine());
		int nums[] = new int[n];
		List<Character> list = new ArrayList<Character>();
		
		for(int i =0; i<n; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		
		int cur =1;
		
		int index = 0;
		stack.add(0);
		Loop1 :
		for(int i =1; i<=n; i++) {
		
			while(true) {
			
			if(stack.peek() == nums[index]) {
				stack.pop();
				list.add('-');
				index++;
				break;
			}
			else if(stack.peek() > nums[index]) {
				while(stack.peek() != nums[index]) {
					stack.pop();
					list.add('-');
				}
			}
			else if(stack.peek() < nums[index]) {
				if(nums[index] <cur) {
					bw.write("NO\n");
					bw.flush();
					bw.close();
					br.close();
					return;
				}
				stack.add(cur++);
				list.add('+');
				continue;
			}
			
			}	
			
		}
		
		for(int i =0; i<list.size(); i++) {
			bw.write(list.get(i)+ "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
