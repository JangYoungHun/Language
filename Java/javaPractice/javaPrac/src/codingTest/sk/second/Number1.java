package codingTest.sk.second;

import java.util.ArrayList;
import java.util.List;

public class Number1 {

	public static void main(String[] args) {
		solution(new String[] {"pencil", "cilicon", "contrabase", "picturelist"});
	}

	public static String[] solution(String[] goods) {
		String[] answer = new String[goods.length];
		
		List<List<String>> resultList = new ArrayList<>();

		for (int i = 0; i < goods.length; i++) {
			List<String> list = new ArrayList<String>();
			resultList.add(list);
			int minLength = goods[i].length();
			for (int p = 1; p <= goods[i].length(); p++) {
				int cutLength = p;
				
				if(cutLength > minLength)
					break;
				
				for (int j = 0; j <= goods[i].length() - cutLength; j++) {
					String slice = goods[i].substring(j, j + cutLength);

					int containCnt = 1;
					for (int k = 0; k < goods.length; k++) {
						if (i != k) {
							if (goods[k].contains(slice)) {
								containCnt++;
									break;
							}
						}
					}

//					if(containCnt == 1) {
//						if(!list.contains(slice)) {
//							list.add(slice);
//						}						
//						minLength = cutLength;
//					}					
				}
			}
		}
		
		
		for(int i =0; i<resultList.size(); i++) {
			List<String> list = resultList.get(i);
			
			if(list.isEmpty()) {
				answer[i] = "None";
			} else {
				list.sort(null);
				answer[i] = String.join(" ", list);
			}
		}
		
		return answer;
	}
}
