package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.stream.Stream;

//https://www.acmicpc.net/problem/11404
//�ذ�
public class Number_11404 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		int inf = 9999999;
		
		int d[][] = new int[n+1][n+1];
		
		for(int i =1; i<n+1; i++) {
			for(int j =1; j<n+1; j++) {
				if(i==j)
					d[i][j] = 0;
				else
					d[i][j] = inf;
			}
		}
		
		for(int i =0; i<m; i++) {
			int nums[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			if(d[nums[0]][nums[1]] > nums[2])
				d[nums[0]][nums[1]] = nums[2];
		}
		
		for(int k =1; k<n+1; k++) {
			for(int i =1; i<n+1; i++) {			
				for(int j =1; j<n+1; j++) {				
					d[i][j] = Math.min(d[i][j] , d[i][k] +d[k][j] );
				}	
			}
		}
		for(int i =1; i<n+1; i++) {
			for(int j =1; j<n+1; j++) {
				if(d[i][j] == inf)
					System.out.print("0 ");
				else
					System.out.print(d[i][j] +" ");
			}	
			System.out.println();
		}
		
		
		bw.flush();
		bw.close();
		br.close();
	}

}
