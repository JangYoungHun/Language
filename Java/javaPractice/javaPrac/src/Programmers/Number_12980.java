package Programmers;

//�ذ�
public class Number_12980 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int solution(int n) {
		int ans = 0;

		while (n != 0) {

			int left = n % 2;
			// ¦��
			if (left == 0) {
				n /= 2;
			}
			// Ȧ��
			else {
				n = (n - 1) / 2;
				ans++;
			}
		}
		return ans;
	}

}
