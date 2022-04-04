package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

//ÇØ°á
public class Number_21608 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int table[][] = new int[n][n];
		Map<Integer, List<Integer>> h = new HashMap<Integer, List<Integer>>(); 
		for(int i =0; i<n*n; i++) {
			int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			List<Integer> list = new ArrayList<Integer>();
			for(int num =0; num<arr.length; num++) {
				list.add(arr[num]);
			}
			h.put(arr[0], list);
			int x =0;
			int y =0;
			int likeMax=-1;
			int maxEmpty=-1;
			for(int j =0; j<n; j++) {
				for(int k =0; k<n; k++) {
					if(table[j][k] !=0) continue;
					
					int like = 0;
					int empty = 0;
					if(0<=j-1) {
						if( list.contains(table[j-1][k]))
							like ++;
						if(table[j-1][k] == 0)
							empty ++;
					} 
					if(j+1 < n ) {
						if( list.contains(table[j+1][k]))
							like ++;
						if(table[j+1][k] == 0)
							empty ++;
					}
					if(0<=k-1) {
						if( list.contains(table[j][k-1]))
							like ++;
						if(table[j][k-1] == 0)
							empty ++;
					}
					if(k+1 < n) {
						if( list.contains(table[j][k+1]))
							like ++;
						if(table[j][k+1] == 0)
							empty ++;
					}
					
					if(likeMax < like) {
						likeMax = like;
						maxEmpty = empty;
						x = j;
						y = k;
					} else if(likeMax == like) {
						if(maxEmpty < empty) {
							maxEmpty = empty;
							x = j;
							y = k;
						}
					}	
				}
			}	
			table[x][y] = list.get(0);
		}
		int result =0;
		for(int j =0; j<n; j++) {
			for(int k =0; k<n; k++) {
				int answer = 0;
				int num = table[j][k];
				List<Integer> list = h.get(num);
				if(0<=j-1) {
					if( list.contains(table[j-1][k]))
						answer ++;
				} 
				if(j+1 < n ) {
					if( list.contains(table[j+1][k]))
						answer ++;
				}
				if(0<=k-1) {
					if( list.contains(table[j][k-1]))
						answer ++;
				}
				if(k+1 < n) {
					if( list.contains(table[j][k+1]))
						answer ++;
				}
				
				switch(answer){
					case 1: result +=1; break;
					case 2: result +=10; break;
					case 3: result +=100; break;
					case 4: result +=1000; break;
				}
		}
		}
		
		bw.write(String.valueOf(result));
		bw.flush();
		br.close();
		bw.close();
		}
}
