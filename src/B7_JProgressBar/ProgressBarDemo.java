package B7_JProgressBar;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBarDemo {
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar();
	
	ProgressBarDemo(){
		bar.setValue(0);
		bar.setBounds(0,0,420,50);
		bar.setStringPainted(true);
//		bar.setString("Done"); 
		bar.setFont(new Font("MV Boli",Font.BOLD,15));
		bar.setForeground(Color.green);
		bar.setBackground(Color.black);
		
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
	}
	public void fill() {
		int counter =0;
		while(counter<=100) {
			bar.setValue(counter);//set Gia tri
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		counter+=10;
		}
	}
}
