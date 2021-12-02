package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//ÇØ°á
public class Number_1699 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int d[] = new int[n+1];
		d[1] = 1;
		
		for(int i =2; i<n+1; i++) {
			int sqrt = (int) Math.sqrt(i);
			int num = Integer.MAX_VALUE;
			for(int j =0; sqrt-j > 0; j++) {
				int left1 = (int) (i - Math.pow(sqrt-j, 2));
				num = Math.min(num, 1+ d[left1]);
			}
		
			d[i] = num;
		} 
		
		bw.write(String.valueOf(d[n]));
		bw.flush();
		br.close();
		bw.close();
		}
	

}
