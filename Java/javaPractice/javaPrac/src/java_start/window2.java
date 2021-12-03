package java_start;


import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class window2 {

	public static void main(String[] args) {
		Color color = new Color(171 , 242 , 0);
		
		Window_Class window = new Window_Class();
		window.WindowStart(color, 500, 100);
		
	}

}
