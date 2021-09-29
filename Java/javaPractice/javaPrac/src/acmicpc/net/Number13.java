package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number13 {

	public static void main(String[] args) throws IOException
	{
		String str = "";
		String strL = "QWERTYASDFGZXCVB";
		String strl = "qwertyasdfgzxcvb";
		String strR = "UIOPHJKLNM";
		String strr = "uiophjklnm";

		
		int cntR = 0;
		int cntL = 0;
		int cntElse = 0;    // 대문자 스페이스바 문자 수
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = br.readLine();
		
		for(int i = 0; i < input.length(); i++)
		{
			str = input.substring(i, i+1);

			if(str == " ")
				cntElse ++;
			
			else if(strL.indexOf(str) != -1) {
				cntElse ++;         
				cntL++; 
			}
			
			else if(strR.indexOf(str) != -1) {
				cntElse ++;        
				cntR++; 
			}
				
			else 
			{
				if(strl.indexOf(str) != -1)  // 왼쪽 포함되어있나 판단
					cntL++; 
				else if(strr.indexOf(str) != -1)  // 오른쪽 포함되어있나 판단
					cntR++; 
				else
					cntElse++;			
			}		
		}
	    
		for(int i = 0; i < cntElse ;  i++) {
			
			if(cntR < cntL)
				cntR++;
			
			else if(cntR > cntL)
				cntL++;
			
			else if(cntR == cntL)
				cntL++;		
			
		}

		
		bw.write("\n"+cntL+" "+cntR);
		
		bw.flush();
		
		br.close();
		bw.close();

		
	}

}
