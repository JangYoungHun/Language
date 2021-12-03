package Programmers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.stream.Stream;

//https://www.acmicpc.net/problem/10816
//ÇØ°á
public class Number_10816 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
			
		for(int i : Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray()) {		
			if(h.get(i) == null)
				h.put(i, 0);			
			h.put(i, h.get(i)+1);
		}
		
		int m = Integer.parseInt(br.readLine());
		int arr2[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		StringBuilder sb = new StringBuilder();
		for(int i : arr2) {
			if(h.get(i) == null)
				sb.append(0 + " ");
			else
				sb.append(h.get(i) + " ");
		}
		
		System.out.println(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
