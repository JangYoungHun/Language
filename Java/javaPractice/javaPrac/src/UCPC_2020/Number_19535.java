package UCPC_2020;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//https://www.acmicpc.net/problem/19535
// 시간초과 런타임에러  >>>> Num3_2
public class Number_19535 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean connect ;
		int cnt_D =0;
		int cnt_G =0;
		String str;
		char[] ch;
	
		int n = Integer.parseInt(br.readLine());
		
		if(n <4 && 3000 < n)
			return;
		
		String strs[] = new String[n];		
		for(int i =0 ; i < n -1 ;  i++ ) {		
			strs[i] = br.readLine();			
		}
		
		for(int i =0 ; i < n -3 ;  i++ ) {
			
			for(int j =i+1 ; j < n -2 ;  j++ ) {
				
				if(( strs[i].split(" ")[1].equals( strs[i+1].split(" ")[0] )) || ( strs[j].contains(strs[i].split(" ")[0]) || strs[j].contains(strs[i].split(" ")[1]) ) )
				{

							
						for(int k =j+1 ; k < n-1  ;  k++ ) {
		
							// G 경우 모두가 같은 숫자 가지고있음
							if( (strs[j].contains(strs[i].split(" ")[0]) && strs[k].contains(strs[i].split(" ")[0] ) ) ||  ( strs[j].contains(strs[i].split(" ")[1]) && strs[k].contains(strs[i].split(" ")[1] ) ) )
									{
									cnt_G ++;
						
									}								
							else
							{
								connect = (strs[i].split(" ")[1].equals(strs[j].split(" ")[0]) &&  strs[j].split(" ")[1].equals(strs[k].split(" ")[0]));				
								
								if(connect) {
								cnt_D++;		
						
								}
								else break;						
							}
									}					
			}				
				else break;
			}
			
	
		}		
		
		
	//	System.out.println( cnt_D);
	//	System.out.println( cnt_G);
		
		if(cnt_D > 3 * cnt_G)
			bw.write("D");
		else if(cnt_D < 3 * cnt_G)
			bw.write("G");
		else if(cnt_D == 3 * cnt_G)
			bw.write("DUDUDUNGA");

		br.close();
		bw.close();
			
	}
}
