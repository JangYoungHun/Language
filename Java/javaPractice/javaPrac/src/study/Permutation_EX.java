package study;
//https://www.youtube.com/watch?v=CDLBg6wbhUQ
//가장 큰 두자리수   결과 43
public class Permutation_EX {

	static int N = 4;          //  입력받는 값
	static int[] nums = {1,2,3,4};  //  입력받는 값
	//가장 큰 두자리수   결과 43
	
	
	static int solution(int count, int used, int value ) {
		
		if(count == 2 ) return value;
		
		int ret = 0;
		for(int i =0; i < N; i++) {
			if((used & 1 << i)  !=0) continue;
			
			ret = Math.max(ret, solution(count+1, used | 1 << i , value*10 + nums[i]));			
		}
		
		
		return ret;
	}
	
	
	
	public static void main(String[] args) { 
		
		System.out.println(solution(0, 0, 0 ));
	}

}
