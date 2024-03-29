package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.stream.Stream;

//https://www.acmicpc.net/problem/1389
//�ذ�
public class Number_1389 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int nm[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = nm[0];
		int m = nm[1];
		
		int d[][] = new int[n+1][n+1]; 
		
		for(int i =0; i<n+1; i++) {
			for(int j =0; j<n+1; j++) {
				if(i==j)
					d[i][j] = 0;
				else
					d[i][j] = 5002;
			}
		}
		
		for(int i =0; i<m; i++) {
			int nums[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			d[nums[0]][nums[1]] = 1;
			d[nums[1]][nums[0]] = 1;
		}
		
		for(int k =1; k<=n; k++) {
			for(int i =1; i<=n; i++) {
				 if(i==k)
					 continue;
				for(int j =1; j<=n; j++) {
					if(i==j||j==k)
						continue;
					d[i][j] = Math.min(d[i][j] , d[i][k] +d[k][j]);
				}
			}
		}
		
		int min = Integer.MAX_VALUE;
		int index = -1;
		for(int i =1; i<=n; i++) {
			int sum = 0;
			for(int j =1; j<=n; j++) {
				sum += d[i][j]; 
			}
			if(sum < min) {
				min = sum;
				index = i;
			}
		}
		
		bw.write(String.valueOf(index));
		
		bw.flush();
		bw.close();
		br.close();
	}

}
