package Programmers;


import java.util.HashSet;
import java.util.Set;

//https://programmers.co.kr/learn/courses/30/lessons/1845
//ÇØ°á
public class Number_1845 {

	public static void main(String[] args) {
	}
	
    public int solution(int[] nums) {
    	int n = nums.length/2;
    	Set<Integer> set = new HashSet<Integer>();
    	
    	for(int i : nums) {
    		set.add(i);
    	}
    	
    	int m = set.size();
    	
    	int answer = 0;
    	
    	answer = (m > n) ? n : m;
    	
    	return answer;

    }
}
