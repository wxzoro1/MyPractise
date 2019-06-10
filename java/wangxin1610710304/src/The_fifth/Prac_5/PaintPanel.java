package The_fifth.Prac_5;

import javax.swing.*;
import java.awt.*;

public class PaintPanel {
	public static void main(String[] args){
		JFrame f = new JFrame();
		f.setTitle("Drawing Graphics on Panel");
		f.setBounds(100, 50, 300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setContentPane(new MyPanel());
		f.setVisible(true);
	}
}
class MyPanel extends JPanel{
	public void paint(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillOval(20, 20, 100, 100);
	}
}
