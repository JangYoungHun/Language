package Programmers;

import java.util.LinkedList;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/17680
//ÇØ°á
public class Number_17680 {

	public static void main(String[] args) {
		String str[] = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
		System.out.println(solution(0, str));
	}

	public static int solution(int cacheSize, String[] cities) {
		int answer = 0;
		
		List<String> list = new LinkedList<String>();
		
		if(cacheSize == 0) {
			return 5*cities.length;
		}
		
		for (String str : cities) {
			str = str.toLowerCase();
			if (!list.contains(str)) {
				if (list.size() >= cacheSize) {
					list.remove(0);
				}
				list.add(str);
				answer += 5;
			}
			else {
				list.remove(str);
				list.add(str);
				answer += 1;
			}
		}

		return answer;
	}
}
