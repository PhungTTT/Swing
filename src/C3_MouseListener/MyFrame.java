package C3_MouseListener;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener {
	private JLabel label;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		
		label = new JLabel();
		label.setBounds(0,0,100,100);
		label.setBackground(Color.gray);
		label.setOpaque(true);
		
		this.addMouseListener(this);
		this.add(label);
		this.setLayout(null);
		this.setVisible(true);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// Nhan va nha
		System.out.println("mouseClicked");
		label.setBackground(Color.green);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Nhan chuot
		System.out.println("Pressed");
		label.setBackground(Color.red);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Nha nut chuot
		System.out.println("Released");
		

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Vao 1 thanh phan
		label.setBackground(Color.green);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Ra 1 thanh phan
		System.out.println("Exited");
		label.setBackground(Color.blue);
	}
	/**
	 * Test
	 */
	public static void main(String[] args) {
		new MyFrame();
	}
}
