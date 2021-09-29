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
		home = new int[N][N];   // N X N �� 
		
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
		
		//���� �϶�
		else if(pos1_X == pos2_X)
		{
		// ������ �̵��� ��
			// ���� �������ֳ�
			if(pos2_Y+1 < N) {
			if(home[pos2_X][pos2_Y+1] != 1)  
			{
				move(pos2_X , pos2_Y , pos2_X, pos2_Y+1);
			}
			else
				return;		
			}

		// �밢������ �̵��Ҷ� 
			// ���� �������ֳ�
			if(pos2_Y+1 < N  && pos2_X+1 < N) {
			if(home[pos2_X][pos2_Y+1] != 1 &&  home[pos2_X+1][pos2_Y+1] != 1  &&  home[pos2_X+1][pos2_Y] != 1)  
			{
				move(pos2_X , pos2_Y , pos2_X+1, pos2_Y+1);
			}

			else
				return;
		}

		}	
			
		//�����϶�
		else if(pos1_Y == pos2_Y)
		{
		// �Ʒ��� �̵��� ��
			// �Ʒ� ������ �ֳ�
			if(pos2_X+1 <N) {
			if(home[pos2_X+1][pos2_Y] != 1)  
			{
				move(pos2_X , pos2_Y , pos2_X+1, pos2_Y);
			}
			else
				return;
			}
			
		//�밢������ �̵��Ҷ�
			//  ������ �ֳ�
			if(pos2_X+1 <N && pos2_Y+1 <N ) {
			if(home[pos2_X][pos2_Y+1] != 1 &&  home[pos2_X+1][pos2_Y+1] != 1  &&  home[pos2_X+1][pos2_Y] != 1)  
			{
				move(pos2_X , pos2_Y , pos2_X+1, pos2_Y+1);				
			}
			else
				return;		
		}

			
		}
		
		//�밢�� �϶�
		else 
		{
			// ���� �Ǹ鼭 �̵�
			//���� ������ �ֳ�
			if(pos2_Y+1 <N) {
			if(home[pos2_X][pos2_Y+1] != 1)  
			{
				move(pos2_X , pos2_Y , pos2_X, pos2_Y+1);
			}
			else
				return;
			}
			
			// ���� �Ǹ鼭 �̵�
			// ���� ������ �ֳ�
			if(pos2_X+1 <N) {
			if(home[pos2_X+1][pos2_Y] != 1)  
			{
				move(pos2_X , pos2_Y , pos2_X+1, pos2_Y);
			}
			else
				return;
			}

			// �밢�� ������ ä �̵�
			// �밢�� ������ �ֳ�
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
	
	
	
	

