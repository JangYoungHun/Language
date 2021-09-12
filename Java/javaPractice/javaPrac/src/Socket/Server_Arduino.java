package Socket;

import java.io.DataInputStream;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Time;

public class Server_Arduino {
	
	
	public static void main(String[] args) {
		int port = 8888;
		ServerSocket serverSocket = null;
		Socket client = null;
		
        try {
        	serverSocket = new ServerSocket(port);
         
            while(true) {  			
    			System.out.println("연결 대기중 ...");
    			client = serverSocket.accept();
    			System.out.println("소켓 연결");
    			
    			InetAddress ia = client.getInetAddress(); 
    			String clientIp = ia.getHostAddress(); 	 // 접속 Client ip
               
        		System.out.println("Client ip : " + clientIp);

    			ServerThread serverThread = new ServerThread(client);
    			serverThread.start();          
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try {
                serverSocket.close();
            } catch(Exception e) {
            	e.printStackTrace();
            }
        }
    }
	}

class ServerThread extends Thread {
	
	Socket client = null;
	// input port
	DataInputStream dataInputStream;
	DataOutputStream dataOutputStream;
	InetAddress ia;
	String clientIp;
	long preTime ;
	long connectionCheckInterval = 5000;
	public ServerThread(Socket socket) {
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
				
				if (dataInputStream.available() > 1) {					
					byte[] buffer = new byte[dataInputStream.available()];
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

			client.close();
			dataInputStream.close();
			dataOutputStream.close();

		} catch (Exception e) {
			
		}
		finally {
			try {
				System.out.println("Thread 자원 정리");
				client.close();
				dataInputStream.close();
				dataOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
	}

}
