package Programmers;

import java.util.Arrays;


//https://programmers.co.kr/learn/courses/30/lessons/77484
//ÇØ°á
public class Number_77484 {

	public static void main(String[] args) {
		int nums1[] =  {44, 1, 0, 0, 31, 25};	
		int nums2[]	 =  {31, 10, 45, 1, 6, 19};
		solution(nums1, nums2); 
	}

	 public static int[] solution(int[] lottos, int[] win_nums) {
	        int[] answer = new int[2];
	        
	        Arrays.sort(lottos);
	        Arrays.sort(win_nums);															
	        
	        int z_num = 0;
	        int cnt = 0;
	        int j =0;
	        int i =0;
	        
	       while(i<6 && j<6) {
		    	if(lottos[i] == 0) {
		    		z_num++;
		    		i++;
		    		continue;
		    	}   
		    	
		    	if(lottos[i] == win_nums[j]) {
		    		cnt++;
		    		i++;
		    		j++;
		    		
		    	}
		    	else if(lottos[i] > win_nums[j]) {
		    		j++;

		    	}
		    	
		    	else {
		    		i++;
		    	}   	       	   
	       }
	       
	       answer[1] = 7-cnt > 6 ? 6 : 7-cnt;
	       answer[0] = (7-(cnt + z_num)) >6 ? 6 :  (7-(cnt + z_num)) ;
	        
	        return answer;
	    }
}
