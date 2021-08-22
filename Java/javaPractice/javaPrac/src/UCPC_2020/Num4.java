package UCPC_2020;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;


// �ذ���� �޸� �ʰ� �ð��ʰ�
public class Num4{

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	//	int cnt = 0;
		int time = 0;
		boolean dupli = true;
		int n =Integer.parseInt(br.readLine());
		int[][] close = new int[n][];
		int[] rumor = new int[n];     // 1 ��Ӹ� ���� ; 0 ���� ���� 
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
			rumor[ lier[i]-1 ] = 1;   // ó�� ��� �������
			result[lier[i]-1 ] = 0;
		}

		int rumY =0;
		int rumN=0;
		
		for(time =1; time < 200000  ; time ++)
		{	
			// ��Ӹ� �ϴ��� �˻�
			for(int i =0; i <n ; i++)
			{
				
				if(rumor[i] == 1) {
					
					//��Ӹ� �ϴ´ٸ� ��Ʈ���� �õ�
					for(int j =0; j <close[i].length-1; j++)
					{
						num = close[i][j]-1;
					if(rumor[num] != 1) {
						// ������ ����� ���ݼ� �˻�
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
