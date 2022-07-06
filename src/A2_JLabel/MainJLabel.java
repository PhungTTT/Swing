package A2_JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MainJLabel {
	public static void main(String[] args) {
		ImageIcon image_Label = new ImageIcon("hehe.png");
		Border border = BorderFactory.createLineBorder(Color.green);
		//JLable
		JLabel jLabel = new JLabel();//create a label
		jLabel.setText("Smile! ");//1. set text of label
		jLabel.setIcon(image_Label);//2. set Icon of label
		jLabel.setHorizontalTextPosition(JLabel.CENTER);//set text LEFT,CENTER,RIGHT of imageIcon
		jLabel.setVerticalTextPosition(JLabel.BOTTOM);//set text TOP,CENTER,BOTTOM of imageIcon
		jLabel.setForeground(Color.yellow);//set font Color of TEXT
		jLabel.setFont(new Font("MV Boli",Font.BOLD,50));////set font of TEXT
		jLabel.setIconTextGap(-25);//set gap of text to Image
		jLabel.setBackground(Color.black);//3. set backgroud color
		jLabel.setOpaque(true);//display backgroud color
		jLabel.setBorder(border);//set Border (Vien cua jLabel)
		jLabel.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon+text within label(len)
		jLabel.setHorizontalAlignment(JLabel.CENTER);//set Horizontal position of icon+text within label(len);
		jLabel.setBounds(300,300,250,250);
		//JFrame
		JFrame jFrame = new JFrame();
//		jFrame.setLayout(null);
		jFrame.setTitle("Title goes here!");//Tieu de
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Dong se tat chuong trinh
//		jFrame.setResizable(false);//Khong keo cua so khi false
		jFrame.setSize(400,400);//Size
		jFrame.setLayout(new BorderLayout());
	

		//Icon:luu o project
		ImageIcon image = new ImageIcon("hehe.png");
		jFrame.setIconImage(image.getImage());
		
		//Background
		jFrame.getContentPane().setBackground(Color.white);//Color.blue or new Color(225,0,0) or new Color(0XFFFFFF)
		//add Label
		jFrame.add(jLabel);
		
		jFrame.pack();
		jFrame.setVisible(true);
	}
}

