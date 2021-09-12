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
				// 서버 종료
				case "closeServer": 
				case "exit" :
				case "close": {
					closeServer = true;
					Server.closeServer();				
				}
					break;			
					default : System.out.println("잘못된 명령어 입니다.");
				}
				}
			}				
				br.close();
				System.out.println("command Thread 종료");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("command 에러 발생");
			}


	}
}
