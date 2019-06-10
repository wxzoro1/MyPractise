package The_fifth.Exercise;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeColor extends JFrame implements ActionListener		//练习题 1
{
	private JTextField textField;
	private JButton blueButton,redButton;
	private JPanel p;
	
	public static void main(String[] args) {
		ChangeColor app = new ChangeColor();
		app.go();
	}
	
	public void go() {
		setTitle("文本框");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		p = (JPanel)getContentPane();
		p.setLayout(new FlowLayout());
		String text =  "text123123123";
		textField = new JTextField(text, 15);
		p.add(textField);
		blueButton = new JButton("蓝色");
		redButton = new JButton("红色");
		p.add(blueButton);
		blueButton.addActionListener(this);
		p.add(redButton);
		redButton.addActionListener(this);
		
		pack();
		setVisible(true);
	}		
	
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if ("蓝色".equals(str)) {
			textField.setForeground(Color.blue);
		}
		else {
			textField.setForeground(Color.red);
		}
	}
}
