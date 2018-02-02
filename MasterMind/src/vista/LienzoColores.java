package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import modelo.Stuff;

public class LienzoColores extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4518801875030111858L;
	
	private int x;
	private int y;
	
	
	
	public LienzoColores() {
		setBorder(BorderFactory.createLineBorder(new Color(51, 63, 213)));
		JLabel etiqueta = new JLabel("Colores Posibles");
		add(etiqueta);
	}
	
	public void rellenarColores() {
		Stuff.colores.add(new Color(255,0,0));
		Stuff.colores.add(new Color(0,255,0));
		Stuff.colores.add(new Color(0,0,255));
		Stuff.colores.add(new Color(255, 243, 0));
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(100, 400);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int x = 25;
		int y = 25;
		for(int i = 0; i<4;i++) {
			g.setColor(Stuff.colores.get(i));
			g.fillOval(x, y, 50, 50);
			y+=100;
		}
		repaint();
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	

}
