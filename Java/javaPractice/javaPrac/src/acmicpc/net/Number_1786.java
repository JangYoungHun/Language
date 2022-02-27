package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

//ÇØ°á
public class Number_1786 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] str = br.readLine().toCharArray();
		char[] p = br.readLine().toCharArray();
		
		int result = 0;
		List<Integer> list = new ArrayList<Integer>();
		int arr[] = new int[p.length];
		
		int j =0;
		for(int i =1; i<p.length; i++) {
			while(j >0 && p[i] != p[j]) {
				j = arr[j-1];
			}
			if(p[i] == p[j]) {
				arr[i] = ++j;
			}
		}
		
		int k = 0;
		for(int i =0; i<str.length; i++) {
			while(k >0 && str[i] != p[k]) {
				k = arr[k-1];
			}
			if(str[i] == p[k]) {
				if(k == p.length-1) {
					k = arr[k];
					result ++;
					list.add(i-p.length+2);
				}else {
					k++;
				}
			}
		}
		
		bw.write(String.valueOf(result));
		bw.write("\n");
		
		for(int i : list) {
			bw.write(String.valueOf(i));
			bw.write(" ");
		}
	
		bw.flush();
		br.close();
		bw.close();
		}
	
}
