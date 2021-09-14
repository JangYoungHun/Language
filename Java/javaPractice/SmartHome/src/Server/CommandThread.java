package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandThread extends Thread {
	
	private static CommandThread instance;
	private boolean close = false;
	
	private CommandThread() {
	}
	
	void closeThread() {
		close = true;
	}
	
	static CommandThread getInstance() {
		if(instance ==null)
			return instance = new CommandThread();
		return instance;
	}
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


	@Override
	public void run() {

			try {
				while (!close) {
				String command = br.readLine();
				if(command != null && !command.equals("")) {
				switch (command) {
				// 서버 종료
				case "closeServer": 
				case "exit" :
				case "close": {
					close = true;
					Server.closeServer();				
				}
					break;			
					default : System.out.println("잘못된 명령어 입니다.");
				}
				}
			}				
					
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Command Thread ERROR 발생");
			}
			finally {
				CloseClass.closeBufferedreader(br);
				System.out.println("command Thread 종료");
			}

	}
}
