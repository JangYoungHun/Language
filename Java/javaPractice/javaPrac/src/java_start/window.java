package java_start;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class window {

	public static void main(String[] args) {
		
		Color color1 = new Color(171 , 242 , 0);
		
		Frame window = new Frame();
		window.setVisible(true);
		
		window.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e){
				window.dispose();
			}
			
		});
		
		window.setTitle("처음만드는 윈도우 창");
		window.setBackground(color1);
		window.setSize(1000, 500);
		
		
		
		

	}

}
