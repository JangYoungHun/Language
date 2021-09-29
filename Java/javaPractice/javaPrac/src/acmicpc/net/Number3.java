package acmicpc.net;
//    https://www.youtube.com/watch?v=ExaatgwYqfU&t=304s
public class Number3 {

	public static void main(String[] args) {
	
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		String[] result = new String[n]; 

		for(int i =0; i<n; i++) {
			
			int arr = arr1[i] | arr2[i];
			String str;
			str = Integer.toBinaryString(arr);
			result[i] = str.replace("1", "#");
			result[i] = result[i].replace("0", " ");
		

		
		System.out.println(result[i]);
		
		
		
		}
		
		
		
	}

}
