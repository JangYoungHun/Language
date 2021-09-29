package Programmers;

import java.util.PriorityQueue;

//https://programmers.co.kr/learn/courses/30/lessons/42626
//ÇØ°á
public class Number_42626 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,3,9,10,12};
		int k = 7;
		System.out.println(solution(nums, k));
	}
	
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        
        for(int i : scoville) {
        	q.add(i);
        }
   
        
        while(q.peek() < K && q.size() > 1) {
        	answer++;
        	int num1 = q.poll();
        	int num2 = q.poll();
        	int num3 =  num1 + (num2*2);     
        	
        	q.add(num3);       	
        }
        
        if(q.size() ==1 && q.peek() < K)
        	return -1;
        
        else
        	 return answer;

        
       
    }
}

