package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

//https://www.acmicpc.net/problem/1005
//시간초과 
//DP로 풀어야함!
//DP 방식으로 변경
//해결
public class Number_1005 {
	static int dp[];
	static ArrayList<ArrayList<Integer>> list;
	static int times[] ;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			String strs[] = br.readLine().split(" ");
			int n =  Integer.parseInt(strs[0]);
			int k=  Integer.parseInt(strs[1]);
			dp = new int[1001];
			Arrays.fill(dp, -1);
			times = new int[n+1];
			
			int nums[] =Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			for(int j =1; j<nums.length+1; j++) {
				times[j] = nums[j-1];
			}
			
			list = new ArrayList<ArrayList<Integer>>();
			
			for(int j =0; j<n+1; j++) {
				list.add(new ArrayList<Integer>());
			}
			for(int j =0; j<k; j++) {
				int num[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
				list.get(num[1]).add(num[0]);
			}		
			
			int w = Integer.parseInt(br.readLine());
			int result = recur(w);
			System.out.println(result);
		}
		

		bw.flush();
		bw.close();
		br.close();

	}

	static int recur(int w) {
		
		int max = Integer.MIN_VALUE;
		
		if(list.get(w).size() == 0)
			return times[w];
	
		if(dp[w] != -1)
			return dp[w];
		
		for(int i =0; i<list.get(w).size(); i++) {
			int index = list.get(w).get(i);
			max = Math.max(max, recur(index));
		}
		
		return dp[w] = times[w]+max;
	}
	
}
