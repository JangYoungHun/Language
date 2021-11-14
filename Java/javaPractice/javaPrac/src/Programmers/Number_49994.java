package Programmers;

//https://programmers.co.kr/learn/courses/30/lessons/49994
// ÇØ°á
public class Number_49994 {

	public static void main(String[] args) {
	
	}
	
	 public int solution(String dirs) {
		
		 int arr[][][][] = new int[12][12][12][12];
		 	
		 int offset = 5;
		 
	        int answer = 0;
	        
	        int x = 0;
	        int y = 0;
	        
	        for(int i =0; i<dirs.length(); i++) {
	        	char ch = dirs.charAt(i);
	        	int m_x =0;
	        	int m_y =0;
	        	
	        	switch(ch) {
	        	case  'U' : {
	        		m_y = 1;
	        	}
	        		break;
	        	case  'D' : 
	        		m_y = -1;
	        		break;
	        	case  'R' : 
	        		m_x = 1;
	        		break;
	        	case  'L' :
	        		m_x = -1;
	        		break;
	        	}
	        	
	        	if(x+m_x < -5 || 5<x+m_x  || y+m_y < -5 || 5<y+m_y)
	        		continue;

	        	if(arr[x+offset][y+offset ][x+m_x+offset][y+m_y+offset] == 0 && arr[x+m_x+offset][y+m_y+offset][x+offset][y+offset] == 0) {
	        		arr[x+offset][y+offset][x+m_x+offset][y+m_y+offset] = 1;
	        		arr[x+m_x+offset][y+m_y+offset][x+offset][y+offset] = 1;
	        		answer ++;
	        	}
        	
		        	x += m_x;
		        	y += m_y;
	        }
	        
	        return answer;
	    }
}
