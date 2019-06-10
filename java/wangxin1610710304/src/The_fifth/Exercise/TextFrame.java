package The_fifth.Exercise;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class TextFrame extends JFrame implements MouseListener, MouseMotionListener{		//Á·Ï°Ìâ 3
	private JTextArea textArea;
	int xVal = 0; int yVal = 0;
	int left = 0; int right = 1;
	
	public static void main(String[] args) {
		TextFrame app = new TextFrame();
		app.go();
	}
	
	public void go() {
		setTitle("TextFrame");
		setSize(500	, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = (JPanel)getContentPane();
		textArea = new JTextArea();
		textArea.addMouseListener(this);
		textArea.addMouseMotionListener(this);
		panel.add(textArea);
		JScrollPane textPane = new JScrollPane(textArea);
		textPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		panel.add(textPane);
		setVisible(true);
	}
	
	public void mouseClicked(MouseEvent e) {
		String str = "Hello world!";
		textArea.append(str);
		textArea.append("\r\n");
		
		xVal = e.getX();
		yVal = e.getY();
		textArea.append("ºá×ø±ê£º"+xVal);
		textArea.append("\r\t");
		textArea.append("×Ý×ø±ê£º"+yVal);
		textArea.append("\r\t");
		if (e.getButton() == e.BUTTON1) {
			textArea.append("×ó¼üµã»÷");	
			textArea.append("\r\n");
		}
		else if (e.getButton() == e.BUTTON3) {
			textArea.append("ÓÒ¼üµã»÷");
			textArea.append("\r\n");
		}else if (e.getButton() == e.BUTTON2) {
			textArea.append("»¬ÂÖµã»÷");
			textArea.append("\r\n");
		}
	}
	

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

