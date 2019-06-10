package The_fifth.Exercise.BondloginDemo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
/**
 * ����һ��Բ�εİ�ťʱ����Ҫ�������£� ��һ����������һ���ʵ��Ļ滭�����Ի���һ��Բ�Ρ�
 * �ڶ�����������һЩ�¼�ʹ��ֻ�е�����Բ�ΰ�ť�ķ�Χ�е�ʱ�ť�Ż�������Ӧ
 */
public class circleButton extends JButton {
 
    public circleButton(String label) {
        super(label);
      
        Dimension size = getPreferredSize();
        size.width = size.height =20;
        setPreferredSize(size);
       
        setContentAreaFilled(false);
        this.setBorderPainted(false); 
        this.setFocusPainted(false); 
    }

    public circleButton(ImageIcon icon) {
    	 
         super(icon);
         Dimension size = getPreferredSize();
         size.width = size.height =20;
         setPreferredSize(size);
        
         setContentAreaFilled(false);
         this.setBorderPainted(false); 
         this.setFocusPainted(false); 
	}

	protected void paintComponent(Graphics g) {
 
        if (getModel().isArmed()) {
            g.setColor(Color.lightGray); 
        } else {
            g.setColor(getBackground());
        }
  
        g.fillOval(0, 0, getSize().width - 1, getSize().height - 1);
 
        super.paintComponent(g);
    }
 
    protected void paintBorder(Graphics g) {
        g.setColor(Color.white);
        
        g.drawOval(0, 0, getSize().width - 1, getSize().height - 1);
    }
 
    Shape shape;
 
    public boolean contains(int x, int y) {
 
        if ((shape == null) || (!shape.getBounds().equals(getBounds()))) {
            shape = new Ellipse2D.Float(0, 0, getWidth(), getHeight());
        }
        return shape.contains(x, y);
    }
 
    public static void main(String[] args) {
        JButton button = new circleButton("");
        button.setBackground(Color.orange);
 
        JFrame frame = new JFrame("Բ�ΰ�ť");
        frame.getContentPane().setBackground(Color.pink);
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(button);
        frame.setSize(200, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
}

