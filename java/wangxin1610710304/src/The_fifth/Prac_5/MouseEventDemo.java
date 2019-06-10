package The_fifth.Prac_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends JPanel implements MouseMotionListener{
	int xVal = 0, yVal = 0;
	boolean firstTime = true;
	
	public static void main(String[]args) {
		MouseEventDemo demo = new MouseEventDemo();
		demo.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		frame.setSize(200, 200);	
		frame.setTitle("Draw to draw");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(this);
		addMouseMotionListener(this);
		frame.setVisible(true);
	}
		
	public void paintComponent(Graphics g) {
		if (!firstTime) {
			g.fillOval(xVal, yVal, 4, 4);
		}
		else {
			firstTime = false;
		}
	}
	
	public void mouseDragged(MouseEvent e) {
		xVal = e.getX();
		yVal = e.getY();
		repaint();
	}
	
	
	public void mouseMoved(MouseEvent e) {
		
	}
}
	
