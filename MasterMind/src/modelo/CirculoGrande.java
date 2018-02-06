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
	private boolean seleccionado;
	
	public CirculoGrande(Color color, int x, int y){
		this.color = color;
		this.x = x;
		this.y = y;
	}
	
	public CirculoGrande(Color color, int x, int y, boolean seleccionado) {
		this.color = color;
		this.x = x;
		this.y = y;
		this.seleccionado = seleccionado;
	}
	
	public void dibujarCirc(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, 50, 50);
	}
	
	public void dibujarCircSelec(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, 50, 50);
		if(seleccionado) {
			g.drawOval(x-5, y-5, 60, 60);
		}
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return this.color;
	}

	public boolean isSeleccionado() {
		return seleccionado;
	}

	public void setSeleccionado(boolean seleccionado) {
		this.seleccionado = seleccionado;
	}

}
