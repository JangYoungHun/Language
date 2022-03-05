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

public class Number_12886 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		String result = "0";
		int a = arr[0];
		int b = arr[1];
		int c = arr[2];
		int sum = (a + b + c);
		if (sum % 3 != 0) {
			bw.write("0");
			bw.flush();
			br.close();
			bw.close();
			return;
		}

		int v[][] = new int[1501][1501];
		v[a][b] = 1;

		Queue<Integer> q = new LinkedList<Integer>();

		q.add(a);
		q.add(b);

		while (!q.isEmpty()) {
			int x = q.poll();
			int y = q.poll();

			int temp[] = { x, y, sum - x - y };
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (temp[i] < temp[j]) {
						int num1 = temp[i] * 2;
						int num2 = temp[j] - temp[i];
						if (v[num1][num2] == 1)
							continue;
						v[num1][num2] = 1;
						q.add(num1);
						q.add(num2);
					}
				}
			}
		}

		bw.write(String.valueOf(v[sum / 3][sum / 3]));
		bw.flush();
		br.close();
		bw.close();
	}

}
