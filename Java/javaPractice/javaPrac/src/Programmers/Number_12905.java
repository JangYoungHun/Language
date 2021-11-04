package Programmers;


//스스로 해결 못함.
//  DP 중요
// 참고 https://onlydev.tistory.com/65

public class Number_12905 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public int solution(int [][]board)
    {
  
        int answer = 0;
        
        int n = board.length;
        
        if(n==1)
        	return board[0][0];
        
        int m = board[0].length;
      
        for(int i =1; i<n; i++) {          
            for(int j =1; j<m; j++) {
            	if(board[i][j] != 0) {
            	board[i][j] = Math.min(board[i-1][j],Math.min(board[i][j-1],board[i-1][j-1])) +1;   
            	answer  = Math.max(board[i][j], answer );
            	}
            }
        }
        for(int i =1; i<n; i++) {          
            for(int j =1; j<m; j++) {
             	answer  = Math.max(board[i][j], answer );
            }
        }
        return answer *answer ;
    }
}
