package B2_TextField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	
	private JButton button;
	private JTextField textField;

	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		//button
		button = new JButton("Submit:");
		button.addActionListener(this);
		//textField
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250,40));
		textField.setFont(new Font("Arial",Font.PLAIN, 30));
		textField.setForeground(Color.green);
		textField.setBackground(Color.black);
		textField.setText("username");
		textField.setEditable(false);//Khoa nhap vao khi false

		this.add(button);
		this.add(textField);
		
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println("Welcome "+textField.getText());
		}
	}
	
}
