package Socket;


import java.io.DataInputStream;

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args)  {
		
		ServerSocket serverSocket= null;
		Socket client = null;
		// input port
		int port = 8888;
		DataInputStream dataInputStream;
		DataOutputStream dataOutputStream;

		try {	
			serverSocket = new ServerSocket(port);
			System.out.println("���� ����� ...");
			client = serverSocket.accept();
			System.out.println("���� ����");
			
			dataInputStream = new DataInputStream(client.getInputStream());
			dataOutputStream = new DataOutputStream(client.getOutputStream());
			
			
			while(client !=null) {
			String readData =dataInputStream.readUTF();
			if(readData.equals("Exit") ||readData.equals("exit") ) {
				dataOutputStream.writeUTF("exit");
				break;
			}
			System.out.print("������ ������ : "+readData);
			dataOutputStream.writeUTF("���� ����");
			

			}
			
			
			serverSocket.close();
			client.close();
			dataInputStream.close();
			dataOutputStream.close();
			
			
		}
		catch (Exception e) {
		}

		
	}
	
	
	
}
