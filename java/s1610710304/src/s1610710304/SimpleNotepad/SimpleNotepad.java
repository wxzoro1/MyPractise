package s1610710304.SimpleNotepad;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.management.RuntimeErrorException;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class SimpleNotepad extends JFrame implements ActionListener{		//µÚ3Ìâ
	private JTextArea textArea;
	
	public static void main(String[] args) {
		SimpleNotepad app = new SimpleNotepad();
		app.go();
	}
	
	public void go() {
		setTitle("Notepad");
		setSize(700, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JPanel butPanel = new JPanel();
		butPanel.setLayout(new BoxLayout(butPanel, BoxLayout.LINE_AXIS));
		JButton build1 = new JButton("Open");
		build1.addActionListener(this);
		build1.setBorderPainted(false);
		build1.setContentAreaFilled(false);
		JButton build2 = new JButton("New");
		build2.addActionListener(this);
		build2.setBorderPainted(false);
		build2.setContentAreaFilled(false);
		JButton build3 = new JButton("Save");
		build3.addActionListener(this);
		build3.setBorderPainted(false);
		build3.setContentAreaFilled(false);
		butPanel.add(build1);
		butPanel.add(build2);
		butPanel.add(build3);
		add(butPanel,"North");
		
		JScrollPane Pane = new JScrollPane();
		Pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		add(Pane, "East");
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,1));
		textArea = new JTextArea();
		add(p,"Center");
		p.add(textArea);

		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Open")) {
			JFileChooser jc = new JFileChooser();
			int rVal = jc.showOpenDialog(SimpleNotepad.this);
			System.out.println(rVal);
			if (rVal == JFileChooser.APPROVE_OPTION) {
				File dir = jc.getCurrentDirectory();
				File file = jc.getSelectedFile();
				textArea.setText(read(new File(dir,file.getName())));
			}
		}else if (e.getActionCommand().equals("New")) {
			textArea.setText("");
		}else if (e.getActionCommand().equals("Save")) {
			JFileChooser jc = new JFileChooser();
			int rVal = jc.showSaveDialog(SimpleNotepad.this);
			if (rVal == JFileChooser.APPROVE_OPTION) {
				File dir = jc.getCurrentDirectory();
				File file = jc.getSelectedFile();
				write(new File(dir,file.getName()), textArea.getText());
			}
		}
	}
	
	private String read(File file) {
		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(new FileInputStream(file),"GBK"));
			String data = null;
			StringBuffer buffer = new StringBuffer();
			while ((data = reader.readLine())!=null) 
				buffer.append(data+"\n");
			reader.close();
			return buffer.toString();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	private void write(File file, String str) {
		try {
			PrintWriter writer = new PrintWriter(
					new OutputStreamWriter(new FileOutputStream(file),"GBK"));
			writer.println(str);
			writer.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}





}
