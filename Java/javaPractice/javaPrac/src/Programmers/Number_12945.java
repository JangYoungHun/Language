package Programmers;



public class Number_12945 {

	public static void main(String[] args) {
		

	}
	
    public int solution(int n) {
        
        int[] nums = new int[100001];

        nums[0] = 0;
        nums[1] = 1;    
      int answer = fibonacci(nums,n)%1234567;
        return answer;
    }
    
    
    public int fibonacci(int[] nums,int n){
        if(n==0)
            return 0;
        else if(nums[n] !=0)
            return nums[n];
 
        return nums[n] = fibonacci(nums,n-1)+fibonacci(nums,n-2);
    }   
    
}
