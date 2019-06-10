package The_fifth.Exercise;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

import javax.print.PrintService;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class StudentSys extends JFrame implements ActionListener {			//练习题 6
	private JPanel frameJPanel;
	private JTextField name;
	private ButtonGroup sex;
	private JTextField cla;
	private JTextField tel;
	private JTextField mob;
	private JTextField email;
	private JTextField address;
	private JTextField pocode;
	
	public static void main(String[] args) {				
		StudentSys app = new StudentSys();
		app.go();
	}
	
	public void go() {
		setTitle("StudentSys");
		setSize(700, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu menu = new JMenu("File");
		JMenu menu1 = new JMenu("Edit");
		JMenu menu2 = new JMenu("Help");
		menuBar.add(menu);
		menuBar.add(menu1);
		menuBar.add(menu2);
		
		JToolBar jToolBar = new JToolBar();
		add(jToolBar, "North");
		JButton jButton = new JButton("新增学生");
		jButton.addActionListener(this);
		JButton jButton2 = new JButton("保存");
		jButton2.addActionListener(this);
		JButton jButton3 = new JButton("清空");
		jButton3.addActionListener(this);
		jToolBar.add(jButton);
		jToolBar.add(jButton2);
		jToolBar.add(jButton3);
		
		JPanel p = new JPanel();
		add(p,"Center");
		p.setLayout(new GridLayout(1,4));
		JPanel textJPanel = TextPanel();
		JPanel frameJPanel = FramePanel();
		p.add(textJPanel);
		p.add(frameJPanel);
		p.add(new JLabel(""));
		
		JScrollPane stuPane = new JScrollPane();
		stuPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		add(stuPane, "East");
		setVisible(true);
	}
	
	public JPanel TextPanel() {
		JPanel textJPanel = new JPanel(new GridLayout(9, 1, 15, 15));
		JLabel name = new JLabel("Name:");
		textJPanel.add(name);
		JLabel sex = new JLabel("Sex:");
		textJPanel.add(sex);
		textJPanel.add(new JLabel(""));
		JLabel cla = new JLabel("Class:");
		textJPanel.add(cla);
		JLabel tel = new JLabel("Tel:");
		textJPanel.add(tel);
		JLabel mob = new JLabel("Mobile:");
		textJPanel.add(mob);
		JLabel email = new JLabel("E-mail:");
		textJPanel.add(email);
		JLabel address = new JLabel("Address:");
		textJPanel.add(address);
		JLabel pocode = new JLabel("Postal Code:");
		textJPanel.add(pocode);
		
		return textJPanel;
	}
	
	public JPanel FramePanel() {
		frameJPanel = new JPanel(new GridLayout(9,1,15,15));
		name = new JTextField(15);
		frameJPanel.add(name);
		JRadioButton sex1 = new JRadioButton("Male");
		sex1.setActionCommand("Male");
		frameJPanel.add(sex1);
		JRadioButton sex2 = new JRadioButton("FeMale");
		sex2.setActionCommand("FeMale");
		frameJPanel.add(sex2);
		sex = new ButtonGroup();
		sex.add(sex1);
		sex.add(sex2);
		cla = new JTextField(15);
		frameJPanel.add(cla);
		tel = new JTextField(15);
		frameJPanel.add(tel);
		mob = new JTextField(15);
		frameJPanel.add(mob);
		email = new JTextField(15);
		frameJPanel.add(email);
		address = new JTextField(15);
		frameJPanel.add(address);
		pocode = new JTextField(15);
		frameJPanel.add(pocode);
		
		return frameJPanel;
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("新增学生")) {
			name.setText("");
			sex.clearSelection();
			cla.setText("");
			tel.setText("");
			mob.setText("");
			email.setText("");
			address.setText("");
			pocode.setText("");
		}else if (e.getActionCommand().equals("保存")) {
			if ((name.getText() != "") && (sex.getSelection().getActionCommand() != "") && (cla.getText() != "")
					&& (tel.getText() != "") && (mob.getText() != "") && (email.getText() != "")
					&& (address.getText() != "") && (pocode.getText() != "")) {
				String na = "姓名：";
				String se = "姓别：";
				String cl = "班级：";
				String te = "电话：";
				String mo = "手机：";
				String em = "邮箱：";
				String ad = "地址：";
				String po = "邮编：";	
				try {
					PrintStream out = new PrintStream(new FileOutputStream("StuInfo.txt",true));
					out.append(na + name.getText() + "\r\n" + se + sex.getSelection().getActionCommand() + "\r\n" +
							   cl + cla.getText() + "\r\n" + te + tel.getText() + "\r\n" +
							   mo + mob.getText() + "\r\n" + em + email.getText() + "\r\n" +
							   ad + address.getText() + "\r\n" + po + pocode.getText());
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			else 
				JOptionPane.showMessageDialog(null, "请输入全部信息,否则不能保存");
		}else if (e.getActionCommand().equals("清空")) {
			name.setText("");
			sex.clearSelection();
			cla.setText("");
			tel.setText("");
			mob.setText("");
			email.setText("");
			address.setText("");
			pocode.setText("");
		}
	}
}
