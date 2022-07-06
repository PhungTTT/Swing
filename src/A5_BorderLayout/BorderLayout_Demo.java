package A5_BorderLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayout_Demo {
	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setSize(500,500);
		jFrame.setLayout(new BorderLayout(10,10));//BorderLayout(10,10):(KC theo Dong-Tay,Bac-Nam) or BorderLayout()
		jFrame.setVisible(true);
		
		JPanel jPanel1 = new JPanel();
		JPanel jPanel2 = new JPanel();
		JPanel jPanel3 = new JPanel();
		JPanel jPanel4 = new JPanel();
		JPanel jPanel5 = new JPanel();
		JPanel jPanel6 = new JPanel();
		JPanel jPanel7 = new JPanel();
		JPanel jPanel8 = new JPanel();
		JPanel jPanel9 = new JPanel();
		
		jPanel1.setBackground(Color.red);
		jPanel2.setBackground(Color.blue);
		jPanel3.setBackground(Color.green);
		jPanel4.setBackground(Color.yellow);
		jPanel5.setBackground(Color.cyan);
		jPanel6.setBackground(Color.YELLOW);
		jPanel7.setBackground(Color.GREEN);
		jPanel8.setBackground(Color.BLUE);
		jPanel9.setBackground(Color.RED);
		
		jPanel1.setPreferredSize(new Dimension(100,100));//??????????????
		jPanel2.setPreferredSize(new Dimension(100,100));
		jPanel3.setPreferredSize(new Dimension(100,100));
		jPanel4.setPreferredSize(new Dimension(100,100));
		jPanel5.setPreferredSize(new Dimension(100,100));
		
		jPanel5.setLayout(new BorderLayout());
		jPanel5.add(jPanel6,BorderLayout.NORTH);
		jPanel5.add(jPanel7,BorderLayout.WEST);
		jPanel5.add(jPanel8,BorderLayout.EAST);
		jPanel5.add(jPanel9,BorderLayout.SOUTH);
		
		jFrame.add(jPanel1,BorderLayout.NORTH);
		jFrame.add(jPanel2,BorderLayout.WEST);
		jFrame.add(jPanel3,BorderLayout.EAST);
		jFrame.add(jPanel4,BorderLayout.SOUTH);
		jFrame.add(jPanel5,BorderLayout.CENTER);

	}
}
