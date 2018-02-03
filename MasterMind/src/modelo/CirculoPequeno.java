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
	private int x;
	private int y;
	
	public CirculoPequeno(Color color, int x, int y) {
		this.color = color;
		this.x = x;
		this.y = y;
	}
	
	public void pintarDibujo(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, 10, 10);
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return this.color;
	}
}
