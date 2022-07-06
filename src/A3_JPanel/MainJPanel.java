package A3_JPanel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainJPanel {//Container
	public MainJPanel() {
		/**
		 * Image Icon
		 */
		ImageIcon icon = new ImageIcon("hello.png");
		/**
		 * JLabel: red,blue,green
		 */
		JLabel jLabel = new JLabel();
		jLabel.setText("Hi! Chao cau...");
		jLabel.setIcon(icon);
		jLabel.setVerticalAlignment(JLabel.TOP);//Note: Vertical(TOP,BOTTOM,CENTER) and Horizontal(LEFT,RIGHT,CENTER)
		jLabel.setBounds(100,0,75,75);//Cha no khong setLayout thi chi dinh vi tri(x,y,width,height)
		
		JPanel red_jPanel = new JPanel();
		red_jPanel.setBackground(Color.red);
		red_jPanel.setBounds(0,0,250,250);//Vi tri cua red_JPanel trong cha cua no
		
		
		JPanel blue_jPanel = new JPanel();
		blue_jPanel.setBackground(Color.blue);
		blue_jPanel.setBounds(250,0,250,250);//Vi tri cua blue_JPanel
	
		
		JPanel green_jPanel = new JPanel();
		green_jPanel.setBackground(Color.green);
		green_jPanel.setBounds(500,0,250,250);//Vi tri cua blue_JPanel
//		green_jPanel.setLayout(new BorderLayout());
		/**
		 * JFrame
		 */
		JFrame jFrame = new JFrame();
		jFrame.setSize(750,600);
		jFrame.setLayout(null);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		green_jPanel.add(jLabel);
		jFrame.add(red_jPanel);
		jFrame.add(blue_jPanel);
		jFrame.add(green_jPanel);
		jFrame.setVisible(true);
	}
	public static void main(String[] args) {
		new MainJPanel();
	}
}
