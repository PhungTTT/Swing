package C1_ColorChooser;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MyFrame extends JFrame implements ActionListener {
	private JButton button;
	private JButton button2;
	private JLabel label;
	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		button = new JButton("Chon mau chu?");
		button.addActionListener(this);
		button2 = new JButton("Chon mau nen?");
		button2.addActionListener(this);
		
		label = new JLabel("Smile :]");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBackground(Color.white);
		label.setFont(new Font("MV Boli",Font.BOLD,50));
		label.setOpaque(true);
		
		this.add(button,BorderLayout.SOUTH);
		this.add(button2,BorderLayout.NORTH);
		this.add(label,BorderLayout.CENTER);
		this.pack();
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			JColorChooser colorChooser = new JColorChooser();
			Color color = JColorChooser.showDialog(null, "Chon mau nao!", Color.yellow);
			
			label.setForeground(color);//set textLabel
		}else if(e.getSource()==button2) {
			JColorChooser colorChooser = new JColorChooser();
			Color color = JColorChooser.showDialog(null, "Chon mau nao!", Color.yellow);

			label.setBackground(color);
		}
	}
}
