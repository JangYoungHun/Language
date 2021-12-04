package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.stream.Stream;

//ÇØ°á
public class Number_14225 {
	
	static boolean num[] = new boolean[2000001];
	static int[] arr ;
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int n = Integer.parseInt(br.readLine());
			arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			solution(new ArrayList<Integer>(), 0, n);
			
			int index =1;
			while(num[index++]);
			
			
			
			bw.write(String.valueOf(index-1));
			
			bw.flush();
			br.close();
			bw.close();
			}
		
		public static void solution(ArrayList<Integer> list, int start, int n) {
			
			if(list.size() != 0) {
				int sum = 0;
				for(int i : list) {
					sum += arr[i];
				}
				num[sum] = true;
			}
			
			for(int i = start; i<n; i++) {
				list.add(i);
				solution(list, i+1, n);
				list.remove(list.size()-1);
				
			}
			
		}

}
