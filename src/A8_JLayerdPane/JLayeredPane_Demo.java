package A8_JLayerdPane;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class JLayeredPane_Demo {
	public static void main(String[] args) {
		JLabel label1 =new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.red);
		label1.setBounds(50,50,200,200);
		
		JLabel label2 =new JLabel();
		label2.setOpaque(true);	
		label2.setBackground(Color.blue);
		label2.setBounds(100,100,200,200);
		
		JLabel label3 =new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.green);
		label3.setBounds(150,150,200,200);
		/**
		 * JLayeredPane:Cac Final:DEFAULT_LAYER,DRAG_LAYER,...????
		 */
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0,0,500,500);
		layeredPane.add(label1,JLayeredPane.DEFAULT_LAYER);//Co the uu tien thu tu = Integer.valueOf(2)
		layeredPane.add(label2,JLayeredPane.DEFAULT_LAYER);//Co the uu tien thu tu = Integer.valueOf(3)
		layeredPane.add(label3,JLayeredPane.DRAG_LAYER);//Co the uu tien thu tu = Integer.valueOf(1)
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500,500));
		frame.setLayout(null);
		frame.add(layeredPane);		
		
		frame.setVisible(true);
	}
}
