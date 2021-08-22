package acmicpc.net;

// https://www.acmicpc.net/problem/17488
// 해결
	
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;


	
public class Number_17488 {

	public static void main(String[] args) throws IOException {

		
		int std_num ;
		int sbj_num;
		String success = "";

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] num = br.readLine().split(" ");
		std_num  = Integer.parseInt(num[0]);
		sbj_num = Integer.parseInt(num[1]);
		
		int[][] result = new int[std_num ][sbj_num];
		int[] limit = new int[sbj_num];
		int apply1[] = new int[sbj_num];
		int apply2[] = new int[sbj_num];
		
		num = br.readLine().split(" ");
		
		for(int i =0; i < sbj_num ; i++)
		{			
			limit[i] = Integer.parseInt(num[i]);					
		}		
		
		// 1차 수강신청
		for(int i =0; i < std_num ; i++) {			
			num = br.readLine().split(" ");
			
			for(int j =0; j < num.length -1  ;  j++)
			{				
				int num_ =Integer.parseInt(num[j])-1;		
				result[i][num_] = 1;       // 신청 1
				apply1[ num_ ] ++;	
			}					
		}		

		for(int i =0; i < sbj_num ; i++) {
			
			if(apply1[i] > limit[i]) {
				for(int j =0; j < std_num ; j++) {				
					result[j][i] = -1;    // 신청 실패
					limit[i] = 0;
				}
		
			}				
			else
				limit[i] -= apply1[i];
		}
	

		// 2차 수강신청
	for(int i =0; i < std_num ; i++) {
			
			num = br.readLine().split(" ");
			
			for(int j =0; j < num.length -1  ;  j++)
			{				
				int num_ =Integer.parseInt(num[j])-1;				
				result[i][num_] = 2;       // 신청 2
				apply2[ num_ ] ++;				
			}			
		
		}		

	
	for(int i =0; i < sbj_num ; i++) {
		
		if(apply2[i] > limit[i]) {
			for(int j =0; j < std_num ; j++) {	
				if(result[j][i]  == 2 ) {
				result[j][i] = -1;    // 신청 실패
				}
			}
	
		}				

	}

	for(int i =0; i < std_num ; i++) {
		
		for(int j =0; j < sbj_num ; j++) {	
			
			if( result[i][j] == 1 || result[i][j] == 2)
			{
				success += " "  + (j+1);
			}
	
		}
		if(success == "")
			bw.write("망했어요 \n");
		
		else
		bw.write(success.trim() + "\n");
		
		success ="";
		
	}
	

	
	
		
		br.close();
		bw.close();
		
	}

}
