package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

//https://www.acmicpc.net/problem/1655
//참고 https://gh402.tistory.com/32
//해결
public class Number_1655 {

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		

		PriorityQueue<Integer> maxQ = new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer> minQ = new PriorityQueue<Integer>();
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(maxQ.size() == minQ.size()) {
				maxQ.add(num);
				
				if( !minQ.isEmpty() && num > minQ.peek()) {
					minQ.add(maxQ.poll());	
					maxQ.add(minQ.poll());					
				}			
			}
			else {
				minQ.add(num);	
				if(minQ.peek() < maxQ.peek()) {
					minQ.add(maxQ.poll());	
					maxQ.add(minQ.poll());	
				}				
			}
			bw.write(maxQ.peek() + "\n");
		}



		bw.flush();
		bw.close();
		br.close();
	}

}
