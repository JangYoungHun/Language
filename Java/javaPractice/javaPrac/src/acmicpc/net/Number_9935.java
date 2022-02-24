package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

//ÇØ°á
public class Number_9935 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		String bomb = br.readLine();
		int n = bomb.length();
		StringBuilder sb = new StringBuilder();

		Stack<Character> stack = new Stack<Character>();

		for (int i=0; i<str.length(); i++) {
			if(stack.size() <n-1) {
				stack.add(str.charAt(i));
			}else {
				char c3 = str.charAt(i) ;
				char c4 =bomb.charAt(n-1);
				if(c3 == c4) {
					boolean flag = true;
					for(int k =0; k<n-1; k++) {
						char c1 =stack.elementAt(stack.size()-1-k);
						char c2 =bomb.charAt(n-2-k);
						if(c1 != c2) {
							flag = false;
							break;
						}
					}
					if(flag) {
						for(int k=0; k<n-1; k++) {
							stack.pop();
						}
					}else {
						stack.add(str.charAt(i));
					}	
				}else {
					stack.add(str.charAt(i));
				}	
				
			}
		}
		
		if(stack.isEmpty())
			bw.write("FRULA");
		else {
			for(int i =0; i<stack.size(); i++) {
				bw.write(stack.elementAt(i));
			}
		}
		bw.flush();
		br.close();
		bw.close();
	}

}
