package UCPC_2020;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;


// 해결못함 메모리 초과 시간초과
public class Num4{

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	//	int cnt = 0;
		int time = 0;
		boolean dupli = true;
		int n =Integer.parseInt(br.readLine());
		int[][] close = new int[n][];
		int[] rumor = new int[n];     // 1 루머를 믿음 ; 0 믿지 않음 
		int[] result_ = new int[n]; 
		int[] result = new int[n];
		
		int num;
		for(int i =0; i <n ; i++)
		{
			
			close[i] =Arrays.stream( br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); 
		}
		
		int m = Integer.parseInt(br.readLine());
		int[] lier = Arrays.stream( br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		for(int i =0; i <n ; i++) {
			result[i] = -1;
		}
		for(int i =0; i <m ; i++)
		{
			rumor[ lier[i]-1 ] = 1;   // 처음 루머 가진사람
			result[lier[i]-1 ] = 0;
		}

		int rumY =0;
		int rumN=0;
		
		for(time =1; time < 200000  ; time ++)
		{	
			// 루머를 믿는지 검사
			for(int i =0; i <n ; i++)
			{
				
				if(rumor[i] == 1) {
					
					//루머를 믿는다면 퍼트리기 시도
					for(int j =0; j <close[i].length-1; j++)
					{
						num = close[i][j]-1;
					if(rumor[num] != 1) {
						// 인접한 사람의 과반수 검사
						for(int k =0; k < close[num].length-1; k++)
						   {					
							if(rumor[close[num][k]-1] == 1)
								rumY ++;
							else
								rumN++;						
							}
														
					if(rumY>=rumN) {
						rumor[num] = -1;					
					}					
					rumY = 0;
					rumN = 0;		
					}
					}
				}
			}			

			for(int i =0; i < n; i++ )
			{
				if(rumor[i] == -1) {
					rumor[i] = 1;
					result[i] = time;
				}
			}	
	//						 cnt ++;
			dupli = true;				 
			for(int i =0; i < n; i++ )
			{
				dupli = dupli && (result[i] == result_[i]);				
			}
			
			if(dupli == true)
				break
				;
			else {
				for(int i =0; i < n; i++ )
				{
				result_[i] = result[i];		
				}
				
			}

		}
		
		bw.write(String.valueOf(result[0]));
		for(int i =1; i <result.length; i++) {
			bw.write(" "+ result[i]);
		}
		br.close();
		bw.close();
	}
}
