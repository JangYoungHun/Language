package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

//https://www.acmicpc.net/problem/2252
//�ذ�
public class Number_2252 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int nm[]= Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = nm[0];
		int m = nm[1];
		
		ArrayList<ArrayList<Integer>> bridges = new ArrayList<ArrayList<Integer>>() ;	
		for(int i =0; i<n+1; i++) {
			bridges.add(new ArrayList<Integer>());
		}
		
		int d[] = new int[n+1];
		
		for(int i =0; i<m; i++) {
			int nums[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			bridges.get(nums[0]).add(nums[1]);
			d[nums[1]]++;
		}
		
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i =1; i<=n; i++) {
			if(d[i] == 0)
				q.add(i);
		}
		
		for(int i =1; i<=n; i++) {
			int x = q.poll();
			System.out.print(x + " ");
			for(int j =0; j<bridges.get(x).size(); j++) {
				int y = bridges.get(x).get(j);
				if(--d[y] == 0)
					q.add(y);
			}
			
		}
		
		
		bw.flush();
		bw.close();
		br.close();
	}

}
