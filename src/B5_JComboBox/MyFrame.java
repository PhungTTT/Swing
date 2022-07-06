package B5_JComboBox;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	private JComboBox comboBox;

	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		String[] animals = {"dog","cat","bird"};//String,Integer,Double,..
		comboBox = new JComboBox(animals);
		comboBox.addActionListener(this);
//		comboBox.setEditable(true);  Cho phep dien vao 
//		System.out.println(comboBox.getItemCount());   So phan tu cua comboBox
		comboBox.addItem("horse");//Them phan tu tiep theo
		comboBox.insertItemAt("tiger", 0);//Them phan tu vao vi tri chi dinh
		comboBox.setSelectedIndex(0); //Vi tri hien thi mac dinh
//		comboBox.removeItem("cat"); //Xoa phan tu trong comboBox
//		comboBox.removeAllItems(); //Xoa all 
		this.add(comboBox);
		this.setSize(200,200);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==comboBox) {
//			System.out.println(comboBox.getSelectedItem());//Tra ve gia tri
			System.out.println(comboBox.getSelectedIndex());//Tra ve vi tri theo so 0,1,...
		}
		
	}
}
