package B4_RadioButton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener{
	private JRadioButton meoButton;
	private JRadioButton choButton;
	private JRadioButton hoButton;
	

	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new FlowLayout());
		/**
		 * RadioButton
		 */
		choButton = new JRadioButton("Cho");
		choButton.addActionListener(this);
		meoButton = new JRadioButton("Meo");
		meoButton.addActionListener(this);
		hoButton = new JRadioButton("Ho");
		hoButton.addActionListener(this);
		//Cho cac RadioButton vao 1 group thi lua chon chi co 1
		ButtonGroup group = new ButtonGroup();
		group.add(choButton);
		group.add(meoButton);
		group.add(hoButton);

		this.add(choButton);
		this.add(meoButton);
		this.add(hoButton);
		
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==choButton) {
			System.out.println("GauGau");
		}else if(e.getSource()==meoButton) {
			System.out.println("MeoMeo");
		}else if(e.getSource()==hoButton) {
			System.out.println("WaiWai");
			
		}
		
	}
}
