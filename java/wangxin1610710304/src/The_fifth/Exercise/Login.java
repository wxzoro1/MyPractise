package The_fifth.Exercise;

import javax.swing.*;
import javax.xml.soap.Detail;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener			//Á·Ï°Ìâ 2
{
	private JPanel p;
	private JTextField username;
	private JPasswordField passwd;
	private JButton loginButton;
	private JPanel topPanel;
	private JPanel buttonPanel;
	private JPanel userInfoJPanel;
	
	public static void main(String[] args) {
		Login app = new Login();
		app.go();
	}
	
	public void go() {
		setTitle("Login");
		setSize(395, 305);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = (JPanel)getContentPane();
		p.setLayout(new BorderLayout(0, 5));
		topPanel = getTopPanel();
		buttonPanel = buttonPanel();
		p.add(topPanel,"Center");
		p.add(buttonPanel,"South");
	
		setVisible(true);
	}
	
	private JPanel getTopPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,1));
		
		panel.add(new JLabel(" "));
		userInfoJPanel = getUserInfoPanel();
		panel.add(userInfoJPanel);
		
		return panel;
	}
	
	private JPanel buttonPanel() {
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		
		loginButton = new JButton("µÇÂ¼");
		loginButton.addActionListener(this);
		buttonPanel.add(loginButton);
		
		return (buttonPanel);
	}
	
	private JPanel getUserInfoPanel() {
		JPanel userInfoPanel = new JPanel();
		userInfoPanel.setLayout(new GridLayout(1,3));
		
		JPanel textdetail = textDetail();
		JPanel detail = DetailPanel();
		userInfoPanel.add(textdetail);
		userInfoPanel.add(detail);
		userInfoPanel.add(new JLabel(""));
		
		return(userInfoPanel);
	}
	
	private JPanel DetailPanel() {
		JPanel detailPanel = new JPanel();
		detailPanel.setLayout(new BorderLayout(0,22));
		
		username = new JTextField("");
		detailPanel.add(username,"North");
		passwd = new JPasswordField("");
		detailPanel.add(passwd, "Center");
		detailPanel.add(new Label(""), "South");
		return (detailPanel);
	}
	
	private JPanel textDetail() {
		JPanel textdetailJPanel = new JPanel();
		textdetailJPanel.setLayout(new BorderLayout(0,22));
		JLabel username1 = new JLabel("Username:");
		username1.setAlignmentX(RIGHT_ALIGNMENT);
		textdetailJPanel.add(username1,"North");
		JLabel passwd1 = new JLabel("Password:");
		textdetailJPanel.add(passwd1, "Center");
		textdetailJPanel.add(new Label(""), "South");
		return textdetailJPanel;
	}
	
	public void actionPerformed(ActionEvent e) {
		passwd.setEchoChar((char)0);
	}
}


