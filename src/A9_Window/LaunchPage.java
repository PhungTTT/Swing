package A9_Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener{
	JFrame frame = new JFrame();
	JButton myButton = new JButton("New Window");
	
	LaunchPage(){
		myButton.setBounds(100,160,200,40);
		myButton.setFocusable(false);
		myButton.addActionListener(this);
		frame.add(myButton);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==myButton) {
			frame.dispose();//Cham dut khi khong co Window nao khac voi System.exit cham dut toan bo
			NewWindow myWindow = new NewWindow();
		}
	}
}
