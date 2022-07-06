package A6_FlowLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayout_Demo {
	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setSize(500,500);
		/**
		 * FlowLayout://Hang ngang, het hang thi xuong hang
		 * FlowLayout();
		 * FlowLayout(FlowLayout.CENTER);//Giong mac dinh
		 * FlowLayout.CENTER,0,10):ex 0 la KC cac TP con, 10 KC le 2 ben
		 * FlowLayout(FlowLayout.TRAILING):Goc ben phai
		 * FlowLayout(FlowLayout.LEADING):Goc ben trai
		 * ...LEFT,RIGHT
		 * 
		 */
		jFrame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));//ex 0 la KC cac TP con, 10 KC le 2 ben
		
		//
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(150,200));//(chieu dai x, chieu rong y) cua panel
		panel.setBackground(Color.lightGray);
		panel.setLayout(new FlowLayout());
		
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		
		jFrame.add(new JButton("1"));
		jFrame.add(new JButton("2"));
		jFrame.add(new JButton("3"));
		jFrame.add(new JButton("4"));
		jFrame.add(new JButton("5"));
		jFrame.add(new JButton("6"));
		jFrame.add(new JButton("7"));
		jFrame.add(new JButton("8"));
		jFrame.add(new JButton("9"));
		
		jFrame.add(panel);
		jFrame.setVisible(true);
		
	}
}
