package Programmers;
//https://programmers.co.kr/learn/courses/30/lessons/77884
//ÇØ°á
public class Number_77884 {

	public static void main(String[] args) {

		System.out.println(solution(24, 27));
	}

	public static int solution(int left, int right) {
		int answer = 0;
		int num = 1;

		for (int i = left; i <= right; i++) {
			int _left = i;
			int _right = right;
			int k = 1;
			for (int j = 2; j <= i; j++) {
				int n = 0;
				while (_left % j == 0) {
					_left /= j;
					n++;
				}
				k *= n + 1;
			}

			if (k % 2 == 0)
				answer += i;
			else
				answer -= i;
		}

		return answer;
	}

}
