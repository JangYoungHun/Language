package Array;

public class Find_Pivot {

	public static void main(String[] args) {
		//�߽� ���� �¿� ���� ������ �Ǵ�
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
