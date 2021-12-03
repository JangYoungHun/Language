package acmicpc.net;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//https://www.acmicpc.net/problem/3190
//해결
public class Number_3190 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();  // 보드 크기
		int k = sc.nextInt();  // 사과 갯수
		List<int[]> route = new LinkedList<int[]>();
		int apple[][] = new int[n][n];
		int body[][] = new int[n][n];
		body[0][0] = 1;
		route.add(new int[]{0,0});
		for(int i=0; i<k; i++) {			
			apple[sc.nextInt()-1][sc.nextInt()-1] = 1; 
		}
		
		int L =sc.nextInt();  // 반향 전환 횟수
		int rotate[] = new int[2*L];
		
		int index =0;
		for(int i = 0; i < L; i++) {
			rotate[index++] = Integer.parseInt(sc.next());        
			rotate[index++] = sc.next().charAt(0);             // D = 68   L = 76
		}
		System.out.println(move(0,rotate,0, body, apple, route, 0, 0, n, L, 1 ));
	}
	
	static int move(int direction,int rotate[],int index, int body[][], int[][] apple, List route, int x, int y, int n, int L,  int time ) {
	
		
		
		int nextX=x;
		int nextY=y;
		if(L>0) {
		if(time == rotate[index]+1) {
			 if(rotate[index+1] == 68) {
				 direction -=1;
				 if(direction <0) direction +=4;
			 }
			 else {
				 direction = (direction+1)%4;
			 }
			 index+=2;
			 L--;
		}
		}
		
		switch(direction) {
		case 0:    // 오른쪽
			nextX = x;
			nextY = y+1;
			break;              
			
		case 1:  // 위
			nextX = x-1;
			nextY = y;
			break; 
		case 2:  // 왼쪽
			nextX = x;
			nextY = y-1;
			break;   
		case 3:  // 아래
			nextX = x+1;
			nextY = y;
			break; 
		}
		
		if( 0<=nextX && nextX < n  && 0<=nextY &&nextY < n) {
			if( body[nextX][nextY] !=1){//  GameOver X
				route.add(new int[]{nextX,nextY});
			if(apple[nextX][nextY] ==1) { // 사과가 있다면
						
				body[nextX][nextY] =1;
				apple[nextX][nextY] =0;
				return move(direction,rotate, index, body, apple, route, nextX,  nextY,  n, L,   time +1 );
			}
			else {
				body[nextX][nextY] =1;
				body[((int[])route.get(0))[0]][((int[])route.get(0))[1]] =0;
			
				route.remove(0);
			
				
				return move(direction,rotate, index, body, apple, route, nextX,  nextY,  n, L,  time +1 );
			}
		}
			else
				return time;     //  GameOver O
		}
		
		else
			return time;

		

	}
	
}
