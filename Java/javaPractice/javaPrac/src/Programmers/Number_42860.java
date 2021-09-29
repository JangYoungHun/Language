package Programmers;

import java.util.ArrayList;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/42860
//미해결
public class Number_42860 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("JEROEN")); 
	}
	
    //A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z
    //해결
    public static  int solution(String name) {
        int answer = 0;
        int N =name.length();
       List<Integer> list = new ArrayList<Integer>();

        
        for(int i=0; i<N; i++){ 
            char ch = name.charAt(i);
            if(ch != 'A') {
            	list.add(i);
            	int num2 = Math.abs(ch -'A');
                answer += num2 >13 ? 26 - num2 : num2 ;
            } 
        }
        
        int pos = 0;
        while(!list.isEmpty()) {
        	//JAZ  0 2
        	int num1 =  Math.abs(pos- list.get(0));
        	int num2 =  Math.abs(pos- list.get(list.size()-1));
        	int leftD = num1 > N/2 ? N-num1  : num1 ;
        	int rightD = num2 > N/2 ? N-num2  : num2  ;
        	
        	if(leftD > rightD) {
        		pos = list.get(list.size()-1);
        		answer += rightD;
        		list.remove(list.size()-1);
        	}
        	
        	else {
        		pos = list.get(0);
        		answer += leftD;
        		list.remove(0);
        		
        	}
        }


        return answer;
    }
    
}
