package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//ÇØ°á
public class Number_11585 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		char[] p = br.readLine().replace(" ", "").toCharArray();
		char[] map = br.readLine().replace(" ", "").toCharArray();
		
		int[] arr = createMap(p,n);

		int result = kmp(p, map, arr, n);
		
		int gcd = gcd(result, n);


			bw.write(String.valueOf(result/gcd));
			bw.write("/");
			bw.write(String.valueOf(n/gcd));

		bw.flush();
		br.close();
		bw.close();
		}
	
	
	static int[] createMap(char[] p, int n) {
		int arr[] = new int[n];
		int j =0; 
		for(int i =1; i<n; i++) {
			while(j>0 && p[j] != p[i]) {
				j = arr[j-1];
			}		
			if(p[j] == p[i]) {
				arr[i] = ++j;
			}
			
		}
		return arr;
	} 
	
	
	static int kmp(char[] p, char[] map,int arr[], int n) {
		int cnt = 0;
		int j =0;
		for(int i =0; i<map.length*2-1; i++) {
			while(j > 0 && p[j] != map[i%n]) {
				j = arr[ j-1];
			}
			if(p[j] == map[i%n]) {
				if(j == p.length-1) {
					cnt++;
					j = arr[j];
				}else {
					j++;
				}
			}
		}
		return cnt;
	}
	
	static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}
		return gcd(b, a%b);
	}
	
}














