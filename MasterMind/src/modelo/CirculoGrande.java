package modelo;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class CirculoGrande extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -717079839918078445L;
	
	private Color color;
	private int x;
	private int y;
	
	public CirculoGrande(Color color, int x, int y){
		this.color = color;
		this.x = x;
		this.y = y;
	}
	
	public void dibujarCirc(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, 50, 50);
	}
	
	public void setColor(Color color) {
		this.color = color;
	}

}
