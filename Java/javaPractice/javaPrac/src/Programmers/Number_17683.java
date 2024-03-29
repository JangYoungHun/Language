package Programmers;

import java.util.stream.Stream;

//https://programmers.co.kr/learn/courses/30/lessons/17683
//�ذ�
public class Number_17683 {

	public static void main(String[] args) {
		String m = "ABC";
		String[] musicinfos = { "00:00,00:06,HI,ABC#ABC" };
		solution(m, musicinfos);
	}

	public static String solution(String m, String[] musicinfos) {
		String answer = "(None)";
		int playTime = -1;
		m = m.replace("A#", "a").replace("B#", "b").replace("C#", "c").replace("D#", "d").replace("E#", "e")
				.replace("F#", "f").replace("G#", "g");
		for (String str : musicinfos) {
			String strs[] = str.split(",");
			strs[3] = strs[3].replace("A#", "a").replace("B#", "b").replace("C#", "c").replace("D#", "d")
					.replace("E#", "e").replace("F#", "f").replace("G#", "g");
			int length = strs[3].length();
			int start[] = Stream.of(strs[0].split(":")).mapToInt(Integer::parseInt).toArray();
			int end[] = Stream.of(strs[1].split(":")).mapToInt(Integer::parseInt).toArray();
			int duration = (end[0] * 60 + end[1]) - (start[0] * 60 + start[1]);

			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < duration / length; j++) {
				sb.append(strs[3]);
			}
			sb.append(strs[3].substring(0, duration % length));

			if (sb.toString().contains(m)) {
				if (playTime < duration) {
					answer = strs[2];
					playTime = duration;				
				}
			}

		}

		return answer;
	}

}
