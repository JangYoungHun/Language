package Programmers;


//ÇØ°á
public class Number_49993 {

	public static void main(String[] args) {
		
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		
		solution(skill, skill_trees);
	}

	public static int solution(String skill, String[] skill_trees) {
		int answer = 0;


		
		Loop1:
		for(String tree : skill_trees) {
			int n = tree.length();
			int index = 0;
			
			for(int i =0; i<n; i++) {
				if(index >= skill.length())
					break;
				
				String ch = String.valueOf(tree.charAt(i)) ;
				if(skill.contains(ch)) {
					if(skill.indexOf(ch) == index) {
						index++;
					}
					else {
						continue Loop1;
					}
				}
			}
			answer ++;
		}
		return answer;
	}
}
