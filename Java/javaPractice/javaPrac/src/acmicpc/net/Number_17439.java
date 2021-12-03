package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


//https://www.acmicpc.net/problem/17439
public class Number_17439 {
	
	static int count=0;
	static int N, K;
	static int[] permArr;
	static String[] nums;
	static String nums_;
	static int result =0;

	public static void main(String[] args) throws IOException {
		
		long start = System.currentTimeMillis();

		int[] arr;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	//	Scanner sc = new Scanner(System.in);
		
		String nk = br.readLine();
	//	String nk = sc.nextLine();
		
	//	String[] nk_ = nk.split(" ");
		
		N = Integer.parseInt(nk.split(" ")[0]);
		K = Integer.parseInt(nk.split(" ")[1]);
		
		String strs = br.readLine();	
	//	String strs = sc.nextLine();
		
		br.close();
		
		nums = strs.split(" ");		
		nums_ = strs .replace(" ", "");
		arr = new int[N-1];
		
		permArr = new int[K+1];
		permArr[K] = N;
		permArr[0] = 0;
		
		
		for(int i =1; i <= N-1; i++) {		
			arr[i-1] = i;							
		}

	
		int sum = 0;
		
		for(int i =0; i < N; i++) {
			
			int num = Integer.parseInt(nums[i]);
			sum += num;
		}
		
		result = sum * N;
	//	System.out.println(result);
		perm(arr, N , K, 0 , 0);

		//System.out.println(result);
	 bw.write(String.valueOf(result));
	
		
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
		
		bw.close();
		}

	// nCk 
	static void perm(int[] arr, int n, int k, int index, int r) 
	{	//r 뽑은 개수

		if(k == 1) {
      		return;
		}
		
		else if(r+1 == k) {
		
	//		System.out.println(Arrays.toString(permArr));
			count ++;
			calc(permArr);
		
		}
		
		else if(index == n-1) {
			// 끝까지 돌았는데 k개보다 적게 뽑음
			return;
		}
		
		else {
		// arr [index] 뽑음
		 permArr[r+1] = arr[index];			
		 perm(arr, N , K, index+1 , r+1);
		
		 
		// arr [index] 안뽑음		 
		 perm(arr, N , K, index+1 , r);					
		}
	}
	
	

	static void calc(int[] permArr) {
		
	
	
		int result_=0;
		int sum = 0;
		int sum_ = 0;
			
		for(int i =0; i < K; i++) {	
			
			String str = nums_.substring(permArr[i],permArr[i+1]);
			
	//		System.out.println("자름" +str);
		
		
			for(int j =0; j < str.length(); j++ ) {
				
				
	//			System.out.println(str.substring(j, j+1));
				
				int num = Integer.parseInt(str.substring(j, j+1));
				sum_ += num;
							
			}
			
			sum += sum_ * str.length();			
	//		System.out.println("합 : " + sum );
			sum_ =0;
		
		}
		result_ = sum;	
	//	System.out.println("총 합 : " + result_ );
		
		result = Math.min(result,result_);	
	
	
		}
	}

	


