package B8_MenuBar;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame implements ActionListener {
	private JMenuItem saveItem;
	private JMenuItem exitItem;
	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		JMenu helpMenu = new JMenu("Help");
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		saveItem.setMnemonic(KeyEvent.VK_S);
		exitItem.setMnemonic(KeyEvent.VK_E);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);

		this.setJMenuBar(menuBar);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==saveItem) {
			System.out.println("Da luu");
		}
		else if(e.getSource()==exitItem) {
			System.exit(0);//Thoat 
		}
		
	}
	
}
