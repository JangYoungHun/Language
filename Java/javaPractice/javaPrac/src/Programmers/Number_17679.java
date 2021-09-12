package Programmers;

import java.util.ArrayList;

import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/17679
//해결
public class Number_17679 {

	public static void main(String[] args) {
		String[] board = {"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"};
		int m = 6;
		int n = 6;
		 solution(m, n, board) ;
	}

	static class Pos {
		int x;
		int y;

		Pos(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static int solution(int m, int n, String[] board) {
		int answer = 0;

		char map[][] = new char[m][n];

		for (int i = 0; i < m; i++) {
			map[i] = board[i].toCharArray();
		}

		while (true) {
			List<Pos> list = new ArrayList<Pos>();
			// 2*2 검색
			for (int i = 0; i < m - 1; i++) {
				for (int j = 0; j < n-1; j++) {
					if (map[i][j] == '+')
						continue;

					char ch = map[i][j];
					if (ch == map[i][j + 1] && ch == map[i + 1][j] && ch == map[i + 1][j + 1]) {
						list.add(new Pos(i, j));
					}
				}
			}

			if (list.size() == 0)
				break;

			// 제거
			for (int i = 0; i < list.size(); i++) {
				int x = list.get(i).x;
				int y = list.get(i).y;
				map[x][y] = '+';
				map[x + 1][y] = '+';
				map[x][y + 1] = '+';
				map[x + 1][y + 1] = '+';
			}
			
			//빈공간 내려주기
			Loop1:
			for(int i =0; i<n; i++) {
				for(int j =m-1; j>=0; j--) {
					if(map[j][i] == '+') {
						for(int k=j-1; k>=0; k--) {
							if(map[k][i] != '+') {
								map[j][i] = map[k][i];
								map[k][i] = '+';
								break;		
							}
							if(k==0)
								continue Loop1;
						}
					}
				}
			}

		}
		
		for(int i =0; i<m; i++) {
			for(int j =0; j<n; j++) {
				if(map[i][j] == '+')
					answer ++;
			}
		}
		
		return answer;
	}

}
