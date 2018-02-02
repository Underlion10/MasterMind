package modelo;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class CirculoPequeno extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8546144266053639146L;
	
	private Color color;
	
	public CirculoPequeno(Color color) {
		this.color = color;
	}
	
	public void pintarDibujo(Graphics g, int x, int y) {
		g.setColor(color);
		g.fillOval(x, y, 10, 10);
	}

}
