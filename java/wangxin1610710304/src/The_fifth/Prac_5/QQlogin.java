package The_fifth.Prac_5;
import javax.imageio.spi.RegisterableService;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QQlogin extends JFrame implements ActionListener{
	
	JButton m_loginButton;
	
	public static void main(String[] args) {
		QQlogin app = new QQlogin();
		app.go();
	}
	
	public void go() {
		setTitle("QQ");
		setSize(395, 305);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon bg = new ImageIcon("sky.jpg");
		JLabel label = new JLabel(bg);
		label.setBounds(0, 0, bg.getIconWidth(), bg.getIconHeight());
		getLayeredPane().add(label, new Integer(-30001));
		
		JPanel contentPane = (JPanel)getContentPane();
		contentPane.setOpaque(false);
		contentPane.setLayout(new BorderLayout());
		JPanel topJPanel = getTopPanel();
		topJPanel.setOpaque(false);
		contentPane.add(topJPanel, "Center");
		JPanel buttonPanel = getButtonPanel();
		contentPane.add(buttonPanel,"South");
		
		setVisible(true);
	}
	
	private JPanel getTopPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 1));
		panel.add(new JLabel(" "));
		JPanel userInfo = getUserInfoPanel();
		userInfo.setOpaque(false);
		panel.add(userInfo);
		return panel;
		
	}
	
	private JPanel getUserInfoPanel() {
		JPanel userInfoPanel = new JPanel();
		
		userInfoPanel.setLayout(new FlowLayout());
		
		JLabel pic = new JLabel(new ImageIcon("Í·Ïñ.jpg"));
		userInfoPanel.add(pic);
		
		JPanel accountPanel = getAccountPanel();
		accountPanel.setOpaque(false);
		userInfoPanel.add(accountPanel);
		
		JPanel registerPanel = getRegisterPanel();
		registerPanel.setOpaque(false);
		userInfoPanel.add(registerPanel);
		return(userInfoPanel);
	}
	
	private JPanel getAccountPanel() {
		JPanel accountPanel = new JPanel();
		accountPanel.setLayout(new BorderLayout(0,5));
		
		String[] ids = {"12312213123","34242342","5446456456"};
		JComboBox<String>user = new JComboBox<String>(ids);
		user.setEditable(true);
		accountPanel.add(user, "North");
		
		JPasswordField password	= new JPasswordField(15);
		accountPanel.add(password, "Center");
		
		JPanel checkPanel = getCheckPanel();
		checkPanel.setOpaque(false);
		accountPanel.add(checkPanel, "South");
		return(accountPanel);
		
	}
	
	private JPanel getCheckPanel() {
		JPanel checkPanel = new JPanel();
		checkPanel.setLayout(new BoxLayout(checkPanel, BoxLayout.X_AXIS));
		Font font = new Font("ËÎÌå",Font.BOLD, 12);
		JCheckBox check1 = new JCheckBox("¼Ç×¡ÃÜÂë", true);
		check1.setFont(font);
		checkPanel.add(check1);
		JCheckBox check2 = new JCheckBox("×Ô¶¯µÇÂ¼", false);
		check2.setFont(font);
		checkPanel.add(check2);
		return(checkPanel);
	}
	
	
	private JPanel getRegisterPanel() {
		JPanel registerPanel = new JPanel();
		registerPanel.setLayout(new BoxLayout(registerPanel, BoxLayout.Y_AXIS));
		
		JButton button1 = new JButton("×¢²áÕËºÅ");
		button1.setBorderPainted(false);
		button1.setFocusable(false);
		button1.setContentAreaFilled(false);
		button1.setAlignmentX(Component.LEFT_ALIGNMENT);
		registerPanel.add(button1);
		button1.addActionListener(this);
		JButton button2 = new JButton("ÕÒ»ØÃÜÂë");
		button2.setBorderPainted(false);
		button2.setFocusable(false);
		button2.setContentAreaFilled(false);
		button2.setAlignmentX(Component.LEFT_ALIGNMENT);
		registerPanel.add(button2);
		button2.addActionListener(this);
		
		return(registerPanel);
	}
	
	private JPanel getButtonPanel() {
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new BorderLayout(50, 0));
		
		JButton button1 = new JButton(new ImageIcon("¶àÕËºÅµÇÂ¼.jpg"));
		button1.setBorderPainted(false);
		button1.setFocusable(false);
		button1.setContentAreaFilled(false);
		buttonPanel.add(button1, "West");
		button1.addActionListener(this);
		m_loginButton = new JButton("µÇÂ¼");
		buttonPanel.add(m_loginButton, "Center");
		m_loginButton.addActionListener(this);
		
		JButton button2 = new JButton(new ImageIcon("¶þÎ¬ÂëµÇÂ¼.jpg"));
		button2.setBorderPainted(false);
		button2.setFocusable(false);
		button2.setContentAreaFilled(false);
		buttonPanel.add(button2, "East");
		button2.addActionListener(this);
		return(buttonPanel);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == (Object)m_loginButton) {
			JOptionPane.showMessageDialog(null, "login");
		}
		else {
			JOptionPane.showMessageDialog(null, "button pressed");
		}
	}
}
