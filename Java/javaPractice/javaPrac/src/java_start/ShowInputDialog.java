package java_start;


import javax.swing.JOptionPane;

public class ShowInputDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JOptionPane.showMessageDialog(null,"helloworld" , "�ȳ�?", 3);
		
		String str =JOptionPane.showInputDialog("�� �̸���?");
		String str2 = JOptionPane.showInputDialog("�̸��� ���İ�");
		System.out.println(str);
		System.out.println(str2);
		
	}

}
