package Array;

public class BinarySearch {
	public static void main(String[] args) {
		
		//정렬 되어있는 상황에서 가능
		int[] arr = {1,2,5,7,8,9};
		int index = search(arr,5);
		System.out.println("찾으려는 값 위치 " + index);
		
	}

	static int search(int arr[], int num) {
		int right = arr.length-1;
		int left = 0;
		int pivot = 0;
		
		while(left <= right){
			pivot = (left+right)/2;
			
			if(arr[pivot] == num) {
				return pivot;
			}
			else if(arr[pivot] > num) {
				right = pivot-1;
			}
			else {
				left = pivot+1;
			}
		}
		
		return -1;
		
	}
	
		
}
