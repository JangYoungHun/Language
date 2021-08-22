package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/72412
// 효율성 실패

public class Number_72412 {

	public static void main(String[] args) {
		String strs1[] = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String strs2[] = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
		System.out.println(Arrays.toString(solution(strs1,strs2)));
	}
	   public static int[] solution(String[] info, String[] query) {
		   

		   String data[][]  = new String[info.length][5];
		   
		  for(int i =0; i< data.length; i++) {
			  data[i] = info[i].split(" ");
		  }
		  
		  int result[] = new int[query.length];
		  int index = 0;
		  for(String str : query) {
			  str = str.replace(" and", "");
			  String q[] = str.split(" ");
			  
			  List<Integer> list = new ArrayList<Integer>();
			  int cnt =0;
			  for(int i =0; i<data.length; i++) {		  
				  for(int j =0; j<5; j++) {
					  if(j<4 && q[j].equals("-")) continue;
					  if(j<4 && !data[i][j].equals(q[j]) ) break;
					  if( j==4 )  {
						  list.add(Integer.parseInt(data[i][j]));
					  }
				  }
				  }
			  
			  Collections.sort(list);
			  for(int i =list.size()-1; i>=0; i--) {
				  if(list.get(i) >= Integer.parseInt(q[4])) {
					  cnt++;
				  }
				  else
					  break;
			  }
			  result[index++] = cnt;

		  }
		  return result;

	    }
} 
