package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.stream.Stream;

//ÇØ°á
public class Number_15658 {
	static int[] num;
	static int[] oper;
	static int max= -1000000001;
	static int min=1000000001;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		num = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		oper = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		recur(num[0], 1, 0, 0, 0, 0);
		
		bw.write(String.valueOf(max));
		bw.write("\n");
		bw.write(String.valueOf(min));
		
		bw.flush();
		br.close();
		bw.close();
		}
	
	public static void recur(int val, int index, int p, int s, int m, int d) {
		
		if(p > oper[0] || s > oper[1] || m> oper[2]|| d> oper[3]) 
			return;
		
		if(index == num.length) {
			max = Math.max(max, val);
			min = Math.min(min, val);
			return;
		}
	
		recur(val+num[index], index+1, p+1, s, m, d);
		recur(val-num[index], index+1, p, s+1, m, d);
		recur(val*num[index], index+1, p, s, m+1, d);
		recur(val/num[index], index+1, p, s, m, d+1);
		
	}
	
	
	
	
}
