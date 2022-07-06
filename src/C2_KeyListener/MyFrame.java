package C2_KeyListener;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements KeyListener {
	private JLabel label;
	private ImageIcon icon;
	
	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		
		icon = new ImageIcon("bird.png");
		
		label = new JLabel();
		label.setBounds(0,0,100,100);
//		label.setBackground(Color.red);
//		label.setOpaque(true);//hien thi backg
		label.setIcon(icon);
		
		this.getContentPane().setBackground(Color.black);
		this.add(label);
		this.addKeyListener(this);
		this.setVisible(true);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// keyTyped = Invoked when a key id typed
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// keyPressed = Invoked when a physial key is pressed down
		switch(e.getKeyChar()){
		case 'a': label.setLocation(label.getX()-10,label.getY()); 
			break;
		case 'w': label.setLocation(label.getX(),label.getY()-10); 
			break;
		case 's': label.setLocation(label.getX(),label.getY()+10); 
			break;
		case 'd': label.setLocation(label.getX()+10,label.getY()); 
			break;
		}
		//<--^-->
		switch(e.getKeyCode()){
		case 37: label.setLocation(label.getX()-10,label.getY()); 
			break;
		case 38: label.setLocation(label.getX(),label.getY()-10); 
			break;
		case 40: label.setLocation(label.getX(),label.getY()+10); 
			break;
		case 39: label.setLocation(label.getX()+10,label.getY()); 
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// keyReleased = called whenever a button is released
		System.out.println("You released key char: "+e.getKeyChar());
		System.out.println("You released key code: "+e.getKeyCode());
	}
	public static void main(String[] args) {
		new MyFrame();
	}

}
