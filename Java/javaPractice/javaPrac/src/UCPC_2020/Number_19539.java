package UCPC_2020;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

//https://www.acmicpc.net/problem/19539    
// 해결 
public class Number_19539 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n  = Integer.parseInt( br.readLine() );

		
		int h[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int num_1 =0;   // 1의 개수
		int num_2 =0;   // 2의 개수
		
		for(int i =0; i< h.length ; i++) {
			
			  num_2 += h[i] / 2 ;
			  num_1 += h[i] % 2 ;			
		}
		
		while(true)
		{
			if(num_1 == num_2)
			{
				bw.write("YES");
				break;
			}
			
			else if(num_1 > num_2) {
				bw.write("NO");
				break;
			}
	
			else
			{
				num_2 --;
				num_1 +=2;
			}

		}

		
		br.close();
		bw.close();
		
	}

}
