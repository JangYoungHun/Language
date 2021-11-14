package Programmers;

import java.util.ArrayList;

//ÇØ°á
public class Number_87946 {

	public static void main(String[] args) {
		int[][] arr = {{80,20},{50,40},{30,10}};
		 solution(80, arr);
	}
	
	static int result=0;
	
    public static int solution(int k, int[][] dungeons) {
        int answer = -1;
        int n = dungeons.length;
        order(new ArrayList<Integer>(), dungeons, n, k);
        
        return result;
    }

    
    static void order(ArrayList<Integer> list, int[][] dungeons, int n, int k) {
    	if(list.size() == n) {    		
    		int cnt = 0;
    		
    		for(int i =0; i<n; i++) {
    			int index = list.get(i);
    			if(k >= dungeons[index][0]) {
    				cnt++;
    				k -= dungeons[index][1];
    			}
    			else 
    				break;
    		}  		
    		result = Math.max(result, cnt); 		
    		return;
    	}
    	
    	for(int i =0; i<n; i++) {
    		if(!list.contains(i)) {
    			list.add(i);
    			order(list,dungeons,n,k);
    			list.remove(list.size()-1);
    		}
    	}
    	
    }
    
}
