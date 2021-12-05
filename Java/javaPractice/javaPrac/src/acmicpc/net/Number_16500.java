package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;


public class Number_16500 {
	static boolean d[];
	static ArrayList<String> list = new ArrayList<String>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = br.readLine();
		int n = Integer.parseInt(br.readLine());
		d = new boolean[101];

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			list.add(str);
		}

		
		for(int i = s.length()-1; i>=0; i--) {
			for(int j =i+1; j<s.length(); j++) {
				if(d[j]) {
					if(list.contains(s.substring(i, j)))
						d[i] = true;
				}
			}
			if(list.contains(s.substring(i)))
				d[i] = true;
		}
		
		bw.write(String.valueOf(d[0] ? 1 : 0) );
		
		bw.flush();
		br.close();
		bw.close();
	}


}

