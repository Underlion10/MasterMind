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
	
	public CirculoGrande(Color color){
		this.color = color;
	}
	
	public void dibujarCirc(Graphics g, int x, int y, Color color) {
		g.setColor(color);
		g.fillOval(x, y, 50, 50);
	}
	
	public void setColor(Color color) {
		this.color = color;
	}

}
