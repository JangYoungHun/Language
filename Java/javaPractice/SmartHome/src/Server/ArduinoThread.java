package Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class ArduinoThread extends Thread {

	Socket client = null;
	// input port
	DataInputStream dataInputStream;
	DataOutputStream dataOutputStream;
	InetAddress ia;
	String clientIp;
	long preTime ;
	long connectionCheckInterval = 5000;
	boolean close = false;

	public ArduinoThread(Socket socket) {
		this.client = socket;
	} 

	void closeThread() {
		this.close = true;
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
	
	String readData() {
		try {
		byte[] buffer = new byte[20];
		dataInputStream.read(buffer);
		String recv = new String(buffer);
		 return recv;
		}
		catch (Exception e) {
			System.out.println(clientIp + "Data Read Exception");
			return "";
		}
	}
	
	void  sendData(String data) throws Exception {
		dataOutputStream.write(data.getBytes());
	}
	
	void checkConnection() throws Exception {
		//System.out.println(clientIp + " : 아두이노 check 전송");
		dataOutputStream.write("ck".getBytes());
		preTime = System.currentTimeMillis();
}


	
	@Override
	public void run() {
		try {
			init();
			
			while (client != null && !close) {			
				if (dataInputStream.available() > 0) {					
					System.out.println(readData());
					preTime = System.currentTimeMillis();
				}		
				else {
				if((System.currentTimeMillis() - preTime) >connectionCheckInterval) {
					try {				
						checkConnection(); 
					}catch (Exception e) {
						
						break;
					}
				}
				}
			}
			
		} catch (Exception e) {
			 
		}
		finally {
			    System.out.println(clientIp +" : 아두이노 소켓 종료");
				CloseClass.closeSocket(client);
				CloseClass.closeInputStream(dataInputStream);
				CloseClass.closeOutStream(dataOutputStream);
		}
	}
}
