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
				System.out.println("ServerSocket 해제 중 문제 발생");
			}
		}
	}
	
	static void closeSocket(Socket socket) {	
		if(socket != null) {
			try {
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("socket 해제 중 문제 발생");
			}
		}
	}

	static void closeOutStream(DataOutputStream stream) {	
		if(stream != null) {
			try {
				stream.close();

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Outstream 해제 중 문제 발생");
			}
		}
	}
	
	static void closeInputStream(DataInputStream stream) {	
		if(stream != null) {
			try {
				stream.close();

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Inputstream 해제 중 문제 발생");
			}
		}
	}
	
	static void closeThreadPool(ExecutorService threadPool) {	
		if(threadPool != null) {
			try {
				System.out.println("ThreadPool 종료 . . . .");
				threadPool.shutdownNow();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("ThreadPool 해제 중 문제 발생");
			}
		}
	}
}
