package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;


//https://www.acmicpc.net/problem/20946
public class Number_20946 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		double N ;
		String str =br.readLine();
		try{																	
			N = Integer.parseInt(str);
		}
		catch (NumberFormatException e) {
			N = Double.parseDouble(str) ;
		}
		
		int[] arr =new int[200];
			int j =0;
			for(int i =4; i<N; i++) {
				if(N%i == 0)
					if(!check(i))	{
						if(!check((int)N/i))
							arr[j++] = i;
				}					
			}			
			
		if(arr[0] == 0)
			bw.write("-1");
		else {
		for(int i : arr) {
			if(i != 0)
				bw.write(i+" ");
		}
		}		
		br.close();
		bw.close();
	}
		// 짝수제외 추가필요
	static  boolean check(int n) {		
		for(int i =2; i*i<=n; i++) {
			if(n%i ==0 )		
			return false;
		}	
		return true;
	}
}
