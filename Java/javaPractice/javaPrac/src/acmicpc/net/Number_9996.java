package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//ÇØ°á
public class Number_9996 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		String p = "^"+br.readLine().replace("*", ".*")+"$";
		Pattern pattern = Pattern.compile(p);
		
		for(int i =0; i<n; i++) {
			String str = br.readLine();
			Matcher m = pattern.matcher(str);
			bw.write( m.find() ? "DA" : "NE");
			bw.write("\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
		}
	
}

