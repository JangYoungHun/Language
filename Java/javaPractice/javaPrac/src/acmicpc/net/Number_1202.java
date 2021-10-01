package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Stream;


//https://www.acmicpc.net/problem/1202
//ÇØ°á
public class Number_1202 {

	static class Node {
		int weight;
		int price;

		public Node(int weight, int price) {

			this.weight = weight;
			this.price = price;
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long result = 0;
		int nk[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = nk[0];
		int k = nk[1];
		
		Node jw[] = new Node[n]; 
		int bags[] = new int[k];
		Arrays.fill(bags,-1);
		
		List<Node> list = new ArrayList<Node>();
		
		for (int i = 0; i < n; i++) {
			int nums[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			jw[i] = new Node(nums[0], nums[1]);
		}
		
		Arrays.sort(jw,new Comparator<Node>() {
			@Override
			public int compare(Node o1, Node o2) {
				// TODO Auto-generated method stub
				return o1.weight - o2.weight;
			}
		});		
		for(int i =0; i<k; i++) {
			bags[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(bags);

		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		int index = 0;
		for(int i =0; i<k; i++) {
			
			while(index <jw.length && jw[index].weight <= bags[i]) {
				q.add(jw[index].price);
				index++;
			}
			
			if(!q.isEmpty())
				result += q.poll();		
		}
		
		System.out.println(result);
		
		bw.flush();
		bw.close();
		br.close();
	}
	

}
