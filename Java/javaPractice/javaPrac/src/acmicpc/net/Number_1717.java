package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.stream.Stream;

//https://www.acmicpc.net/problem/1717
//ÇØ°á
public class Number_1717 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] nm = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = nm[0];
		int m = nm[1];
		
		int p[] = new int[n+1];
		
		for(int i = 0; i<n+1; i++) {
			p[i] = i;
		}
		
		for(int i =0; i<m; i++) {
			int[] nums = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			if(nums[0] ==0) {
				union(p,nums[1],nums[2]);
			}
			else {
				System.out.println(isUnion(p, nums[1], nums[2]));
			}
		}
		
		
		bw.flush();
		bw.close();
		br.close();

	}

	
	
	static	int getParent(int[] p, int num1) {
		if(p[num1] == num1)
			return num1;
		
		return p[num1] = getParent(p,p[num1]);
	}
	
	static void union(int p[], int num1, int num2) {
		int parent1 = getParent(p,num1);
		int parent2 = getParent(p,num2);
		
		if(parent1 > parent2) {
			p[parent1] = p[parent2];
		}
		else
			p[parent2] = p[parent1];
		
	}
	
	static String isUnion(int p[], int num1, int num2) {
		if(getParent(p, num1) == getParent(p, num2))
			return "YES";
		
			return "NO";
	}
	
}	
