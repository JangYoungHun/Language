package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
				
//https://www.acmicpc.net/problem/15650
// Scanner 시간초과 BufferedReader, BufferedWriter 사용으로 해결 
//해결

public class Number_15650 {
	static int M;
	static int N ;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
				
		StringTokenizer st = new StringTokenizer(br.readLine());
		
	     N = Integer.parseInt(st.nextToken());
		M =  Integer.parseInt(st.nextToken());
		
		List<Integer> list = new ArrayList<>();
		
		Solution(list, 0);
		
		br.close();
		bw.close();
		
	}

	static void Solution (List list,  int count) {
		if(count == M) {
				try {
					bw.write(list.toString().replace("[","").replace("]","").replace(",",""));
					bw.write("\n");
				} catch (Exception e) {
					e.printStackTrace();
				}	
		
			return;
		}
		for(int i =1; i<=N; i++) {			
				list.add(i);			
				Solution(list, count+1);
				list.remove(list.size()-1);			
		}
	
}
}
