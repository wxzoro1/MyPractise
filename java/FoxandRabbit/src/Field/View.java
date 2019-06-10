package Field;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import cell.Cell;

public class View extends JPanel {

	private static final long serialVersionUID = 2118299654730994785L;
	private static final int GRID_SIZE = 15;
	private Field the_field;

	public View(Field the_field) {
		this.the_field = the_field;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		for ( int i = 0; i < the_field.getHeight(); i++ ) {
			for ( int j = 0; j < the_field.getWidth(); j++ ) {
				Cell cell = the_field.get(i, j);
				if ( cell != null ) {
					cell.draw(g, j*GRID_SIZE, i*GRID_SIZE, GRID_SIZE);
				}
			}
		}
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(the_field.getWidth()*GRID_SIZE+1, the_field.getHeight()*GRID_SIZE+1);
	}
}
