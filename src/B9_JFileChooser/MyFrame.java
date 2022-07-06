package B9_JFileChooser;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
	
	private JButton button;
	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("File");
		button.addActionListener(this);
		this.add(button);
		this.pack();
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button) {
			JFileChooser fileChooser = new JFileChooser();
			//Dat vi tri hien thi hop thoai la Desktop
			fileChooser.setCurrentDirectory(new File("C:\\Users\\Trong\\Desktop" ));
			//select file to open
			int response =fileChooser.showOpenDialog(null);
			//Lay dia chi cua file
			if(response == JFileChooser.APPROVE_OPTION) {
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
		
		}
		
	}
	
}
