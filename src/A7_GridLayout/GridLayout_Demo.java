package A7_GridLayout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayout_Demo {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new GridLayout(3,3,10,5));
		/**
		 * GridLayout(): Sx theo luoi HCN
		 * GridLayout(int rows, int columns):So hang,so cot
		 * GridLayout(int rows, int columns, int hgap, int vgap):hang,cot,Kc cot,Kc hang
		 * 
		 */
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));


		frame.setVisible(true);
	}
}
