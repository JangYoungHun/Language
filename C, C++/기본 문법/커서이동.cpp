#include <stdio.h>
#include <windows.h>

void gotoxy(int x , int y) {
	
	COORD pos;
	pos.X = x;
	pos.Y = y;
	SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE),pos);

	
}

int main () {
	
	gotoxy(10,10);
	
	Sleep(3000);
	
	gotoxy(30,30);
	
	return 0;
	
}
