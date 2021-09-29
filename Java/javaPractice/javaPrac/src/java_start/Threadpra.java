package java_start;



public class Threadpra {
	
	

	public static void main(String[] args) {
			
			Thread thread1 = new ThreadDemo();
			
			thread1.start();   
			}

	   
	   
	   
}



class ThreadDemo extends Thread {
	
	@Override
	public void run() {
		for(int i = 0; i<8; i++) {
			System.out.println(Thread.currentThread().getName()+ i);
		}
	} 		
	}
