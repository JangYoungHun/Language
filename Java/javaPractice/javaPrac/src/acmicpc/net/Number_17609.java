package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


//https://www.acmicpc.net/problem/17609
public class Number_17609 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str;
		int cnt =0;

		str = br.readLine();
		
		

		
		int T = Integer.parseInt(str);

		char[] ch;
		int [] result = new int[T];
		int k;
		
		for(int i =0;  i < T;  i++)
		{		
			k = 1;
			cnt =0;
			str = br.readLine().trim();
			ch = str.toCharArray();
			
			for(int j = 0; j <= str.length()-k  ;   )
			{	
				
				if( ch[j] == ch[str.length()-k])
				{
					if(j == str.length()-k  ||  j+1 == str.length()-k)
					{
						if(cnt ==1) {							
						result[i] = 1;		
						break;
						}
					}	

					j++;				
					k++;
				}
				else
				{
	
					if(cnt > 1) {
						result[i] = 2;
						break;
					}			
					
					else {	
						
						
						if(ch[j] == ch[str.length()-k-1] &&ch[j+1] == ch[str.length()-k]) {
							
							cnt ++;
							j+=2;
							k+=2;	
							
							if( j > str.length() -k) {
								result[i] = 1;
								break;
							}
							
							if( j == str.length() -k) {
								result[i] = 2;
								break;
							}
							
						}
						
			
					else if( ch[j] == ch[str.length()-k-1])
					{		
						cnt++;
						if(j == str.length()-k-1  ||  j+1 == str.length()-k-1)
						{
							result[i] = 1;
							break;
						}
						
						j++;			
						k+=2;
					}	
					
					else if( ch[j+1] == ch[str.length()-k])
					{			
						cnt++;
						if(j+1 == str.length()-k  ||  j+2 == str.length()-k)
						{
							result[i] = 1;
							break;
						}
						
						j+=2;			
						k++;
					}	
			
					else {
						result[i] = 2;
						break;
					}

						}
				}										
			}	
				
		}
		
		for(int i =0; i < result.length; i++ )
		{
			System.out.println(result[i]);

		}
			
		bw.flush();		

	
		bw.close();
		br.close();
	}
}
