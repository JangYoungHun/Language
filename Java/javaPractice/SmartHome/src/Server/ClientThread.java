package Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

class ClientThread extends Thread {
	
	Socket client = null;
	// input port
	DataInputStream dataInputStream;
	DataOutputStream dataOutputStream;
	InetAddress ia;
	String clientIp;
	long preTime ;
	long connectionCheckInterval = 5000;
	public ClientThread(Socket socket) {
		this.client = socket;
	} 
	
	void init() {
		try {		
			ia = client.getInetAddress(); 
			clientIp = ia.getHostAddress(); 
			dataInputStream = new DataInputStream(client.getInputStream());
			dataOutputStream = new DataOutputStream(client.getOutputStream());
			preTime =  System.currentTimeMillis();
		} catch (Exception e) {
		}
	}
	
	@Override
	public void run() {
		try {
			init();
			
			while (client != null) {
				
				if (dataInputStream.available() > 0) {					
					byte[] buffer = new byte[20];
					dataInputStream.read(buffer);
					 String recv = new String(buffer);
					 if(!recv.equals("check"))
						System.out.println(new String(buffer));
					// byte readData =dataInputStream.readByte();
					// System.out.print((char)(readData));	
					 preTime = System.currentTimeMillis() ;
				}
				else {
				if((System.currentTimeMillis() - preTime) >connectionCheckInterval) {
					try {
						dataOutputStream.write("check".getBytes());
						preTime = System.currentTimeMillis() ;
					}catch (Exception e) {
						System.out.println(clientIp + " : 소켓 종료");
						break;
					}
				}
				}
			}
		} catch (Exception e) {
			System.out.println(clientIp +" Thread 종료");
		}
		finally {
				CloseClass.closeSocket(client);
				CloseClass.closeInputStream(dataInputStream);
				CloseClass.closeOutStream(dataOutputStream);
		}
	}

}