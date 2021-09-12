package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandThread extends Thread {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	boolean closeServer = false;

	@Override
	public void run() {

			try {
				while (!closeServer) {
				String command = br.readLine();
				if(command != null && !command.equals("")) {
				switch (command) {
				// ���� ����
				case "closeServer": 
				case "exit" :
				case "close": {
					closeServer = true;
					Server.closeServer();				
				}
					break;			
					default : System.out.println("�߸��� ��ɾ� �Դϴ�.");
				}
				}
			}				
				br.close();
				System.out.println("command Thread ����");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("command ���� �߻�");
			}


	}
}
