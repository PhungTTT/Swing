package A1_JFrame;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Test2View extends JFrame{
	Test2View() {
		this.setTitle("Title goes here!");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(400,400);
		this.setVisible(true);
		//Icon
		ImageIcon image = new ImageIcon("hehe.jpg");
		this.setIconImage(image.getImage());
		//Background
		this.getContentPane().setBackground(Color.red);//Color.blue or new Color(225,0,0) or new Color(0XFFFFFF)
	}
	public static void main(String[] args) {
		new Test2View();
	}
}
