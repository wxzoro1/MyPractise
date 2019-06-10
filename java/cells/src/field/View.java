package field;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import cell.Cell;

public class View extends JPanel {													//view只管根据field画出图形  field只管数据的存放 数据更新后 通知view repaint
	private static final long serialVersionUID = -5258995676212660595L;				//不管那个局部更新， 简化程序逻辑，前提是计算机速度提高的基础
	private static final int GRID_SIZE = 16;										//责任驱动的设计 将程序实现的功能分配到合适的类/对象中去
	private Field theField;															//网格化 好处 图形界面更高解析度 数据更易处理
	
	public View(Field field) {
		theField = field;
	}

	@Override
	public void paint(Graphics g) {													//paint 继承来的  draw cell
		super.paint(g);
		for ( int row = 0; row<theField.getHeight(); row++ ) {
			for ( int col = 0; col<theField.getWidth(); col++ ) {
				Cell cell = theField.get(row, col);
				if ( cell != null ) {
					cell.draw(g, col*GRID_SIZE, row*GRID_SIZE, GRID_SIZE);
				}
			}
		}
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(theField.getWidth()*GRID_SIZE+1, theField.getHeight()*GRID_SIZE+1);
	}

	public static void main(String[] args) {
		Field field = new Field(10,10);
		for ( int row = 0; row<field.getHeight(); row++ ) {
			for ( int col = 0; col<field.getWidth(); col++ ) {
				field.place(row, col, new Cell());
			}
		}
		View view = new View(field);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("Cells");
		frame.add(view);
		frame.pack();
		frame.setVisible(true);
	}

}
