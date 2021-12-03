package acmicpc.net;

import java.util.Scanner;



//https://www.acmicpc.net/problem/19236
//  해결 못함 
public class Number_19236 {
	
	static Fish[][] fish;
	
	public static void main(String[] args) {
		
		int count=0;
		int moveNum = 1;
				
		fish = new Fish[4][4];    // 0번은 비어있음
		
		Fish shark = new Fish(17);  // 상어 17 번
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
		String[] strs = scanner.nextLine().split(" ");					
		for(int j = 0; j < 4; j++) {					
			fish[i][j] = new Fish(strs[2*j], strs[2*j+1], j, i);	
					
		}		
		}

		shark.direction = fish[0][0].direction;
		fish[0][0] = shark;
		count += fish[0][0].num;
	
	// 한 플레이	
	while(moveNum <= 16) {	
		
		if(moveNum==16) {
			break;
		}
		else {
			
		for(int i = 0; i < 4; i++) {												
		for(int j = 0; j < 4; j++) {					
						
				if(fish[i][j].num == moveNum)
				{
					fish[i][j].move();						
					break;
				}
				}	
		moveNum ++;
		}		
			}
	}
	moveNum = 1;
	
	
	
	for(int i = 0; i < 4; i++) {
		System.out.print(fish[0][i].num + " " );
	}
	
	System.out.println("");
	
	for(int i = 0; i < 4; i++) {
		System.out.print(fish[1][i].num +" ");
	}
	
	System.out.println("");
	
	for(int i = 0; i < 4; i++) {
		System.out.print(fish[2][i].num+ " ");
	}
	
	System.out.println("");
	
	for(int i = 0; i < 4; i++) {
		System.out.print(fish[3][i].num+ " ");
	}
	
	}
	
