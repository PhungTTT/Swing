package B1_JOptionPane;

import java.awt.TrayIcon.MessageType;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		/**
		 * JOptionPane: goi 1 hop thoai dialog cho mot gia tri hoac thong bao nguoi dung ve mot cai gi ðo
		 */
		
		//Method: showMessageDialog(null,Text,Title,ImageIcon)
		JOptionPane.showMessageDialog(null, "this is some useless info","Title",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "Thong tin","Title",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Cau Hoi","Title",JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Canh bao! Pc co VIRUS","Title",JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Error!!!","Title",JOptionPane.ERROR_MESSAGE);
		
		//Method: showConfirmDialog
		JOptionPane.showConfirmDialog(null, "bro, do you even code?", "Title",JOptionPane.YES_NO_CANCEL_OPTION);//Tra ve gia tri -1 0 1
		
		//Method: showInputDialog
		String name = JOptionPane.showInputDialog("What is your name?: ");
		System.out.println("Hello "+ name);
		
		//Method: showOptionDialog
		String[] responses = {"No","Yes"};
		ImageIcon icon = new ImageIcon("hehe.png");
		JOptionPane.showOptionDialog(
				null,
				"Help me!",
				"Title",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE,
				icon,
				responses,
				0);
	}
}
