package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.util.stream.Stream;


//https://www.acmicpc.net/problem/1976
//ÇØ°á
public class Number_1976 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int p[] = new int[n];
		for(int i =0; i<n; i++) {
			p[i] = i;
		}

		for(int i =0; i<n; i++) {
			int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			for(int j =0; j<arr.length; j++) {
				if(arr[j] ==1)
					union(p,i,j);
			}
		}
		
		int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		String result = "YES";
	
		for(int i =0; i<arr.length-1; i++) {
			if(!isUnion(p, arr[i]-1, arr[i+1]-1)) {
				result = "NO";
				break;
			}
		}
		
		System.out.println(result);

		bw.flush();
		bw.close();
		br.close();
	}

	static int getParent(int p[], int node ) {
		if(p[node] == node)
			return node;
		else
		return p[node] = getParent(p,p[node]);
	}
	
	static void union(int p[],int node1, int node2) {
		int parent1 = getParent(p, node1);
		int parent2 = getParent(p, node2);
		
		if(parent1 > parent2) {
			p[parent1] = p[parent2];
		}
		else
			p[parent2] = p[parent1];
	}
	
	public static boolean isUnion(int[] parent, int node1, int node2) {
		int parent1 = getParent(parent, node1);
		int parent2 =  getParent(parent, node2);
		if(parent1== parent2)
			return true;
		else 
			return false;
	}
}
