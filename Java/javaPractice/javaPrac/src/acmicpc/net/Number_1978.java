package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//ÇØ°á
public class Number_1978 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		

		boolean arr[] = new boolean[1000+1];
		
		arr[0] = true;
		arr[1] = true;
		
		for(int i =2; i< 51; i++ ) {
			for(int j = 2; i*j <= 100; j++) {
				arr[i*j] = true;
			}
		}
		
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		String strs[] = br.readLine().split(" ");
		for(String str : strs) {
			int index = Integer.parseInt(str);
			if(!arr[index])
				cnt ++;
		}
		
		bw.write(String.valueOf(cnt));
		
		bw.flush();
		bw.close();
		br.close();
	}
}
