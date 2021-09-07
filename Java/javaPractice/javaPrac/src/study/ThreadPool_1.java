package study;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool_1 {

	public static void main(String[] args) {
	//	ExecutorService threadPool1 = Executors.newCachedThreadPool();
		ExecutorService threadPool2 = Executors.newFixedThreadPool(2);
		
		Runnable r1 = () -> {		
			System.out.println(Thread.currentThread().getName() + " :  r1");
		};
		Runnable r2 = () -> {		
			System.out.println(Thread.currentThread().getName() + " :  r2");
		};
		Runnable r3 = () -> {		
			System.out.println(Thread.currentThread().getName() + " :  r3");
		};
		Runnable r4 = () -> {		
			System.out.println(Thread.currentThread().getName() + " :  r4");
		};
		
		/*
		 * threadPool1.submit(r1); threadPool1.submit(r2); threadPool1.submit(r3);
		 * threadPool1.submit(r4);
		 */
		
		threadPool2.submit(r1);
		threadPool2.submit(r2);
		threadPool2.submit(r3);
		threadPool2.submit(r4);
	
		
		//threadPool1.shutdown();
		threadPool2.shutdown();
	}
	
	
}
