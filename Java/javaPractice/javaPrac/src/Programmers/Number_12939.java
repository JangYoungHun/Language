package Programmers;

import java.util.Arrays;
import java.util.stream.Stream;

//https://programmers.co.kr/learn/courses/30/lessons/12939
//ÇØ°á
public class Number_12939 {

	public static void main(String[] args) {
	

	}
	 public String solution(String s) {
	        StringBuilder answer = new StringBuilder();
	        
	       int arr[] =  Stream.of(s.split(" ")).mapToInt(Integer::parseInt).toArray();
	        Arrays.sort(arr);
	        answer.append(arr[0]);
	        answer.append(" ");
	        answer.append(arr[arr.length-1]);
	        return answer.toString();
	    }
}
