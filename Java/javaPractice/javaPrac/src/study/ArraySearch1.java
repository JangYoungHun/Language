package study;

//�迭 �����˻�
public class ArraySearch1 {

	public static void main(String[] args) {
		int arr2[] = {1,2,3,4,5,6,7,8,9,0};  //������ 0 �� ���ʵ� �ڸ� ���ʹ�
		int arr[] = {1,2,3,4,5,6,7,8,9};
		//System.out.println(seqSearch2(arr, 2));
		System.out.println(seqSearch3(arr2,9, 10));
	}
	
	//for��
	static int seqSearch1(int[] arr, int key) {
		
		int n = arr.length;
		for(int i =0; i < n; i++) {
			if(key == arr[i])
				return i;	
		} 
		return -1;	
	}
	//while��
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
	//���ʹ�  �迭������ �������� ���ʵ�����(key �߰�)
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
