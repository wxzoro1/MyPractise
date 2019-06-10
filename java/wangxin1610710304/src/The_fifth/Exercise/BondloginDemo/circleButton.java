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
 * 制作一个圆形的按钮时，需要做两件事： 第一件事是重载一个适当的绘画方法以画出一个圆形。
 * 第二件事是设置一些事件使得只有当你点击圆形按钮的范围中的时侯按钮才会作出响应
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
 
        JFrame frame = new JFrame("圆形按钮");
        frame.getContentPane().setBackground(Color.pink);
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(button);
        frame.setSize(200, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
}

