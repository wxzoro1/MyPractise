package The_fifth.Prac_5;

import javax.swing.*;
import java.awt.*;

public class LabelButton {
	public static void main(String[] args) {
		JFrame f = new JFrame("Label and Button");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());
		JLabel label = new JLabel("�𾯰�ť��");
		label.setFont(new Font("����", Font.PLAIN, 24));
		JButton button = new JButton(new ImageIcon("red.jpg"));
		f.getContentPane().add(label);
		f.getContentPane().add(button);
		f.setSize(300, 250);
		f.setVisible(true);
	}
}
