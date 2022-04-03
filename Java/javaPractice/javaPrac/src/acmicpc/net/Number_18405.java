package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Stream;

//ÇØ°á
public class Number_18405 {
	
		static class Virus implements Comparable<Virus>{
			int no;
			int x;
			int y;
			public Virus(int no, int x, int y) {
				super();
				this.no = no;
				this.x = x;
				this.y = y;
			}
			@Override
			public int compareTo(Virus o) {
				// TODO Auto-generated method stub
				return this.no - o.no;
			}
		}
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			int[] nk = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			int n = nk[0];
			int k = nk[1];
			
			int map[][] = new int[n][n];
			
			List<Virus> list = new ArrayList<>();
			for(int i =0; i<n; i++) {
				int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
				for(int j =0; j<n; j++) {
					map[i][j] = arr[j];
					if(arr[j] != 0) {
						list.add(new Virus(arr[j],i, j));
					}
				}
			}
			
			list.sort(null);
			Queue<Virus> q = new LinkedList<>(list);
			
			int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int s = arr[0];
			int time = 0;
			while(!q.isEmpty()) {
				
				if(time == s)
					break;
				
				int qSize = q.size();
				for(int i =0; i<qSize; i++) {
				Virus top = q.poll();
				
				int x = top.x;
				int y = top.y;
				
				if(0<= x-1 && map[x-1][y] == 0) {
					q.add(new Virus(top.no, x-1, y));
					map[x-1][y] = top.no;
				}
				
				if( x+1 < n && map[x+1][y] == 0) {
					q.add(new Virus(top.no, x+1, y));
					map[x+1][y] = top.no;
				}
				
				if(0<= y-1 && map[x][y-1] == 0) {
					q.add(new Virus(top.no, x, y-1));
					map[x][y-1] = top.no;
				}
				
				if( y+1 < n && map[x][y+1] == 0) {
					q.add(new Virus(top.no, x, y+1));
					map[x][y+1] = top.no;
				}
			}
				time ++;
			}
			
			bw.write(String.valueOf(map[arr[1]-1][arr[2]-1]));
			
			
			bw.flush();
			br.close();
			bw.close();

	}

}
