package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//https://www.acmicpc.net/problem/11950
// ÇØ°á
public class Number_11950 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String nm[] =br.readLine().split(" ");
		int n = Integer.parseInt( nm[0] );
		int m =  Integer.parseInt( nm[1] );
		
		int white[] = new int[n];
		int red[]= new int[n];
		int blue[]= new int[n];
		
		char[][] tiles = new char[n][m];
		for(int i=0; i<n; i++) {
			tiles[i] = br.readLine().toCharArray();		
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<tiles[i].length; j++) {
				if(tiles[i][j] == 'W')
					white[i]++;
				else if(tiles[i][j] == 'R')
					red[i]++;
				else
					blue[i] ++;
			}
		}
		
		
		int count =Integer.MAX_VALUE;
		
		
		
		
	
		
		for(int i =0; i<n-2; i++) {
			int cnt =0;
			
			for(int w=0; w<=i; w++) {
				cnt += m-white[w];
			}
			
			for(int j = i+1; j<n-1; j++) {
				int cnt2 = cnt;
				for(int b=i+1; b<=j; b++) {
					cnt2 += m-blue[b]; 
				}
				for(int r=j+1; r<n; r++) {
					cnt2 += m-red[r];
				}
				
				count = Math.min(count, cnt2);	
			}		
		
		}
	
	
	
		System.out.println(count);
	}
	

	
}
