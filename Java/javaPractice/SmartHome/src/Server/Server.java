package Server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
	private static boolean serverClose = false;
	private static int port = 8888;
	private static ServerSocket serverSocket = null;
	// ���� ��ü ���� ����
	private Server() {
	}

	public static void main(String[] args) {
		// �Ƶ��̳� ������ ��ٸ���.
		Socket client = null;
		
		CommandThread commandThread;
		CheckConnectionListThread checkConnectionListThread;
		// params :  �ھ���� ��, �ִ� ������ ��, ����ִ½ð�, �ð� ����, �۾� ť
		//ExecutorService factoryThreadPool = new ThreadPoolExecutor(1,3,5L,TimeUnit.MINUTES,new SynchronousQueue<Runnable>());
		// ���� �ִ� 4�� �Ƶ��̳�
		List<ArduinoThread> arduinoList = new ArrayList<ArduinoThread>();
		// ���� �ִ� 4�� �� �����
		List<MobileThread> mobileList = new ArrayList<MobileThread>();
		
		//����� ���� ������� Ȯ�� �� ������Ʈ Thread
		checkConnectionListThread = CheckConnectionListThread.getInstance(arduinoList, mobileList);
		checkConnectionListThread.start();
		//��ɾ� Thread
		commandThread = CommandThread.getInstance();
		commandThread.setDaemon(true);
		commandThread.start();

		try {
			serverSocket = new ServerSocket(port);

			while (!serverClose) {
				// �ִ� ���� ���� 4
				System.out.println("���� ����� ...");
				client = serverSocket.accept();
			//	factoryThreadPool.submit(new FactoryThread(client,arduinoList,mobileList));
				new FactoryThread(client,arduinoList,mobileList).start();
			}

		} catch (Exception e) {			
			
		} finally {
			try {
				checkConnectionListThread.closeThread();
				CloseClass.closeSocket(client);
				CloseClass.closeServerSocket(serverSocket);				
				CloseClass.closeArduinoList(arduinoList);
				CloseClass.closeMobileList(mobileList);
				//CloseClass.closeThreadPool(factoryThreadPool);				
				commandThread.closeThread();			
				System.out.println("���� ����");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}


	static void closeServer() {
		System.out.println("���� ���� . . . .");
		System.out.println("�ڿ� ���� . . . .");
		CloseClass.closeServerSocket(serverSocket);		
		serverClose = true;
	}

}
