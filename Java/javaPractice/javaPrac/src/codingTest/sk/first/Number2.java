package codingTest.sk.first;

public class Number2 {
	
	public static void main(String[] args) {

		solution(6, false);
	}
	
	static int arr[][];
	static int m;
	
	public static int[][] solution(int n, boolean clockwise) {
		arr = new int[n][n];
		m = n;
		int cri = n%2 == 0 ? n/2 : n/2+1; 
		int num =1;
		if(clockwise) {
			for(int i =0; i<cri; i++) {
				clockWise(i,i,num);
				num += n-2*i-1;
			}
		}
		else if(!clockwise) {
			for(int i =0; i<cri; i++) {
				counterClockWise(i,i,num);
				num += n-2*i-1;
			}
		}
		
		return arr;
	}
	
	
	public static void clockWise(int x, int y, int num) {
		
		int num2 = num;
		for(int i =x; i<m-x; i++) {
			arr[y][i] = num2;
			num2++;
			if(num2 ==m-2*x-1+num) {
				num2 =num;
			}
		}	
		
		for(int j =y+1; j<m-y; j++) {
			arr[j][m-x-1] = num2;
			num2++;
			if(num2 ==m-2*x-1+num) {
				num2 =num;
			}
		}
		
		for(int i =m-x-2; i>=x; i--) {
			arr[m-y-1][i] = num2;
			num2++;
			if(num2 ==m-2*x-1+num) {
				num2 =num;
			}
		}	
		
		for(int j =m-y-2; j>y; j--) {
			arr[j][x] = num2;
			num2++;
			if(num2 ==m-2*x-1+num) {
				num2 =num;
			}
		}
	}
	
	
public static void counterClockWise(int x, int y, int num) {
		
		int num2 = num;
		
		for(int j =y; j<m-y; j++) {
			arr[j][x] = num2;
			num2++;
			if(num2 ==m-2*x-1+num) {
				num2 =num;
			}
		}
		
		for(int i =x+1; i<m-x; i++) {
			arr[m-y-1][i] = num2;
			num2++;
			if(num2 ==m-2*x-1+num) {
				num2 =num;
			}
		}	
		
		for(int j =m-y-2; j>=y; j--) {
			arr[j][m-x-1] = num2;
			num2++;
			if(num2 ==m-2*x-1+num) {
				num2 =num;
			}
		}

		for(int i =m-x-2; i>x; i--) {
			arr[y][i] = num2;
			num2++;
			if(num2 ==m-2*x-1+num) {
				num2 =num;
			}
		}	

	}
}
