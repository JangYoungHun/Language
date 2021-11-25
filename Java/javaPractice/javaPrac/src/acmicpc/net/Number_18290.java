package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Number_18290 {


	static int n;
	static int m;
	static int k;
	static int[][] arr;
	static int visited[][];
	static int result = Integer.MIN_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int nm[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		n = nm[0];
		m = nm[1];
		k = nm[2];

		visited = new int[n][m];
		
		arr = new int[n][m];
		
		for(int i=0; i<n; i++) {
			arr[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		
		solution(new ArrayList<Integer>(), arr);
		
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		br.close();
	}

	public static void solution(ArrayList<Integer> list, int[][] arr) {

		if (list.size() == k) {
			int sum = list.stream().mapToInt(n->(int)n).sum();
			result = Math.max(result,sum);
			
			return;
		}

		for (int i = 0; i < n; i++) {			
			for (int j = 0; j < m; j++) {
				if (visited[i][j] == 0) {
					list.add(arr[i][j]);
					visited[i][j]++;

					if (0 <= i - 1) {
						visited[i - 1][j]++;
					}

					if (n > i + 1) {
						visited[i + 1][j]++;
					}

					if (0 <= j - 1) {
						visited[i][j - 1]++;
					}

					if (m > j + 1) {
						visited[i][j + 1]++;
					}
					
					solution(list, arr);
					
					list.remove(list.size() - 1);
					visited[i][j]--;

					if (0 <= i - 1) {
						visited[i - 1][j]--;
					}

					if (n > i + 1) {
						visited[i + 1][j]--;
					}

					if (0 <= j - 1) {
						visited[i][j - 1]--;
					}

					if (m > j + 1) {
						visited[i][j + 1]--;
					}
				}

			}
		}

	}
}
