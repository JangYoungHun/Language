package study;

//���� https://www.youtube.com/watch?v=9574GHxCbKc&list=PLRx0vPvlEmdDHxCvAQS1_6XV4deOwfVrz&index=26
public class FloydWarshall {
	// Node ����
	static int n = 4;
	static Double INF = Double.POSITIVE_INFINITY;
	static double a[][] = { { 0, 5, INF, 8 }, { 7, 0, 9, INF }, { 2, INF, 0, 4 }, { INF, INF, 3, 0 } };

	public static void main(String[] args) {
		 floydWarshall();
	}

	static void floydWarshall() {
		double d[][] = new double[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				d[i][j] = a[i][j];
			}
		}
		// k ���İ��� ���
		for (int k = 0; k < n; k++) {
			// i ��� ���
			for (int i = 0; i < n; i++) {
				// j ���� ���
				for (int j = 0; j < n; j++) {
					if (d[i][j] > d[i][k] + d[k][j]) {
						d[i][j] = d[i][k] + d[k][j];
					}
				}
			}
		}
		for (int i = 0; i < n; i++) {
			// j ���� ���
			for (int j = 0; j < n; j++) {
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
	}
}
