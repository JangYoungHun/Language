package Server;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
	
	private static CommandThread commandThread;
	private static ServerSocket serverSocket = null;
	private static Socket client = null;
	private static ExecutorService threadPool;
	
	private static boolean serverClose = false;
	private static int port = 8888;
	//서버 객체 생성 막기
	private Server(){}
	
	public static void main(String[] args) {
		// 인자 :  코어 스레드 갯수,  최대 스레드 개수, 놀고있는시간, 시간 단위, 작업큐 
		threadPool = new ThreadPoolExecutor(3, 5, 2L, TimeUnit.MINUTES, new SynchronousQueue<Runnable>());
		
		//사용자 입력 받는 Thread
		commandThread = new CommandThread();
		commandThread.setDaemon(true);
		threadPool.submit(commandThread);
		
        try {
        	serverSocket = new ServerSocket(port);
         
            while(!serverClose) {  			
    			System.out.println("연결 대기중 ...");
    			client = serverSocket.accept();
    			System.out.println("소켓 연결");
    			
    			InetAddress ia = client.getInetAddress(); 
    			String clientIp = ia.getHostAddress(); 	 // 접속 Client ip
               
        		System.out.println("Client ip : " + clientIp);

        		ClientThread clientThread  = new ClientThread(client);
        		clientThread.setDaemon(true);
        		threadPool.submit(clientThread);       
            }
        } catch(Exception e) {
        	System.out.println("서버 종료");
        } finally {
            try {
            	CloseClass.closeServerSocket(serverSocket);
           
            } catch(Exception e) {
            	e.printStackTrace();
            }
        }
    }
	
	
	static void closeServer() {
		System.out.println("서버 종료 . . . .");
		System.out.println("자원 정리 . . . .");
		CloseClass.closeSocket(client);	
		CloseClass.closeThreadPool(threadPool);
		CloseClass.closeServerSocket(serverSocket);
		serverClose = true; 
	}
	
	}

