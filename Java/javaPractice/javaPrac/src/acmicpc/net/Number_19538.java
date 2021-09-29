package acmicpc.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
//https://www.acmicpc.net/status?user_id=wdg2325&problem_id=19538&from_mine=1
//五乞軒 段引 ばばばばばばば
public class Number_19538 {
	static int bridge[][] ;
	static int time[];
	static List<Integer> list;
	
	public static void main(String[] args)  throws IOException{
	

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
		
		bridge = new int[N+1][N+1]	;
		time = new int[N];
		list = new ArrayList<Integer>();
		int arr[] = new int[N];
		int p =0;
		
		for(int i=1; i<N+1; i++) {		
			st = new StringTokenizer(br.readLine());
			while(true) {
				int con = Integer.parseInt(st.nextToken());				 
				if(con ==0) break;			
				bridge[i][con] = 1;			
			}					
		}
		int minute = 1;
		
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());	
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {			
			int rumor = Integer.parseInt(st.nextToken());
			time[rumor-1] = minute;
		}
		
		minute++;
		
		for(int k=0; k<N; k++) {

		for(int i=1; i<N+1; i++) {		
			if(time[i-1] ==0) {
			int bridgeNum =0;
			int rumorX =0;
			for(int j=1; j<N+1; j++) {		
				if(bridge[i][j] == 1) {
					bridgeNum++;
					if(time[j-1] != 0)
						rumorX ++;
				}
			}	
			
			if(bridgeNum <= rumorX*2 && bridgeNum !=0) {
				arr[p] = i;
				p++;
			}	
		}			
		}
		for(int i=p-1; i >=0; i--) {
			time[arr[i] -1] =minute;
		}	
		p=0;
		
		minute ++;		
		}
		
		for(int i=0; i<N; i++) {
			time[i] --;
		}			
		System.out.println(Arrays.toString(time));
		br.close();
	}

}
