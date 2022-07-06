package C4_Drag_Drop;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import org.w3c.dom.events.MouseEvent;

public class DragPanel extends JPanel{
	ImageIcon image = new ImageIcon("hehe.png");
	final int WIDH = image.getIconWidth();
	final int HEIGH = image.getIconHeight();
	Point imageCorner;
	Point prevPt;
	
	
	DragPanel(){
		imageCorner = new Point(0,0);
		ClickListener clickListener = new ClickListener();
		DragListener dragListener = new DragListener();
		this.addMouseListener(clickListener);
		this.addMouseMotionListener(dragListener);
	}
	public void paintComonent(Graphics g) {
		super.paintComponent(g);
		image.paintIcon(this, g,(int) imageCorner.getX(),(int) imageCorner.getY() );
	}
	private class ClickListener extends MouseAdapter{
		
		public void mousePressed(MouseEvent e) {
			prevPt = new Point(e.getClientX(),e.getClientY());
		}
	}
	private class DragListener extends MouseMotionAdapter{
		public void mouseDragged(MouseEvent e) {
			Point currenPt = new Point(e.getClientX(),e.getClientY());
			
			imageCorner.translate(
					(int) (currenPt.getX() - prevPt.getX()),
					(int) (currenPt.getX() - prevPt.getY())
			);
			prevPt = currenPt;
			repaint();
		}
	}
}
