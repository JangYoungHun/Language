package study;

//배열 선형검색
public class ArraySearch1 {

	public static void main(String[] args) {
		int arr2[] = {1,2,3,4,5,6,7,8,9,0};  //마지막 0 는 보초들어갈 자리 보초법
		int arr[] = {1,2,3,4,5,6,7,8,9};
		//System.out.println(seqSearch2(arr, 2));
		System.out.println(seqSearch3(arr2,9, 10));
	}
	
	//for문
	static int seqSearch1(int[] arr, int key) {
		
		int n = arr.length;
		for(int i =0; i < n; i++) {
			if(key == arr[i])
				return i;	
		} 
		return -1;	
	}
	//while문
	static int seqSearch2(int[] arr, int key) {
		
		int n = arr.length;
		int i =0;
		do {
			if(arr[i] == key)
				return i;
			i++;
		}while(i<n);
		return -1;
	}
	//보초법  배열데이터 마지막에 보초데이터(key 추가)
	static int seqSearch3(int[] arr, int n, int key) { 
		arr[9] = key;

		int i =0;
		do {
			if(arr[i] == key)
				return i;
			i++;
		}while(i<n);
		return i==n?-1:i;
	}
}
