package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.stream.Stream;

public class Number_14425 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] nm = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = nm[0];
		int m = nm[1];
		
		int answer = 0;
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		
		for (int i = 0; i < n; i++) {
			h.put(br.readLine(), 1);
		}

		for (int j = 0; j < m; j++) {
			if(h.get(br.readLine()) != null) {
				answer ++;
			}
		}

		
		bw.write(String.valueOf(answer));
		
		bw.flush();
		br.close();
		bw.close();
	}

}
