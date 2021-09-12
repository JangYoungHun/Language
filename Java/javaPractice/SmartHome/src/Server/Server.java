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
	//���� ��ü ���� ����
	private Server(){}
	
	public static void main(String[] args) {
		// ���� :  �ھ� ������ ����,  �ִ� ������ ����, ����ִ½ð�, �ð� ����, �۾�ť 
		threadPool = new ThreadPoolExecutor(3, 5, 2L, TimeUnit.MINUTES, new SynchronousQueue<Runnable>());
		
		//����� �Է� �޴� Thread
		commandThread = new CommandThread();
		commandThread.setDaemon(true);
		threadPool.submit(commandThread);
		
        try {
        	serverSocket = new ServerSocket(port);
         
            while(!serverClose) {  			
    			System.out.println("���� ����� ...");
    			client = serverSocket.accept();
    			System.out.println("���� ����");
    			
    			InetAddress ia = client.getInetAddress(); 
    			String clientIp = ia.getHostAddress(); 	 // ���� Client ip
               
        		System.out.println("Client ip : " + clientIp);

        		ClientThread clientThread  = new ClientThread(client);
        		clientThread.setDaemon(true);
        		threadPool.submit(clientThread);       
            }
        } catch(Exception e) {
        	System.out.println("���� ����");
        } finally {
            try {
            	CloseClass.closeServerSocket(serverSocket);
           
            } catch(Exception e) {
            	e.printStackTrace();
            }
        }
    }
	
	
	static void closeServer() {
		System.out.println("���� ���� . . . .");
		System.out.println("�ڿ� ���� . . . .");
		CloseClass.closeSocket(client);	
		CloseClass.closeThreadPool(threadPool);
		CloseClass.closeServerSocket(serverSocket);
		serverClose = true; 
	}
	
	}

