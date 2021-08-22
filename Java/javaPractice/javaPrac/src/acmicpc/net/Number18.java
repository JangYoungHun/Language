package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Number18 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] nk = br.readLine().split(" ");
		int N = Integer.parseInt(nk[0]);
		int K = Integer.parseInt(nk[1]);
		String[][] result = new String[K*N][K*N];
		
		String str[];
		String str2[][] = new String[K*N][K*N];
		int num =0;
		
		for(int i = 0; i < N; i++)
		{
			str = br.readLine().split(" ");
			
			for(int l = 0; l < N; l++) {	
			for(int k = 0; k < str.length; K++){
				
				for(int j = K*num; j < K*(num+1); j++)
				{
					str2[l][j] = str[k]; 
				}
				num++;					
		}	
			num = 0;
			}
			for(int k = 0; k < N*K; K++) {
			for(int j = K*num; j < K*(num+1); j++)
			{
				result[j] = str2[k]; 
			}
			
			}
			
			}

			{

		}
			for(int i = 0; i < N*K; i++) {
			bw.write(result[i].toString() + "\n");	
			
			}
			
			bw.flush();
			bw.close();
			br.close();
		}
		

	}


