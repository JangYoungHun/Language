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
public class Number_16918 {

	static class Pos {
		int x;
		int y;

		public Pos(int x, int y) {
			this.x = x;
			this.y = y;
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		int r = arr[0];
		int c = arr[1];
		int n = arr[2];

		char map[][] = new char[r][];
		for (int i = 0; i < r; i++) {
			map[i] = br.readLine().toCharArray();
		}

		if (n == 1) {
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					bw.write(map[i][j]);
				}
				bw.write("\n");
			}
		} else if (n % 2 == 0) {
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					bw.write("O");
				}
				bw.write("\n");
			}
		} else {

			Queue<Pos> q = new LinkedList<>();

			int re = n / 2;

			for (int k = 0; k < re; k++) {
				
				for (int i = 0; i < r; i++) {
					for (int j = 0; j < c; j++) {
						if (map[i][j] == 'O')
							q.add(new Pos(i, j));
					}
				}
				
				boolean visited[][] = new boolean[r][c];
				int qsize = q.size();

				for (int j = 0; j < qsize; j++) {
					Pos top = q.poll();
					int x = top.x;
					int y = top.y;
					if (!visited[x][y]) {
						q.add(new Pos(x, y));
						visited[x][y] = true;
					}
					if (0 <= x - 1 && !visited[x - 1][y]) {
						visited[x - 1][y] = true;
						q.add(new Pos(x - 1, y));
					}
					if (x + 1 < r && !visited[x + 1][y]) {
						visited[x + 1][y] = true;
						q.add(new Pos(x + 1, y));
					}
					if (0 <= y - 1 && !visited[x][y - 1]) {
						visited[x][y - 1] = true;
						q.add(new Pos(x, y - 1));
					}
					if (y + 1 < c && !visited[x][y + 1]) {
						visited[x][y + 1] = true;
						q.add(new Pos(x, y + 1));
					}
				}
				
				if(k == re-1)
					break;
				
				map = new char[r][c];
				for(int i =0; i<r; i++) {
					Arrays.fill(map[i], 'O');
				}
				while (!q.isEmpty()) {
					Pos p = q.poll();
					map[p.x][p.y] = '.';
				}
				
			}

			char[][] result = new char[r][c];

			for (int i = 0; i < r; i++) {
				Arrays.fill(result[i], 'O');
			}

			while (!q.isEmpty()) {
				Pos p = q.poll();
				result[p.x][p.y] = '.';
			}

			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					bw.write(result[i][j]);
				}
				bw.write("\n");
			}
		}

		bw.flush();
		br.close();
		bw.close();
	}

}
