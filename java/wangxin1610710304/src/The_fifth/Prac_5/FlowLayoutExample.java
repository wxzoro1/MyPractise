package The_fifth.Prac_5;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
	public static void main(String[] args) {
		JFrame f = new JFrame("FlowLayout");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel cp = (JPanel)f.getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(getFieldPanel());
		cp.add(getButtonPanel());
		f.pack();
		f.setVisible(true);
	}
	private static JPanel getFieldPanel() {
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		p.add(new JLabel("Name:"));
		p.add(new JTextField(12));
		p.add(new JCheckBox("Java", true));
		p.add(new JCheckBox("C++", true));
		p.add(new JCheckBox("Perl", false));
		return p;
	}
	private static JPanel getButtonPanel() {
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		p.add(new JButton("OK"));
		p.add(new JButton("Cancel"));
		return p;
	}
}
