package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Number_1062 {
	
	static int result = 0;
	static List<String> strs = new ArrayList<String>();
	static boolean visited[] = new boolean[26];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String nk[] =br.readLine().split(" ");
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);
		
		if(k == 26)
			bw.write(String.valueOf(n));
		else if (k<5) {
			bw.write("0");
		}
		else {
			
		    visited['a' - 'a'] = true;
		    visited['n' - 'a'] = true;
		    visited['t' - 'a'] = true;
		    visited['i' - 'a'] = true;
		    visited['c' - 'a'] = true;
			
			for(int i=0; i<n; i++) {
				String word = br.readLine();
				word = word.replaceAll("anta|tica", "");		
				strs.add(word);
			}
			
			recur(0,0, k);
			bw.write(String.valueOf(result));
		}
		
	
		bw.flush();
		br.close();
		bw.close();
		}
	
	public static void recur(int start ,int count, int k) {
		if(count == k-5) {	
			int cnt=0;
			
			for(String str : strs) {
				cnt++;
				for(char ch : str.toCharArray()) {
					if(!visited[ch-'a']) {
						cnt--;
						break;
					}			
				}
			}
			
			result = Math.max(result, cnt);
			return;
		}

		for(int i =start; i<26; i++) {
			if(!visited[i]) {
				visited[i] = true;
				recur(i,count+1, k);
				visited[i] = false;
			}
		}
		
	}
}
