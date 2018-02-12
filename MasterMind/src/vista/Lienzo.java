package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import modelo.CirculoGrande;
import modelo.Stuff;

public class Lienzo extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -257640443263265082L;

	//private ArrayList<CirculoGrande> circulosGrandes = new ArrayList<CirculoGrande>();
	private Color color = new Color(255, 255, 255);

	public Lienzo() {
		setBackground(new Color(164, 223, 169));
		setBorder(BorderFactory.createLineBorder(new Color(84, 82, 158)));
	}

	public Dimension getPreferredSize() {
		return new Dimension(400, 500);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int x = 25;
		int y = 25;
		int acu = 1;
		
		if(Stuff.reiniciar) {
			for(int i = 0; i < 20; i++) {
				Stuff.circulosGrandes.get(i).setColor(new Color(255,255,255));
				Stuff.circulosGrandes.get(i).dibujarCirc(g);
				Stuff.reiniciar = false;
			}
		}

		for (int i = 0; i < 24; i++) {
			if (acu <= 4) {
				CirculoGrande cg = new CirculoGrande(color, x, y);
				Stuff.circulosGrandes.add(cg);
				x += 100;
				acu++;
				continue;
			}
			x = 25;
			y += 100;
			acu = 1;
		}

		if (!Stuff.reiniciar) {
			for (int i = 0; i < 20; i++) {
				if (i == Stuff.pos - 1) {
					Stuff.circulosGrandes.get(i).setColor(Stuff.colorPintura);
					Stuff.circulosGrandes.get(i).dibujarCirc(g);
					continue;
				}
				Stuff.circulosGrandes.get(i).dibujarCirc(g);
			}
		}
//		} else {
//			for(int i = 0; i < 20; i++) {
//				Stuff.circulosGrandes.get(i).setColor(new Color(255,255,255));
//				Stuff.circulosGrandes.get(i).dibujarCirc(g);
//				Stuff.reiniciar = false;
//			}
//			
//			for(int i = 0; i < 20; i++) {
//				Stuff.circulosGrandes.add(new CirculoGrande(new Color(255,255,255), x, y));
//				Stuff.circulosGrandes.get(i).dibujarCirc(g);
//				Stuff.reiniciar = false;
//			}
//		}
	}

	public ArrayList<CirculoGrande> getCirculoGrande() {
		return Stuff.circulosGrandes;
	}
}
