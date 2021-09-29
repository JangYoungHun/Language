package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;



public class Number17 {
	
	static int N;
	static int cnt = 0;
	static int home[][];
	public static void main(String[] args) throws IOException	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



		N = Integer.parseInt(br.readLine()); 
		home = new int[N][N];   // N X N 집 
		
		for(int i =0; i < N; i++) {
			
			home[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
			
		}



		int pos1_X=0;
		int pos1_Y=0;
		
		int pos2_X=0;
		int pos2_Y=1;
		
		move(pos1_X, pos1_Y, pos2_X, pos2_Y);
		
		
		bw.write( String.valueOf(cnt) );	
		br.close();
		bw.close();
			
	}
	static void move(	int pos1_X , int pos1_Y, int pos2_X, int pos2_Y)
	{

		if(pos2_X == N-1 && pos2_Y == N-1)
		{
			cnt ++;		
			return;
		}		
		
		//가로 일때
		else if(pos1_X == pos2_X)
		{
		// 옆으로 이동할 때
			// 옆에 공간이있나
			if(pos2_Y+1 < N) {
			if(home[pos2_X][pos2_Y+1] != 1)  
			{
				move(pos2_X , pos2_Y , pos2_X, pos2_Y+1);
			}
			else
				return;		
			}

		// 대각선으로 이동할때 
			// 옆에 공간이있나
			if(pos2_Y+1 < N  && pos2_X+1 < N) {
			if(home[pos2_X][pos2_Y+1] != 1 &&  home[pos2_X+1][pos2_Y+1] != 1  &&  home[pos2_X+1][pos2_Y] != 1)  
			{
				move(pos2_X , pos2_Y , pos2_X+1, pos2_Y+1);
			}

			else
				return;
		}

		}	
			
		//세로일때
		else if(pos1_Y == pos2_Y)
		{
		// 아래로 이동할 때
			// 아래 공간이 있나
			if(pos2_X+1 <N) {
			if(home[pos2_X+1][pos2_Y] != 1)  
			{
				move(pos2_X , pos2_Y , pos2_X+1, pos2_Y);
			}
			else
				return;
			}
			
		//대각선으로 이동할때
			//  공간이 있나
			if(pos2_X+1 <N && pos2_Y+1 <N ) {
			if(home[pos2_X][pos2_Y+1] != 1 &&  home[pos2_X+1][pos2_Y+1] != 1  &&  home[pos2_X+1][pos2_Y] != 1)  
			{
				move(pos2_X , pos2_Y , pos2_X+1, pos2_Y+1);				
			}
			else
				return;		
		}

			
		}
		
		//대각선 일때
		else 
		{
			// 가로 되면서 이동
			//가로 공간이 있나
			if(pos2_Y+1 <N) {
			if(home[pos2_X][pos2_Y+1] != 1)  
			{
				move(pos2_X , pos2_Y , pos2_X, pos2_Y+1);
			}
			else
				return;
			}
			
			// 세로 되면서 이동
			// 세로 공간이 있나
			if(pos2_X+1 <N) {
			if(home[pos2_X+1][pos2_Y] != 1)  
			{
				move(pos2_X , pos2_Y , pos2_X+1, pos2_Y);
			}
			else
				return;
			}

			// 대각선 유지한 채 이동
			// 대각선 공간이 있나
			if(pos2_X+1 <N  && pos2_Y+1 <N) {
		if(home[pos2_X][pos2_Y+1] != 1 &&  home[pos2_X+1][pos2_Y+1] != 1  &&  home[pos2_X+1][pos2_Y] != 1)  
		{
			move(pos2_X , pos2_Y , pos2_X+1, pos2_Y+1);				
		}
		else
			return;
			}

		}
	}
		
	}
	
	
	
	

