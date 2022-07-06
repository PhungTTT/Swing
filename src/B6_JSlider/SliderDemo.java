package B6_JSlider;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDemo implements ChangeListener {
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	public SliderDemo() {
		frame = new  JFrame("Slider Demo");
		panel = new JPanel();
		label = new JLabel();
		/**
		 * Slider
		 */
		slider = new JSlider(0,100,50);
		slider.setPreferredSize(new Dimension(400,200));
		
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);//Chia ra lam 10 doan
		
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(10);
		//setPaintLabels
		slider.setPaintLabels(true);
		//setFont
		slider.setFont(new Font("MV Boli",Font.BOLD,10));
	
		slider.setOrientation(SwingConstants.HORIZONTAL);//Ngang
		//slider.setOrientation(SwingConstants.VERTICAL);//Doc
		
		label.setText("*C = "+slider.getValue());
		slider.addChangeListener(this);
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		label.setText("*C = "+slider.getValue());
		
	}
	
}
