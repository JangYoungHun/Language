package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//https://www.acmicpc.net/problem/1463
//ÇØ°á
public class Number_1463 {

	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n+1];
		
		arr[1] =0;
		
		
		int min = 0;
		for(int i =2; i<=n; i++) {
			min = arr[i-1] +1;
			
			if(i%2 ==0) {
				min = Math.min(arr[i/2]+1, min);
			}
			if(i%3 ==0) {
				min = Math.min(arr[i/3]+1, min);
			}
			arr[i] = min;
		}
		
		
		
		
		
		bw.write(String.valueOf(arr[n]));
		
		bw.flush();
	 	br.close();
		bw.close();
	}

	
	}
	
	

