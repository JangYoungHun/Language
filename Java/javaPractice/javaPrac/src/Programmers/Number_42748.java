package Programmers;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/42748
public class Number_42748 {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int p =0; p<commands.length; p++){
            
            int i = commands[p][0];
            int j = commands[p][1];
            int k = commands[p][2];
            
            int len = j-i+1;
            int cut[] = new int[len];
            
            
            for(int n=i-1; n<j; n++){
                cut[n-(i-1)] = array[n];
            }
            
           	Arrays.sort(cut);
            answer[p] = cut[k-1];
            
        }

        return answer;
    }
	
}
