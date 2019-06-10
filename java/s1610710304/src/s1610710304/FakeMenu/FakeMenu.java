package s1610710304.FakeMenu;

import java.awt.FlowLayout;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FakeMenu extends JFrame implements ActionListener{		//第2题
	public static void main(String[] args) {
		FakeMenu demo = new FakeMenu();
		demo.go();
	}
	
	public void go() {
		setTitle("Menu");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//菜单
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		//一级选项
		JMenu menu = new JMenu("File");
		JMenu menu1 = new JMenu("Edit");
		JMenu menu2 = new JMenu("Help");
		menuBar.add(menu);
		menuBar.add(menu1);
		menuBar.add(menu2);
		//二级选项
		String[] func = {"New","Open","Save","Copy","Cut","Paste","About"};
		JMenuItem[] thItems = new JMenuItem[7];
		for (int i = 0; i < thItems.length; i++) {
			thItems[i] = new JMenuItem(func[i]);
  		}
		menu.add(thItems[0]);
		menu.add(thItems[1]);
		menu.add(thItems[2]);
		menu1.add(thItems[3]);
		menu1.add(thItems[4]);
		menu1.add(thItems[5]);
		menu2.add(thItems[6]);
		//监听
		for (int i = 0; i < thItems.length; i++) {
			thItems[i].addActionListener(this);
		}		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if ("New".equals(str)) {
			System.out.println("new");
			JOptionPane.showMessageDialog(null, "New");
		}else if ("Open".equals(str)) {
			System.out.println("open");
			JOptionPane.showMessageDialog(null, "Open");
		}else if ("Save".equals(str)) {
			System.out.println("save");
			JOptionPane.showMessageDialog(null, "Save");
		}else if ("Copy".equals(str)) {
			System.out.println("copy");
			JOptionPane.showMessageDialog(null, "Copy");
		}else if ("Paste".equals(str)) {
			System.out.println("paste");
			JOptionPane.showMessageDialog(null, "Paste");
		}else if ("About".equals(str)) {
			System.out.println("about");
			JOptionPane.showMessageDialog(null, "About");
		}
	}
}
