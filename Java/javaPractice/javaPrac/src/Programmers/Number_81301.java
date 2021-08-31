package Programmers;

//https://programmers.co.kr/learn/courses/30/lessons/81301
//ÇØ°á
public class Number_81301 {

	public static void main(String[] args) {
		

	}

    public int solution(String s) {
    	
    	String nums[] = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight","nine"};
    	for(int i =0; i<nums.length; i++) {
    	s = s.replace(nums[i], String.valueOf(i));
    	}

        return Integer.parseInt(s);
    }
}
