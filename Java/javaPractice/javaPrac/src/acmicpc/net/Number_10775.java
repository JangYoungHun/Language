package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.stream.Stream;

public class Number_10775 {
	
	static int a[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int result = 0;
		boolean end = false;
		int g = Integer.parseInt(br.readLine());
		int p = Integer.parseInt(br.readLine());
		
		a = new int[g+1];

		for(int i =0; i<=g; i++) {
			a[i] = i;
		}
		
		for(int i =0; i<p; i++) {
			int doc = Integer.parseInt(br.readLine());
			int parent = getParent(doc);
			if( parent  != 0 && !end) {
				union(parent, parent-1);
				result ++;
			} else {
				end = true;
			}
			
		}

		
		bw.write(String.valueOf(result));
		
		bw.flush();
		br.close();
		bw.close();
		}
	
	
	static int getParent(int num) {
		if(a[num] == num)
			return num;
		return a[num]=getParent(a[num]);
	}
	
	static void union(int num1, int num2) {
		int p1 = getParent(num1);
		int p2 = getParent(num2);
		
		if(p1 < p2)
			a[p2] = p1;
		else
			a[p1] = p2;
	}
	
	
}
