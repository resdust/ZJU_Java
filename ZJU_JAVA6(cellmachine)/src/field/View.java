package field;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import cell.Cell;

public class View extends JPanel{
	//generate serrial version UID
	private static final long serialVersionUID = -2762052116735020673L;
	private static final int GRID_SIZE = 16;
	private Field theField;
	
	public View(Field field) {
		theField = field;
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		for (int row=0; row<theField.getHeight(); row++) {
			for (int col=0; col<theField.getWidth(); col++) {
				Cell cell = theField.get(row, col);
				if (cell != null) {
					cell.draw(g, col*GRID_SIZE, row*GRID_SIZE, GRID_SIZE);
				}
			}
		}
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(theField.getWidth()*GRID_SIZE+1, theField.getWidth()*GRID_SIZE+1);
	}
	
	
}
