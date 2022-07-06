package A4_JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyJFrame extends JFrame implements ActionListener{
	private JButton jButton;
	private JLabel jLabel;
	public MyJFrame() {
		//Image Icon
		ImageIcon icon = new ImageIcon("hello.png");
		ImageIcon icon2 = new ImageIcon("hehe.png");
		
		//label hien thi xu kien 
		jLabel = new JLabel();
		jLabel.setIcon(icon2);
		jLabel.setBounds(140,100, 250,400);
		jLabel.setVisible(false);
		//JButton
		jButton = new JButton("I'm Button");
		jButton.setBounds(150,100,200,100);
		jButton.addActionListener(this);//this or (e-> System.out.println("Halo");)
		jButton.setFocusable(false);//Lam mat duong vien quanh text(I'm Button) khi false
		jButton.setIcon(icon);
		jButton.setHorizontalTextPosition(JButton.CENTER);//vi tri icon trong JButton
		jButton.setVerticalTextPosition(JButton.BOTTOM);//vi tri cua text trong JButton
		jButton.setFont(new Font("Comic Sans", Font.BOLD, 15));//set Font chu cho text
		jButton.setIconTextGap(-5);//Di chuyen icon len xuong: Trong Button +tren -xuong
		jButton.setForeground(Color.orange);//set mau chu cho text
		jButton.setBackground(Color.black);//set Backgroud cho button
		jButton.setBorder(BorderFactory.createEtchedBorder());//Tat vien khi nhan vao Button
//		jButton.setEnabled(false);//Tat mau chu va lam icon mat mau
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.add(jButton);
		this.add(jLabel);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jButton) {
			System.out.println("Smile");
			jButton.setEnabled(false);//Tat mau chu va lam icon mat mau khi false
			jLabel.setVisible(true);
		}
		
	}
}
