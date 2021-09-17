package Socket;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Client1 {

	public static void main(String[] args) {
		DataInputStream dataInputStream;
		DataOutputStream dataOutputStream;
		Socket serverSocket = null;
		// input ip address
		String address = "mrjangsserver.ddns.net" ;
		// input port
		int port = 8888;

		try {	
			System.out.println("접속 시도 ....");
			serverSocket = new Socket(address,port);
			System.out.println("접속 성공");
			dataInputStream = new DataInputStream(serverSocket .getInputStream());
			dataOutputStream = new DataOutputStream(serverSocket .getOutputStream());
			
			String sendData = "Test Data";
			dataOutputStream.writeUTF(sendData);
			System.out.println("데이터 전송 : "+ sendData);
			String readData =dataInputStream.readUTF();
			System.out.println("전송 결과 : "+readData);
				

			serverSocket.close();
			dataInputStream.close();
			dataOutputStream.close();
			}
		
			catch (Exception e) {
				e.printStackTrace();
				System.out.println("서버 상태 확인");
			}

	}

	}


