package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

//ÇØ°á
public class Number_10799 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine().replace("()", "r");
		int result = 0;
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (stack.isEmpty()) {
				if (ch != 'r')
					stack.push(ch);
			} else {
				char peek = stack.peek();
				if (peek == '(' && ch == ')') {
					stack.pop();
					result++;
				} else if (ch == 'r') {
					result += stack.size();
				} else {
					stack.push(ch);
				}
			}

		}
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		br.close();
	}
}
