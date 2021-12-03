package Programmers;

//https://programmers.co.kr/learn/courses/30/lessons/68936
//ÇØ°á
public class Number_68936 {

	static int result0 =0;
	static int result1 =0;
	
	public static void main(String[] args) {
		
		int arr[][] = {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}};
		solution(arr);
	}

    public static int[] solution(int[][] arr) {
    
        int n = arr.length;
        recur(arr,n, 0, 0, n, n); 
        
        int[] answer = new int[2];
        answer[0] = result0;
        answer[1] = result1;
        return answer;
    }
    
    
  static void recur(int[][] arr, int n, int x1, int y1, int x2, int y2) {
    	
    	int num = arr[x1][y1];	
    	

    	for(int i =x1; i<x2; i++){    		
        	for(int j =y1; j<y2; j++){        		
        		if(arr[i][j] != num) {     			
        		 	for(int p =x1; p<x2; p+=n/2){    		
        	        	for(int k =y1; k<y2; k+=n/2){        		
        	        		recur(arr,n/2,p,k,p+n/2,k+n/2);      	        	
        	        	}
        	        	}
        		return;			
        		}
        	}
    	}
    	
    	if(num == 0)
    		result0++;
    	else if(num == 1)
    		result1++;
    	
    }
    
}
