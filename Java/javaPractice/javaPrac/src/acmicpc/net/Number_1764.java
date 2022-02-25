package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.stream.Stream;

//ÇØ°á
public class Number_1764 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int nm[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = nm[0]; 
		int m =nm[1];
		int cnt =0;
		PriorityQueue<String> q = new PriorityQueue<String>();
		HashMap<String, Boolean> h = new HashMap<String, Boolean>();
		for(int i=0; i<n; i++) {
			 h.put(br.readLine(), true);
		}
	
		for(int i=0; i<m; i++) {
			String str =br.readLine();
			 if(h.get(str) == null)
				 continue;
			 
			 cnt++;
			 q.add(str);
		}
		
		bw.write(String.valueOf(cnt));
		bw.write("\n");
		
		while(!q.isEmpty()) {
			bw.write(q.poll());
			bw.write("\n");
		}
			
		bw.flush();
		br.close();
		bw.close();
		}
	


}
