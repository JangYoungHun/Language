package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

//ÇØ°á
public class Number_1013 {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		Pattern p = Pattern.compile("^((100+1+)|(01))+$");
	
		for(int i = 0; i<n; i++) {
			String str = br.readLine();
			Matcher m = p.matcher(str);
			bw.write(m.find() ? "YES" :"NO");
			bw.write("\n");
		}
		
		
		
		bw.flush();
		br.close();
		bw.close();
		}
}