static class Fish
{
	
int num;       
int direction;
int posX;
int posY;

Fish(String num, String direction, int posX, int posY ){
	
	this.num = Integer.parseInt(num);
	this.direction = Integer.parseInt(direction);
	this.posX = posX;
	this.posY = posY;
}

Fish(int num)
{
	this.num = num;
	posX = 0;
	posY = 0;
}


void move() {
	
	int initial_dir;
	initial_dir = direction;
	
	switch(direction) {
	
	 // up
	case 1 :			
		for(int i = 0; i < 8; i++) {
			if(direction > 8 )
				direction = 1;
			
		if(posY-1 >= 0 && fish[posY-1][posX].num != 17 ) {
			
			if(fish[posY-1][posX].num == 0) {
				fish[posY-1][posX] = this;
				posY = posY-1;		
				break;
			}		
			else {
				
				fish[posY][posX] = fish[posY-1][posX];
				fish[posY-1][posX] = this;		
				posY = posY-1;	
				break;
			}
		}
				
		else 
		{ direction++; 
		
			if(initial_dir==direction)   // 한바퀴돌았는데 없을떄
			{	
			 break;
			}
		}	
		}   break;
			
	case 2 : 		
		for(int i = 0; i < 8; i++) {
			if(direction > 8 )
				direction = 1;
			
		if(posY-1 >= 0 && posX-1 >= 0 && fish[posY-1][posX-1].num != 17 ) {
			
			if(fish[posY-1][posX-1].num == 0) {
				fish[posY-1][posX-1] = this;
				posY = posY-1;
				posX = posX-1;
				break;
			}		
			else {
				
				fish[posY][posX] = fish[posY-1][posX-1];
				fish[posY-1][posX-1] = this;		
				posY = posY-1;	
				posX = posX-1;
				break;
			}
		}
				
		else 
		{ direction++; 
		
			if(initial_dir==direction)   // 한바퀴돌았는데 없을떄
			{	
			 break;
			}
		}	
		} break;
		
		
	case 3 :
	for(int i = 0; i < 8; i++) {
		if(direction > 8 )
			direction = 1;
		
	if(posY-1 >= 0 && fish[posY][posX-1].num != 17 ) {
		
		if(fish[posY][posX-1].num == 0) {
			fish[posY][posX-1] = this;
			posX = posX-1;		
			break;
		}		
		else {
			
			fish[posY][posX] = fish[posY][posX-1];
			fish[posY][posX-1] = this;		
			posX = posX-1;	
			break;
		}
	}
			
	else 
	{ direction++; 
	
		if(initial_dir==direction)   // 한바퀴돌았는데 없을떄
		{	
		 break;
		}
	}	
	
	}  break;
	
	case 4 : 
		for(int i = 0; i < 8; i++) {
		if(direction > 8 )
			direction = 1;
		
	if(posY-1 >= 0 && posX-1 >= 0 && fish[posY-1][posX-1].num != 17 ) {
		
		if(fish[posY-1][posX-1].num == 0) {
			fish[posY-1][posX-1] = this;
			posY = posY-1;
			posX = posX-1;
			break;
		}		
		else {
			
			fish[posY][posX] = fish[posY-1][posX-1];
			fish[posY-1][posX-1] = this;		
			posY = posY-1;	
			posX = posX-1;
			break;
		}
	}
			
	else 
	{ direction++; 
	
		if(initial_dir==direction)   // 한바퀴돌았는데 없을떄
		{	
		 break;
		}
	}	
	} break;
	
	
	case 5 :for(int i = 0; i < 8; i++) {
		if(direction > 8 )
			direction = 1;
		
	if(posY+1 <= 3 && fish[posY+1][posX].num != 17 ) {
		
		if(fish[posY+1][posX].num == 0) {
			fish[posY+1][posX] = this;
			posY = posY+1;		
			break;
		}		
		else {
			
			fish[posY][posX] = fish[posY+1][posX];
			fish[posY+1][posX] = this;		
			posX = posX-1;	
			break;
		}
	}
			
	else 
	{ direction++; 
	
		if(initial_dir==direction)   // 한바퀴돌았는데 없을떄
		{	
		 break;
		}
	}	
	
	} break;
	
	case 6 :
		for(int i = 0; i < 8; i++) {
		if(direction > 8 )
			direction = 1;
		
	if(posY+1 >= 0 && posX+1 <= 3 && fish[posY+1][posX+1].num != 17 ) {
		
		if(fish[posY+1][posX+1].num == 0) {
			fish[posY+1][posX+1] = this;
			posY = posY+1;
			posX = posX+1;
			break;
		}		
		else {
			
			fish[posY][posX] = fish[posY-1][posX+1];
			fish[posY+1][posX+1] = this;		
			posY = posY+1;	
			posX = posX+1;
			break;
		}
	}
			
	else 
	{ direction++; 
	
		if(initial_dir==direction)   // 한바퀴돌았는데 없을떄
		{	
		 break;
		}
	}	
	}break;
	
	case 7 :
		for(int i = 0; i < 8; i++) {
		if(direction > 8 )
			direction = 1;
		
	if(posX+1 <= 3 && fish[posY][posX+1].num != 17 ) {
		
		if(fish[posY][posX+1].num == 0) {
			fish[posY][posX+1] = this;
			posX = posX+1;		
			break;
		}		
		else {
			
			fish[posY][posX] = fish[posY][posX+1];
			fish[posY][posX+1] = this;		
			posX = posX+1;	
			break;
		}
	}
			
	else 
	{ direction++; 
	
		if(initial_dir==direction)   // 한바퀴돌았는데 없을떄
		{	
		 break;
		}
	}	
	}  break;
	
	case 8 :
		for(int i = 0; i < 8; i++) {
		if(direction > 8 )
			direction = 1;
		
	if(posY-1 >= 0 && posX+1 <= 3 && fish[posY-1][posX+1].num != 17 ) {
		
		if(fish[posY-1][posX+1].num == 0) {
			fish[posY-1][posX+1] = this;
			posY = posY-1;
			posX = posX+1;
			break;
		}		
		else {
			
			fish[posY][posX] = fish[posY-1][posX+1];
			fish[posY-1][posX+1] = this;		
			posY = posY-1;	
			posX = posX+1;
			break;
		}
	}
			
	else 
	{ direction++; 
	
		if(initial_dir==direction)   // 한바퀴돌았는데 없을떄
		{	
		 break;
		}
	}	
	} break;
	
	
	}
	
}
}
}
