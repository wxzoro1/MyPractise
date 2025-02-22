package The_fifth.Exercise.BondloginDemo;

import javax.swing.border.Border;
import java.awt.*;
 
import java.awt.Color;  
import java.awt.Component;  
import java.awt.Graphics;  
import java.awt.Insets;  
  
import javax.swing.border.Border;  
    
public class RoundBorder implements Border {  
    private Color color;  
  
    public RoundBorder(Color color) {
        this.color = color;  
    }  
  
    public RoundBorder() {
        this.color = Color.BLACK;    
    }  
  
    public Insets getBorderInsets(Component c) {  
        return new Insets(0, 0, 0, 0);  
    }  
  
    public boolean isBorderOpaque() {  
        return false;  
    }  

    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {  
        g.setColor(color);  
        g.drawRoundRect(0, 0, c.getWidth() - 1, c.getHeight() - 1, 15, 15);  
    }  
}  

