package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class Number_12851 {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int n = arr[0];
		int k = arr[1];
		
		boolean visit[] = new boolean[100001];
		Queue<Integer> q = new LinkedList<>();
		int time = 0;
		int cnt = 0;
		int minTime = Integer.MAX_VALUE;
		
		visit[n] = true;
		q.add(n);
		
		while(!q.isEmpty()) {
			int qSize = q.size();
			for(int i =0; i<qSize; i++) {
				int cur = q.poll();
				
				visit[cur] = true;
				if(cur == k) {
					cnt++;
				}
				
				if(cnt != 0) {
					continue;
				}
				
				if(0 <= cur-1 && !visit[cur-1]) {
					q.add(cur-1);
				}
				if(cur+1 <= 100000 && !visit[cur+1]) {
					q.add(cur+1);
				}
				if(cur*2<=100000 && !visit[cur*2]) {
					q.add(cur*2);
				}
			}
			
			if(cnt != 0)
				break;
			time ++;
		}
		
		
		bw.write(String.valueOf(time));
		bw.write("\n");
		bw.write(String.valueOf(cnt));
		bw.flush();
		br.close();
		bw.close();
		}

}
