package UCPC_2020;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

//  https://www.acmicpc.net/problem/19532
// ÇØ°á
public class Number_19532 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] str =  Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		// a=0, b=1, c=2, d=3 ,e=4 ,f=5		
		// ax + by =c ,   dx + ey = f 	
		int x=0;
		int y=0;		
		
		int a = str[0];
		int b = str[1];
		int c = str[2];
		int d = str[3];
		int e = str[4];
		int f = str[5];
			
for(int i = -999; i <=999; i++ )
{
	for(int j = -999; j <=999; j++ )
	{
		 if(a*i + b*j ==c && d*i + e*j == f) {
			 x = i;
			 y = j;
			 break;
		 }
			 
	}

}
		bw.write(x+" "+y);	
		
		br.close();
		bw.close();	
		
	}

}	
	

	



