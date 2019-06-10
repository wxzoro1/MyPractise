package The_fifth.Prac_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button = new JButton("click me");
		frame.getContentPane().add(button);
		frame.setSize(200, 200);
		MyListener listener = new MyListener();
		button.addActionListener(listener);
		frame.setVisible(true);	
	}
}
class MyListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		System.out.println("I've been clicked");
	}
}
