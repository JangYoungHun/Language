package study;

//����Ž�� O(N^2)
public class LIS_Algorithm1 {

	public static void main(String[] args) {
		
		int arr[] = { 6, 2, 5, 1, 7, 4, 8, 3};
		int n = arr.length;
		int dp[] = new int[n+1];
		
		for(int i =0; i<n; i++) {		
			dp[i] = 1;
			for(int j =0; j<i; j++) {
				if(arr[i] > arr[j]) {
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
			}
		}
	}

}
