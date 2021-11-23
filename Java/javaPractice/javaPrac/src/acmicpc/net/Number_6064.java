package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.stream.Stream;


public class Number_6064 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i =0; i<t; i++) {
			int nums[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int m = nums[0];
			int n = nums[1];
			int x1 = nums[2];
			int y1 = nums[3];
			
			int year = 1;
			int x = 1;
			int y = 1;
			while(x!=x1) {
				year ++;			
				x++;
				if(x > m)
					x = 1;
				y++;
				if(y > n)
					y = 1;				
				if(x==x1 &&  y== y1) {
					break;
				}				
			}
	
			while(y !=y1 &&year <= 40000 * 40000) {
				year += m;
				y += m;
				
				while(y > n) {
					y -= n;	
				}
				
				if(y == y1)
					break;
			}
			
			
			if(year > 40000*40000)
				bw.write(String.valueOf(-1)+"\n");
			else {
				
					bw.write(String.valueOf(year)+"\n");
			}
				
		}

		bw.flush();
		bw.close();
		br.close();
	}


}
