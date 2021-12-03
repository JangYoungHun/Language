package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



// 미해결       배열 줄여서 해보기. 저장없이 바로 출력으로 해보기
// https://www.acmicpc.net/problem/17490
public class Number_17490 {

	static int block[] ;
	static int[] include_num;
	static  int[] need_;

	static long stone;
	static long result;
	static long result_;
	static int cam_num;
	static int block_num;
	public static void main(String[] args)  throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String st_  ="";
		st_ = br.readLine();
		String[] str = st_.split(" ");

		cam_num = Integer.parseInt(str[0]);		
		block_num= Integer.parseInt(str[1]);
		stone = Long.parseLong((str[2]));
		
		block = new int[block_num];
		include_num = new int[block_num];
	    need_ = new int[cam_num];
		 
		result =0;

		
	    st_= br.readLine();
	    
	    String str2[] = st_.split(" ");

	    
	    String st_2="";
	    for(int i =0; i<block_num; i++)
	    {
	    	st_2 = br.readLine();	    	
	    	block[i] = Integer.parseInt(st_2.split(" ")[0]) ;	    	
	    }
	
	    
		    int num = cam_num -block[block_num-1];

		  String  str_[] = new String[str2.length];
		
	    		  if(num > 0) {
		    	for(int i =num;  i < str2.length + num; i++) {
		    		 
		    		if(i > str2.length-1)
		    		{    str_[i-cam_num] = str2[i-num];    }
		    		else
		    		str_[i] = str2[i-num];		    		
		    	}		
	    		  }
	    		  
	    		  else
	    			  str_ = str2;
		    

		    for(int i =0; i<str_.length; i++) {
		 	need_ [i] = Integer.parseInt(str_[i]) ;
		    }
		 	
 
			 include_num[0] = cam_num - block[block_num-1] + block[0];
			 
			 for(int i =1; i<=include_num.length -1 ; i++)
			 {	 
			 include_num[i] = block[i] - block[i-1];			 
			 }
	 
				 result_ =0;
				 int index = 0;
			 
			 for(int i =0; i<include_num.length ; i++)
			 {	
				 result_ = need_[index]; 
				 for(int j =0; j<include_num[i] ; j++) {
					 result_ =Math.min( need_[index] , result_ );
					 index ++;	 
				 }
				 result += result_;			 
			 }		
			 


	    if(result <= stone)
	    	bw.write("Yes");
	    
	    else
	    	bw.write("No");
    

		br.close();
		bw.close();
		
	}

}
