package C8_JToolBar;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class ToolBar extends JFrame{
	public ToolBar() {
		this.setTitle("ToolBar Demo");
		this.setSize(600,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JToolBar tb = new JToolBar();
		tb.setFloatable(false);//toolbar co dinh 
		JButton button_exit = new JButton("Exit");
		JButton button_save = new JButton("Save");
		JButton button_help = new JButton("Help");
		tb.add(button_exit);
		
		this.add(tb,BorderLayout.NORTH);
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new ToolBar();
	}
}
