package UCPC_2020;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Num3_2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<int[]> list = new ArrayList<int[]>(); 
		int cnt_D =0;
		int cnt_G =0;
		int n = Integer.parseInt(br.readLine());

		if(n < 4 || n >300000) {
			return;
		}

		for(int i =0 ; i < n -1 ;  i++ ) {		
			list.add(  Arrays.stream( br.readLine().split(" ") ).mapToInt(Integer::parseInt).toArray()  );
		}
		
		
		
		
		

		for(int i =0 ; i < n -3 ;  i++ ) {
			
			for(int j =i+1 ; j < n -2 ;  j++ ) {
				if(list.get(i)[1] ==list.get(j)[0]) {
						for(int k =j+1 ; k < n -1 ;  k++ ) {			
							// G 경우 모두가 같은 숫자 가지고있음
							if( (list.get(i)[0] == list.get(j)[0] &&list.get(i)[0] == list.get(k)[0] )   ||  (list.get(i)[1] ==list.get(j)[0] && list.get(i)[1] ==list.get(k)[0] )  )
									{
									cnt_G ++;
									}														
							else if(list.get(i)[1] == list.get(j)[0]  &&  list.get(j)[1] == list.get(k)[0])
							{
								cnt_D++;
							
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