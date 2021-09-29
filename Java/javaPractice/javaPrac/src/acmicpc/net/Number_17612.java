package acmicpc.net;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.w3c.dom.css.Counter;


//https://www.acmicpc.net/problem/17612     
//해결
public class Number_17612 {

	public static void main(String[] args) {
		
		long result = 0; 
		
		List<Customer> custom = new ArrayList<Customer>();
		List<ArrayList<Customer>> counter = new ArrayList<ArrayList<Customer>>();
		List<Customer> ordinary = new ArrayList<Customer>();	
		int[] time;  // 카운터별 시간
		Scanner sc = new Scanner(System.in);
		
		String[] N_K = sc.nextLine().split(" ");
		int N = Integer.parseInt(N_K[0]);	 // 고객 수
		int K = Integer.parseInt(N_K[1]);    // 계산대 수
		
		
		
		for(int i = 0; i < N; i++)
		{
			String[] str = sc.nextLine().split(" ");					
			custom.add( i, new Customer(str[0], str[1]));					
		}
		
		for(int i = 0; i < K; i++ ) {
			
			counter.add(i, new ArrayList<Customer>() );				
			counter.get(i).add(0,custom.get(0));
			custom.remove(0); 		
		}
		
	
		
		while(true)
		{
			int min =0;		
			int min_ =0;
			int min_index=0;
			time = new int[K];
					
			for(int i =0; i < K ; i++) {
				
				for(int j = 0; j < counter.get(i).size(); j++)
				{
					time[i] += counter.get(i).get(j).product;					
			}				
			
		}
			min_ = time[0];
			
			
			if(custom.size() > 0) {
				
			for(int i =0; i < K ; i++)
			{			
				min = min_;
				min_ = Math.min(min_, time[i]);
				 
				if(min > min_)
					min_index = i;
			
			}
			
	

			
			counter.get(min_index).add(custom.get(0));
			custom.remove(0);
			}
			
			
			
			for(int i = K-1; i >= 0; i-- ) {
			
			if(counter.get(i).size()>0) {
			counter.get(i).get(0).product--;
			
			if(counter.get(i).get(0).product == 0)
			{
				
				ordinary.add(counter.get(i).get(0));
				counter.get(i).remove(0);		
			}	
			
			}
			
			}
			
			if(custom.size() <= 0 ) {
				
				boolean exit = true;
				
				for(int i =0; i < K ; i++) {
					
					exit = exit && (counter.get(i).size() ==0);				
					
				}
			
				
				if(exit == true)
					break;
				
				
			}
			}


		
		for(int i = 1; i <= N ; i++ ) {
			
			result += ordinary.get(i-1).No * i; 		
			
		}
		
		System.out.println(result);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	static class Customer{
		
		int No;
		int product;
		
		Customer(String No , String product){
			
			this.No = Integer.parseInt(No);
			this.product = Integer.parseInt(product);
		}
		
		
		
		
	}
	
	

	
	
}
	
	
	

