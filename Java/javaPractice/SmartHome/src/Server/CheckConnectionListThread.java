package Server;

import java.util.ArrayList;
import java.util.List;

public class CheckConnectionListThread extends Thread {
	
	private static CheckConnectionListThread instance;
	
	private final static int CHECK_INTERVAL = 2000;
	
	List<ArduinoThread> arduinoList;
	List<MobileThread> mobileList;
	boolean close = false;

	private CheckConnectionListThread(List<ArduinoThread> arduinoList,List<MobileThread> mobileList){
		this.arduinoList = arduinoList;
		this.mobileList =mobileList;
	}
	
	static CheckConnectionListThread getInstance(List<ArduinoThread> arduinoList,List<MobileThread> mobileList) {
		if(instance == null) 
			instance = new CheckConnectionListThread(arduinoList, mobileList);
		
		return instance;
	}
	

	void closeThread() {
		this.close = true;
	}
	
	//지정된 시간마다 종료된 client 있는지 확인하여 list 업데이트
	@Override
	public void run() {
		
		while(!close) {
		List<ArduinoThread> aliveArduino = new ArrayList<ArduinoThread>();
		for(int i =0; i<arduinoList.size(); i++) {
			if(arduinoList.get(i).isAlive()) {
				aliveArduino.add(arduinoList.get(i));
			}
		}
		arduinoList = aliveArduino;
		
		
		List<MobileThread> aliveMobile = new ArrayList<MobileThread>();
		for(int i =0; i<mobileList.size(); i++) {
			if(mobileList.get(i).isAlive()) {
				aliveMobile.add(mobileList.get(i));
			}
		}
		mobileList = aliveMobile;
		
		
		try {
			Thread.sleep(CHECK_INTERVAL);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	System.out.println("연결 소켓 List 업데이트");
	}
		
		System.out.println("CheckConnectionListThread 종료 ");
		
	}
}
