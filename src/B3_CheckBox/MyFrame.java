package B3_CheckBox;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	
	private JButton button;
	private JCheckBox checkBox;
	private ImageIcon checkIcon;
	private ImageIcon xIcon;

	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		//two Icon
		xIcon =new ImageIcon(Toolkit.getDefaultToolkit().createImage(Main.class.getResource("no.png")));
		checkIcon =new ImageIcon(Toolkit.getDefaultToolkit().createImage(Main.class.getResource("yes.png")));
		//button
		button = new JButton("Check CheckBox?:");
		button.addActionListener(this);
		//checkBox
		checkBox = new JCheckBox();
		checkBox.setText("Ban ko phai robot?");
		checkBox.setFocusable(false);//Tat vien khi nhan vao checkBox
		checkBox.setFont(new Font("Consolas", Font.ITALIC,15));
		checkBox.setIcon(xIcon);
		checkBox.setSelectedIcon(checkIcon);//Thay doi icon khi chon
		
		this.add(button);
		this.add(checkBox);
		
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button) {
			System.out.println(checkBox.isSelected());
		}
	}
	
}
