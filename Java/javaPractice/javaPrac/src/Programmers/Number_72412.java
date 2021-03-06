package Programmers;

import java.lang.reflect.Array;
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
		  
		  int arr[][][][] = new int[4][3][3][3];
		  
		  int index =0;
		  for(int i =0; i<4; i++) {
			  for(int j =0; j<3; j++) {
				  for(int k =0; k<3; k++) {
					  for(int p =0; p<3; p++) {
						  arr[i][j][k][p] = index++;
					  }
				  }
			  }
		  }
		  
		  List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		  int num = 4*3*3*3;
		  for(int i =0; i<num; i++) {
		  list.add(new ArrayList<Integer>());
		  }
		  for(int i =0; i< data.length; i++) {
			  int index1=0;
			  int index2=0;
			  int index3=0;
			  int index4=0;
			  
			 switch(data[i][0]) {
				case "cpp" :  index1 = 0; break;
				case "java" :  index1 = 1; break;
				case "python" :  index1 = 2; break;
			 }
			 switch(data[i][1]) {
				case "backend" :  index2 = 0; break;
				case "frontend" :  index2 = 1; break;
			 }
			 switch(data[i][2]) {
				case "junior" :  index3 = 0; break;
				case "senior" :  index3 = 1; break;
			 }
			 switch(data[i][3]) {
				case "chicken" :  index4 = 0; break;
				case "pizza" :  index4 = 1; break;
			 }
			 
			 int score = Integer.parseInt(data[i][4]);
			  
			 list.get(arr[index1][index2][index3][index4]).add(score);
			 list.get(arr[3][index2][index3][index4]).add(score);
			 list.get(arr[3][2][index3][index4]).add(score);
			 list.get(arr[3][index2][2][index4]).add(score);
			 list.get(arr[3][index2][index3][2]).add(score);
			 list.get(arr[3][2][2][index4]).add(score);
			 list.get(arr[3][2][index3][2]).add(score);
			 list.get(arr[3][index2][2][2]).add(score);
			 list.get(arr[3][2][2][2]).add(score);

			 list.get(arr[index1][2][index3][index4]).add(score);
			 list.get(arr[index1][2][2][index4]).add(score);
			 list.get(arr[index1][2][index3][2]).add(score);
			 list.get(arr[index1][2][2][2]).add(score);
	
			 list.get(arr[index1][index2][2][index4]).add(score);
			 list.get(arr[index1][index2][2][2]).add(score);
			 
			 list.get(arr[index1][index2][index3][2]).add(score);

		  }
		  
		  
		  int result[] = new int[query.length];
		   String q[][]  = new String[query.length][5];		   
			  for(int i =0; i< q.length; i++) {
				  q[i] = query[i].replace(" and", "" ).split(" ");
			  }
			  
			  for(int i =0; i<q.length; i++) {
				  int index1=0;
				  int index2=0;
				  int index3=0;
				  int index4=0;
				  
				 switch(q[i][0]) {
					case "cpp" :  index1 = 0; break;
					case "java" :  index1 = 1; break;
					case "python" :  index1 = 2; break;
					case "-" : index1 = 3; break;
				 }
				 switch(q[i][1]) {
					case "backend" :  index2 = 0; break;
					case "frontend" :  index2 = 1; break;
					case "-" : index2 = 2; break;
				 }
				 switch(q[i][2]) {
					case "junior" :  index3 = 0; break;
					case "senior" :  index3 = 1; break;
					case "-" : index3 = 2; break;
				 }
				 switch(q[i][3]) {
					case "chicken" :  index4 = 0; break;
					case "pizza" :  index4 = 1; break;
					case "-" : index4 = 2; break;
				 }
				 
				 int score = Integer.parseInt(q[i][4]);
				 ArrayList<Integer> scoreList = list.get(arr[index1][index2][index3][index4]);
				 scoreList.sort(Collections.reverseOrder());
				 
				 int cnt =0;
				 for(int j =0; j< scoreList.size(); j++) {
					 if(scoreList.get(j) >= score) {
						 cnt++;
					 }
					 else break;
				 }
				  result[i] = cnt;
			  }
			  

			  
		  return result;

	    }
} 
