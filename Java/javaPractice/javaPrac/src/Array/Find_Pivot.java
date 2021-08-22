package Array;

public class Find_Pivot {

	public static void main(String[] args) {
		//중심 기준 좌우 합이 같은지 판단
		int arr[] = {1,4,2,4,9,2,6,3,24};
	
		int result = find(arr);
		
		System.out.println(result);

	}
	
	static int find(int[] arr) {
		int leftSum =0;
		int rightSum =0;
		
		int preValue = 0;
		
		for(int i =0; i<arr.length; i++) {
			rightSum += arr[i];
		}
		
		for(int p=0; p<arr.length; p++) {
			leftSum += preValue;
			rightSum -= arr[p];
			
			if(leftSum == rightSum)
				return p;
			
			preValue = arr[p];
		}
	
		return -1;
	}

}
