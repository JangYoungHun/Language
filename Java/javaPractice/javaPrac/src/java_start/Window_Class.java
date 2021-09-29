package java_start;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Window_Class {

	public void WindowStart(Color color, int width , int height) {

		
	Frame window = new Frame();
	
	window.setVisible(true);
	
	window.addWindowListener(new WindowAdapter() {
		
		public void windowClosing(WindowEvent e) {
				window.dispose();
		}			
	});
	
	window.setSize(width, height);
	window.setTitle("두 번쨰 윈도우 창");
	window.setBackground(color);
	}
	
}
