package The_forth.Prac_4;

import javax.swing.*;
import java.awt.*;

public class PaintFrame extends JFrame{
	public PaintFrame() {
		setTitle("Drawing Graphics in Frames");
		setBounds(100, 50, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void paint(Graphics a) {
		a.setColor(Color.RED);
		a.fillOval(20, 20, 100, 100);
	}
	public static void main(String[] args) {
		PaintFrame frame = new PaintFrame();
	}
}
