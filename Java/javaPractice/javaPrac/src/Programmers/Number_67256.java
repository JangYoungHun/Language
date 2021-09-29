package Programmers;



//https://programmers.co.kr/learn/courses/30/lessons/67256
// ÇØ°á
public class Number_67256 {
	
	
	public static void main(String args[]) {
		int nums[] = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		solution(nums, "right");
	}
	
	static class Position{
		int x;
		int y;
		Position(int x, int y){
			this.x = x;
			this.y = y;
		}
	}

    public static String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        
        Position position[] = new Position[10];
        
        position[0] = new Position(3, 1);
        
        int num = 1;
        for(int i =0; i<3; i++) {
        	  for(int j =0; j<3; j++) {
              	position[num++] = new Position(i, j);
              }
        }
        
        Position left = new Position(3, 0);
        Position right= new Position(3, 2);
        
        for(int n : numbers) {
        	
        	if(n ==1 ||n ==4||n ==7) {
        		sb.append("L");
        		left = position[n];
        	}
        	else if(n ==3 ||n ==6||n ==9) {
        		sb.append("R");
        		right = position[n];
        	}
        	else {
        		int x = position[n].x;
        		int y = position[n].y;
        		
        		int disL = Math.abs(x-left.x)+Math.abs(y-left.y);
        		int disR = Math.abs(x-right.x)+Math.abs(y-right.y);
        		
        		if(disL > disR) {
        			sb.append("R");
            		right = position[n];
        		}
        		else if(disL < disR) {
        			sb.append("L");
            		left = position[n];
        		}
        		else {
        			if(hand.equals("right")) {
        				sb.append("R");
                		right = position[n];
        			}
        			else {
        				sb.append("L");
                		left = position[n];
        			}
        		}
        	}
        }

        return sb.toString();
    }

}
