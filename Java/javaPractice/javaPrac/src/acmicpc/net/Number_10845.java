package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

// ÇØ°á
public class Number_10845 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		Deque<Integer> q = new ArrayDeque<>();
		
		for(int i=0; i<t; i++) {
			String inputs[] = br.readLine().split(" ");
			
			String com = inputs[0];
	
			switch(com) {
			
			case "push" : q.add(Integer.parseInt(inputs[1]));
				break;
			case "pop" : {
				if(!q.isEmpty()) 
					System.out.println(q.poll()); 
				else
					System.out.println(-1);
			}
				break;
			case "size" : System.out.println(q.size());
				break;
			case "empty" : System.out.println(q.isEmpty() ? 1 : 0); 
				break;
			case "front" : {
				if(!q.isEmpty()) 
					System.out.println(q.peek()); 
				else
					System.out.println(-1);
			}
			
				break;
			case "back" :{
				if(!q.isEmpty()) 
					System.out.println(q.peekLast()); 
				else
					System.out.println(-1);
			}
				break;
			
			}
			
		}
		br.close();
	}

}
