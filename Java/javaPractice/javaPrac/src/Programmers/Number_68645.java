package Programmers;

//https://programmers.co.kr/learn/courses/30/lessons/68645
//검색  해결 
public class Number_68645 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public int[] solution(int n) {
	        
	        int d[] = new int[1001] ;
	        int lastNum = (n*(n+1))/2;
	        int num = 1;
	        
	        int arr[][] = new int [n][n];
	        
	        int row = -1;
	        int col = 0;
	        
	    	for(int k =n; k>0; k-=3) {
	       
	        	for(int i =0; i<k; i++) {arr[++row][col] = num++;}
	        	for(int i =0; i<k-1; i++) {arr[row][++col] = num++;}
	        	for(int i =0; i<k-2; i++) {arr[--row][--col] = num++;}
	        	
	        }
	        
	        int index =0;
	        int[] answer = new int[lastNum];
	        for(int p =0; p<n; p++) {
	        	 for(int k =0; k<n; k++) {
	 	        	if(arr[p][k] != 0) {
	 	        		answer[index++] = arr[p][k];
	 	        	}
	 	        }
	        }
	        return answer;
	        
	        
	    }
}
