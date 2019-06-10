package The_fifth.Exercise.BondloginDemo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class BondloginDemo extends JFrame implements ActionListener{
	public static void main(String[] args) {
		BondloginDemo app = new BondloginDemo();
		app.go();
	}
	
	public void go() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int Location_x = (int) (toolkit.getScreenSize().getWidth() * 0.6) / 2;
	    int Location_y = (int) (toolkit.getScreenSize().getHeight() *0.5) / 2;

		setTitle("财富证券独立委托V6.20");
		setSize(500, 305);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		
		JPanel contentPane = (JPanel)getContentPane();
		contentPane.setOpaque(false);
		contentPane.setBorder(new RoundBorder());
		contentPane.setLayout(new BorderLayout());
		JPanel titlePanel = gettitlePanel();
		contentPane.add(titlePanel,"North");
		JPanel mainPanel = getmainPanel();
		mainPanel.setBorder(BorderFactory.createLineBorder(Color.darkGray, 3));
		contentPane.add(mainPanel,"Center");
		contentPane.add(new JLabel("     "),"West");
		contentPane.add(new JLabel("     "),"East");
		contentPane.add(new JLabel("       请输入密码信息！"),"South");
		setLocation(Location_x, Location_y);
		setVisible(true);
	}
	
	private JPanel getmainPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JPanel imainPanel = getimainPanel();
		panel.add(new JLabel("   "), "North");
		panel.add(new JLabel("   "), "West");
		panel.add(new JLabel("   "), "East");
		panel.add(new JLabel("   "), "South");
		panel.add(imainPanel, "Center");
		return panel;
	}
	
	private JPanel getimainPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JPanel middlePanel = getmiddlePanel();
		panel.add(middlePanel, "Center");
		return panel;
	}
	
	private JPanel getmiddlePanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5,1));
		JPanel firPanel = getfirPanel();
		JPanel secPanel = getsecPanel();
		JPanel thiPanel = getthiPanel();
		JPanel forPanel = getforPanel();
		JPanel fifPanel = getfifPanel();
		panel.add(firPanel);
		panel.add(secPanel);
		panel.add(thiPanel);
		panel.add(forPanel);
		panel.add(fifPanel);
		return panel;
	}
	
	private JPanel getfifPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		JButton sure = new JButton("确定");
		JButton cancel = new JButton("取消");
		JButton help = new JButton("帮助  △");
		JButton seting = new JButton("通讯设置");
		panel.add(new JLabel("                     "));
		panel.add(sure);
		panel.add(cancel);
		panel.add(help);
		panel.add(seting);
		return panel;
	}
	
	private JPanel getforPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(0));
		JButton button1 = new JButton("安全方式：");	
		button1.setBorderPainted(false);
		button1.setContentAreaFilled(false);
		String[] code = {"验证码","短信登录"};
		JComboBox<String> cod = new JComboBox<String>(code);
		cod.setPreferredSize(new Dimension(70,25));
		ImageIcon icon=new ImageIcon("abc.png");
		icon=new ImageIcon(icon.getImage().getScaledInstance(80, 25, Image.SCALE_SMOOTH));
		JButton button2 = new JButton(icon);
		button2.setPreferredSize(new Dimension(80,25));
		JTextField textField = new JTextField();
		textField.setPreferredSize(new Dimension(170,25));
		panel.add(button1);
		panel.add(cod);
		panel.add(textField);
		panel.add(button2);
		return panel;
	}
	private JPanel  getthiPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(0));
		JButton button1 = new JButton("交易密码：");
		button1.setBorderPainted(false);
		button1.setContentAreaFilled(false);
		JPasswordField passwd = new JPasswordField();
		passwd.setPreferredSize(new Dimension(245,25));
		ImageIcon icon=new ImageIcon("keyboard.jpg");
		icon=new ImageIcon(icon.getImage().getScaledInstance(25, 17, Image.SCALE_SMOOTH));
		JButton keyboard =  new JButton(icon);
		keyboard.setPreferredSize(new Dimension(30,20));
		keyboard.setBorderPainted(false);
		keyboard.setContentAreaFilled(false);
		panel.add(button1);
		panel.add(passwd);
		passwd.setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 0)); 
		passwd.add(keyboard);
		return panel;
	}
	private JPanel getsecPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(0));
		JButton button1 = new JButton("客户号:");
		button1.setBorderPainted(false);
		button1.setContentAreaFilled(false);
		button1.setPreferredSize(new Dimension(80,20));
		String[] coscodes = {"*********","123125134"};
		JComboBox<String> coscode = new JComboBox<String>(coscodes);
		coscode.setPreferredSize(new Dimension(243,25));
		coscode.setEditable(true);
		JCheckBox jizhu = new JCheckBox("记住密码");
		panel.add(button1);
		panel.add(new JLabel("     "));
		panel.add(coscode);
		panel.add(jizhu);
		return panel;
	}
	
	private JPanel getfirPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(0));
		JButton accountname = new JButton("账户类型：");
		accountname.setContentAreaFilled(false);
		accountname.setBorderPainted(false);
		String[] cosnums = {"客户号","平台号"};
		String[] stonums = {"(3300)北京中关村","(4411)道理大呲花"};
		JComboBox<String> cosnum = new JComboBox<String>(cosnums);
		cosnum.setPreferredSize(new Dimension(70,25));
		JComboBox<String> stonum = new JComboBox<String>(stonums);
		stonum.setPreferredSize(new Dimension(170,25));
		JCheckBox baohu = new JCheckBox("保护账号");
		panel.add(accountname);
		panel.add(cosnum);
		panel.add(stonum);
		panel.add(baohu);
		return panel;
	}
	
 	private JPanel gettitlePanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JButton button1 = new JButton("财富证券独立委托V6.20");
		button1.setFocusable(false);
		button1.setBorderPainted(false);
		button1.setContentAreaFilled(false);
		panel.add(button1,"West");
		ImageIcon icon=new ImageIcon("closebutton.jpg");
		icon=new ImageIcon(icon.getImage().getScaledInstance(23, 22, Image.SCALE_SMOOTH));
		JButton closeButton = new circleButton(icon);
		closeButton.setPreferredSize(new Dimension(30,30));
		closeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		panel.add(closeButton,"East");
		return panel;
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}
	
	
}
