package study;
//이진검색 응용
public class p_117_Q5 {

	public static void main(String[] args) {

		int [] arr = {1,2,3,4,5,6,8,8,8,8,9};
		System.out.print(binSearch(arr, arr.length, 8));
	}
	// 중복 값 있을시 제일 앞 인덱스 반환
	static int binSearch(int[] arr, int n, int key) {
		int head = 0;
		int tail = n-1;
		int middle;
		
		while(head<tail) {
			middle = (head+tail)/2;
			if(arr[middle] == key) {
				for(int i=head; i<= middle; i++) {
					if(arr[i] == key)
						return i;
				}
			}
			
			else if(key > arr[middle]) 
				head = middle+1;
		
			else {
				tail = middle-1;
			}
				
		}		
		return -1;		
	}
	
}
