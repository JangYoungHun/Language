package Programmers;

// 해결
public class Number_60059 {
	public static void main(String args[]) {
		
		int[][] key = {{0, 0, 0}, {1, 0, 0}, {0, 1, 1}};
		int[][] lock = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
		System.out.println(solution(key, lock));
	}

	public static boolean solution(int[][] key, int[][] lock) {
		boolean answer = false;

		
		int m = key.length;
		int n = lock.length;
		int rotateKey[][] = null;
		int cnt = 0;
		int preKeyState[][] = key;
		int arr[][] = new int[n][n];
		
		
		for (int r = 0; r < 4; r++) {
			rotateKey = new int[m][m];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < m; j++) {
					rotateKey[j][m - 1 - i] = preKeyState[i][j];
				}
			}
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < m; j++) {
					preKeyState[i][j] = rotateKey[i][j];
				}
			}

			
			for (int i = -m+1; i < n; i++) {
				Loop1:
				for (int j = -m+1; j < n; j++) {
					
					for (int k = 0; k < n; k++) {
						for (int p = 0; p < n; p++) {
							 arr[k][p] = lock[k][p];
							if(0 <= k+i && k+i <m && 0 <= p+j && p+j <m) {
							 arr[k][p] = lock[k][p] ^ rotateKey[k+i][p+j];
							}
						}
					}		

					// 남은 0 가 있나 확인.
					for (int k = 0; k < n; k++) {
						for (int p = 0; p < n; p++) {
							if(arr[k][p] == 0) {
								continue Loop1;
							} 
						}
						}
					return true;
		
				}
			}

		}
		return answer;

	}
}

/*
 * public boolean solution(int[][] key, int[][] lock) { boolean answer = false;
 * int m = key.length; int n = lock.length; int preLockState[][] = lock;
 * 
 * for(int p = 0; p<4; p++){ int rotateLock[][] = new int[n][n];
 * 
 * for(int i =0; i<n; i++) { for(int j =0; j<n; j++) { rotateLock[j][n-1-i] =
 * preLockState[i][j]; } } preLockState = rotateLock;
 * 
 * int x1 = n - 1; int x2 = 0; int y1 = n - 1; int y2 = 0;
 * 
 * int cnt = 0; for (int i = 0; i < n; i++) { for (int j = 0; j < n; j++) { if
 * (rotateLock[i][j] == 0) { cnt++; x1 = Math.min(x1, i); y1 = Math.min(y1, j);
 * x2 = Math.max(x2, i); y2 = Math.max(y2, j); }
 * 
 * } }
 * 
 * if (cnt == 0) { return true; }
 * 
 * int arr[][] = new int[x2 - x1 + 1][y2 - y1 + 1]; for(int i =0; i<arr.length;
 * i++) { for(int j =0; j<arr[0].length; j++) { arr[i][j] =
 * rotateLock[x1+i][y1+j]; } }
 * 
 * 
 * int preKeyState[][] = key;
 * 
 * Loop1: for (int k = 0; k < 4; k++) { int rotateKey[][] = new int[m][m];
 * for(int i =0; i<m; i++) { for(int j =0; j<m; j++) { rotateKey[j][m-1-i] =
 * preKeyState[i][j]; } } preKeyState = rotateKey;
 * 
 * for (int i = 0; i < arr.length; i++) { for (int j = 0; j < arr[0].length;
 * j++) { if ((arr[i][j] == 1 && rotateKey[i][j] == 1) || (arr[i][j] == 0 &&
 * rotateKey[i][j] == 0)) continue Loop1; } } return true; } } return answer; }
 */
