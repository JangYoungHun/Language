package Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//https://programmers.co.kr/learn/courses/30/lessons/42889
//�ذ�
public class Number_42889 {

	public static void main(String[] args) {
		int N = 4;
		int[] stages = {4,4,4,4,4};
		solution(N, stages);
	}

	public static int[] solution(int N, int[] stages) {
		Map<Integer, Float> map = new HashMap<Integer, Float>();

		int arr[] = new int[N + 2];

		for (int i : stages) {
			arr[i]++;
		}

		for (int i = 1; i <= N; i++) {
			float sum = 0;
			for (int j = i; j <= N + 1; j++) {
				sum += arr[j];
			}
			if (sum == 0)
				map.put(i, 0f);
			else
				map.put(i, arr[i] / sum);
		}

		List<Entry<Integer, Float>> list = new ArrayList<>(map.entrySet());
		
		Collections.sort(list, new Comparator<Entry<Integer, Float>>() {
			@Override
			public int compare(Entry<Integer, Float> o1, Entry<Integer, Float> o2) {
				
				if(o1.getValue() == o2.getValue())
					return o1.getKey().compareTo(o2.getKey());
				
				return o2.getValue().compareTo(o1.getValue());
			}
		});
			
		int answer[] = new int[N];
		
		for(int i =0; i<list.size(); i++) {
			answer[i] = list.get(i).getKey();
		}
		
		return answer;
	}

}
