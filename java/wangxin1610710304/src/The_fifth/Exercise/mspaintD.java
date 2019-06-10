package The_fifth.Exercise;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class mspaintD extends JPanel implements MouseListener,ActionListener{				 //��ϰ�� 8
	String func = " ";						
	int x1,x2,y1,y2;
	
	public static void main(String[] args) {
		mspaintD demo = new mspaintD();
		demo.go();
	}
	
	public void go() {
		JFrame f = new JFrame();
		f.setSize(600, 400);	
		f.setTitle("Draw");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setContentPane(this);
		f.setBackground(Color.white);
		f.setLayout(new BorderLayout());
		
		JToolBar jt = new JToolBar();
		JButton lin = new JButton("ֱ��");
		lin.addActionListener(this);
		JButton cir = new JButton("��Բ");
		cir.addActionListener(this);
		JButton rec = new JButton("����");
		rec.addActionListener(this);
		jt.add(lin);
		jt.add(cir);
		jt.add(rec);
		
		f.add(jt,"North");
		f.setVisible(true);
	}
	
	public void actionPerformed (ActionEvent e) {
		if (e.getActionCommand().equals("ֱ��")) {
			func = "ֱ��";
			addMouseListener(this);
		}else if (e.getActionCommand().equals("��Բ")) {
			func = "��Բ";
			addMouseListener(this);
		}else if (e.getActionCommand().equals("����")) {
			func = "����";
			addMouseListener(this);
		}
	}
	
	public void paintComponent (Graphics g) {
		if (func.equals("ֱ��")) {
			g.drawLine(x1,y1,x2,y2);
		}else if (func.equals("��Բ")) {
			g.drawOval(Math.min(x1, x2),Math.min(y1, y2),Math.abs(x1-x2),Math.abs(y1-y2));
		}else if (func.equals("����")) {
			g.drawRect(Math.min(x1, x2),Math.min(y1, y2),Math.abs(x1-x2),Math.abs(y1-y2));
		}
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		x1 = e.getX();
		y1 = e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		x2 = e.getX();
		y2 = e.getY();	
		repaint();
	}
}
