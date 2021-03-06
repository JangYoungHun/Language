package study;

import java.util.Arrays;

public class KMP {

	public static void main(String[] args) {
		String parent = "ababacabacaabacaaba";
		String pattern = "abacaaba";
		kmp(parent,pattern);

	}
	
	static int[] makeTable(String pattern){
		
		int[] table = new int[pattern.length()];
		int j=0;
		for(int i =1; i<pattern.length(); i++) {
			while(j>0 && pattern.charAt(i) !=pattern.charAt(j)) {
				j = table[j-1];
			}
			if(pattern.charAt(i) == pattern.charAt(j)) {
				table[i] = ++j;
			}
		}

	return table;
	}
	
	static void kmp(String parent, String pattern) {
		int table[] = makeTable(pattern);
		
		int j=0;
		for(int i =0; i<parent.length(); i++) {
			while(j>0 && parent.charAt(i) != pattern.charAt(j)) {
				j = table[j-1];
			}
			if( parent.charAt(i) == pattern.charAt(j)) {
				if(j == pattern.length()-1) {
					System.out.println((i-pattern.length()+2 )+"번 째에서 찾음");
					j=table[j];
				}
				else {
					j++;
				}
			}
		}
		
	}
	
}
