package acmicpc.net;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

//https://www.acmicpc.net/problem/1927
//ÇØ°á
public class Number_1927 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> q = new PriorityQueue<>();
		
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num ==0) {
				if(!q.isEmpty())
					bw.write(String.valueOf(q.poll()) + "\n");	
				else
					bw.write("0\n");	
			}
			else
				q.add(num);
		
		}
		
		bw.close();
		br.close();

}
}

