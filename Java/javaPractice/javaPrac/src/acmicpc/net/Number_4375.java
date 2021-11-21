package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_4375 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = "";
		while((input =br.readLine()) != null ){

			int n = Integer.parseInt( input);
			
			long length = 1;
			long num = 1;
			
			while(num%n !=0) {				
				num = num%n;
				num = num*10+1;
				length++;
			}
			
			System.out.println(length);
			
		}

		bw.flush();
		bw.close();
		br.close();
	}


}
