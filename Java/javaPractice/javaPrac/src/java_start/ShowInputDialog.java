package java_start;


import javax.swing.JOptionPane;

public class ShowInputDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JOptionPane.showMessageDialog(null,"helloworld" , "안녕?", 3);
		
		String str =JOptionPane.showInputDialog("너 이름은?");
		String str2 = JOptionPane.showInputDialog("이름이 뭐냐고");
		System.out.println(str);
		System.out.println(str2);
		
	}

}
