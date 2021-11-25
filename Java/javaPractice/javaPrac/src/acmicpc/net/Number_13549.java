package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

//ÇØ°á
public class Number_13549 {

	static int result = Integer.MAX_VALUE;

	static class Pos {
		int x;
		int time;

		public Pos(int x, int time) {
			this.x = x;
			this.time = time;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int nk[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = nk[0];
		int k = nk[1];

		int visited[] = new int[100001];

		Queue<Pos> q = new LinkedList<Pos>();
		q.add(new Pos(n, 0));
		visited[n] = 0;
		Arrays.fill(visited, Integer.MAX_VALUE);
		
		while (!q.isEmpty()) {
			Pos pos = q.poll();

			if (pos.x == k) {
				result = Math.min(result, pos.time);
				continue;
			}

			if (pos.x * 2 < 100001 ) {
				if(visited[pos.x * 2] > pos.time) {
					visited[pos.x * 2] = pos.time;
					q.add(new Pos(pos.x * 2, pos.time));
				}
				
			}

			if (pos.x + 1 < 100001 ) {
				if(visited[pos.x + 1] > pos.time) {
					visited[pos.x + 1] = pos.time;
					q.add(new Pos(pos.x + 1, pos.time + 1));
				}	
			}
			if (0 <= pos.x - 1) {
				if(visited[pos.x - 1] > pos.time) {
					visited[pos.x - 1] = pos.time;
					q.add(new Pos(pos.x - 1, pos.time + 1));
				}
			}

		}

		bw.write(String.valueOf(result));
		bw.flush();
		br.close();
		bw.close();
	}
}
