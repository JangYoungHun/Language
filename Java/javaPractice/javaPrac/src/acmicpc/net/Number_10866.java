package acmicpc.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;


public class Number_10866{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		Deque<Integer> q = new ArrayDeque<>();
		
		for(int i=0; i<t; i++) {
			String inputs[] = br.readLine().split(" ");
			
			String com = inputs[0];
	
			switch(com) {
			
			case "push_front" : q.addFirst(Integer.parseInt(inputs[1]));
				break;
				
			case "push_back" : q.addLast(Integer.parseInt(inputs[1]));
				break;
				
			case "pop_front" : {
				if(!q.isEmpty()) 
					System.out.println(q.pollFirst()); 
				else
					System.out.println(-1);
			}
				break;
			case "pop_back" : {
				if(!q.isEmpty()) 
					System.out.println(q.pollLast()); 
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
					System.out.println(q.peekFirst()); 
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
