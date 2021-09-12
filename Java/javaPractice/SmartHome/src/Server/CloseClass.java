package Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;

public class CloseClass {


	static void closeServerSocket(ServerSocket socket) {	
		if(socket != null) {
			try {
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("ServerSocket ���� �� ���� �߻�");
			}
		}
	}
	
	static void closeSocket(Socket socket) {	
		if(socket != null) {
			try {
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("socket ���� �� ���� �߻�");
			}
		}
	}

	static void closeOutStream(DataOutputStream stream) {	
		if(stream != null) {
			try {
				stream.close();

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Outstream ���� �� ���� �߻�");
			}
		}
	}
	
	static void closeInputStream(DataInputStream stream) {	
		if(stream != null) {
			try {
				stream.close();

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Inputstream ���� �� ���� �߻�");
			}
		}
	}
	
	static void closeThreadPool(ExecutorService threadPool) {	
		if(threadPool != null) {
			try {
				System.out.println("ThreadPool ���� . . . .");
				threadPool.shutdownNow();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("ThreadPool ���� �� ���� �߻�");
			}
		}
	}
}
