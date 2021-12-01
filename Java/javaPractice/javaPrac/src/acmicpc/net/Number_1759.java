package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Number_1759 {

	static ArrayList<String> checked = new ArrayList<String>();
	static char[] chs;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int LC[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int L = LC[0];
		int C = LC[1];
		chs = br.readLine().replace(" ", "").toCharArray();
		Arrays.sort(chs);
		
		solution(new ArrayList<Integer>(), 0, L, C);
		bw.flush();
		br.close();
		bw.close();
	}

	public static void solution(ArrayList<Integer> list, int start, int L, int C) {
		if (list.size() == L) {
			
			int vowl = 0;
			int consonant = 0;;
			for(int i =0; i<L; i++) {
				char ch = chs[list.get(i)];
				if(ch == 'a' || ch== 'e' || ch== 'i' || ch== 'o' || ch== 'u' ) {
					vowl++;
				}
				else
					consonant++;
			}
			
			if(vowl <1 || consonant <2)
				return;
			else {
				list.sort(null);
				list.stream().map(it -> chs[it]).forEach(it -> System.out.print(it));
				System.out.println();
			}
				

			return;
		}

		for (int i = start; i < C; i++) {
			list.add(i);
			solution(list, i + 1, L, C);
			list.remove(list.size() - 1);
		}
	}
}
