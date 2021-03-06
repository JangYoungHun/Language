package Programmers;

import java.util.ArrayList;
//https://programmers.co.kr/learn/courses/30/lessons/12977
// 해결
public class Number_12977 {

	static int result =0;
	
	public static void main(String[] args) {
		int nums[] = {1,2,3,4,5,6};
		System.out.println(solution(nums));
	}
	
    public static int solution(int[] nums) {
    	// true : 소수가아님  false:소수
    	boolean[] arr = new boolean[3001];
    	int n =3001;   	
    	
    	for(int i =2; i<n; i++) {
    		for(int j=2; i*j<n; j++) {
    			arr[i*j] = true;
    		}
    	}
    	dfs(new ArrayList<Integer>(), nums, arr, 3,0, 0);
        return result;
    }
	
   static void dfs(ArrayList<Integer> list, int nums[], boolean arr[], int n, int start, int cnt) {

    	if(cnt == n) {
    		int sum = list.stream().map(k->nums[k]).mapToInt(k->k).sum();
    		if(!arr[sum]) {
    			result++;
    		}
    		return;
    	}

    	for(int i =start; i<nums.length; i++) {
    			list.add(i);
    			dfs(list, nums, arr, n, i+1, cnt+1);
    			list.remove(list.size()-1);
    	}
    	
    }

}
