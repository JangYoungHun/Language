package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

//ÇØ°á
public class Number_2529{
	
	static char arr[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		arr = br.readLine().replace(" ", "").toCharArray();
		
		String resultMin = solutionMin(new ArrayList<Integer>(), n);
		String resultMax = solutionMax(new ArrayList<Integer>(), n);
		bw.write(String.valueOf(resultMax));
		bw.write("\n");
		bw.write(String.valueOf(resultMin));
		bw.flush();
		br.close();
		bw.close();
		}
	
	
	public static String solutionMin(ArrayList<Integer> list, int n) {
		if(list.size() == n+1) {
			
			for(int i =0; i<n; i++) {
				int ch = arr[i];
				
				if(ch == '>') {
					if(list.get(i) < list.get(i+1))
						return null;
				}
				else {
					if(list.get(i) > list.get(i+1))
						return null;
				}
			}
			
			StringBuilder sb = new StringBuilder();
			for(int i : list) {
				sb.append(i);			
				}
			return sb.toString();
		} 
		
		for(int i = 0; i<10; i++) {
			if(!list.contains(i)) {
				list.add(i);
				String result = solutionMin(list, n);
				
				if(result != null)
					return result;
					
				list.remove(list.size()-1);
			}
		}
		return null;
	}
	public static String solutionMax(ArrayList<Integer> list, int n) {
		if(list.size() == n+1) {
			
			for(int i =0; i<n; i++) {
				int ch = arr[i];
				
				if(ch == '>') {
					if(list.get(i) < list.get(i+1))
						return null;
				}
				else {
					if(list.get(i) > list.get(i+1))
						return null;
				}
			}
			
			StringBuilder sb = new StringBuilder();
			for(int i : list) {
				sb.append(i);			
				}
			return sb.toString();
		} 
		
		for(int i = 9; i>=0; i--) {
			if(!list.contains(i)) {
				list.add(i);
				String result = solutionMax(list, n);
				
				if(result != null)
					return result;
					
				list.remove(list.size()-1);
			}
		}
		return null;
	}
	

}
