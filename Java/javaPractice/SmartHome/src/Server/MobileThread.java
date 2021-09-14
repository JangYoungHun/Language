package Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

class MobileThread extends Thread {
	

	Socket client = null;
	// input port
	DataInputStream dataInputStream;
	DataOutputStream dataOutputStream;
	InetAddress ia;
	String clientIp;
	long preTime ;
	long connectionCheckInterval = 3000;
	boolean close = false;

	public MobileThread (Socket socket) {
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
		 preTime = System.currentTimeMillis() ;
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
				System.out.println(clientIp +" Smartphone 소켓 종료");
				CloseClass.closeSocket(client);
				CloseClass.closeInputStream(dataInputStream);
				CloseClass.closeOutStream(dataOutputStream);
		}
	}

}