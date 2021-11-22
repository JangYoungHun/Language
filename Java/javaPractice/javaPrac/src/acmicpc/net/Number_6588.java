package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_6588 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int arr[] = new int[1000000 + 1];
		// 0 소수 1 소수X
		arr[0] = 1;
		arr[1] = 1;
		for (int i = 2; i < 500000 + 1; i++) {
			for (int j = 2; i * j <= 1000000; j++) {
				arr[i * j] = 1;
			}
		}

		String str = "";
		while (!(str = br.readLine()).equals("0")) {
			int n = Integer.parseInt(str);

			int start = 2;
			int end = n;

			while (true) {
				while (arr[start] == 1)
					start++;
				while (arr[end] == 1)
					end--;

				if (start + end == n) {
					System.out.println(n + " = " + start + " + " + end);
					break;
					
				}
				else if(start + end > n) {
					end --;
				}
				else {
					start++;
				}
			}

		}

		bw.flush();
		bw.close();
		br.close();
	}
}
