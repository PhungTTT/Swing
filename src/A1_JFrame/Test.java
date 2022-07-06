package A1_JFrame;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test {
	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		/**
		 * Method:
		 * setTitle, setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE),
		 * setResizable(false), setSize, setVisible(true)
		 * setIconImage,
		 */
		jFrame.setTitle("Title goes here!");//Tieu de
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Dong se tat chuong trinh
		jFrame.setResizable(false);//Khong keo cua so khi false
		jFrame.setSize(400,400);//Size
		jFrame.setVisible(true);//Hien thi
		//Icon
		ImageIcon image = new ImageIcon("hehe.jpg");
		jFrame.setIconImage(image.getImage());
		//Background
		jFrame.getContentPane().setBackground(new Color(0x123456));//Color.blue or new Color(225,0,0) or new Color(0XFFFFFF)
	}
}
