package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import modelo.CirculoPequeno;
import modelo.Stuff;

public class LienzoLateral extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1100106091955365643L;

	private Color color = new Color(255, 255, 255);

	public LienzoLateral() {
		setBackground(new Color(229, 128, 209));
		setBorder(BorderFactory.createLineBorder(new Color(51, 63, 213)));
	}

	public Dimension getPreferredSize() {
		return new Dimension(100, 500);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(new Color(200, 200, 200));
		int x = 25;
		int y = 35;
		int acu = 0;
		int tot = 0;

		for (int i = 0; i < 30; i++) {
			if (tot < 4) {
				if (acu < 2) {
					CirculoPequeno cp = new CirculoPequeno(color, x, y);
					Stuff.circulosPequenos.add(cp);
					x += 30;
					acu++;
					tot++;
					continue;
				}
				x = 25;
				y += 25;
				acu = 0;
				continue;
			}
			x = 25;
			y += 75;
			acu = 0;
			tot = 0;
		}

		if (!Stuff.reiniciar) {
			for (int i = 0; i < 20; i++) {
				if (Stuff.posLateral == i) {
					for (int j = 0; j < Stuff.colorLateral.size(); j++) {
						Stuff.circulosPequenos.get(i).setColor(Stuff.colorLateral.get(j));
						Stuff.circulosPequenos.get(i).pintarDibujo(g);
						i++;
					}
				}
				Stuff.circulosPequenos.get(i).pintarDibujo(g);
			}
		} else {
			for(int i=0; i<20; i++) {
				Stuff.circulosPequenos.get(i).setColor(new Color(255,255,255));
				Stuff.circulosPequenos.get(i).pintarDibujo(g);
				Stuff.reiniciar = false;
			}
		}
		
		Stuff.colorLateral.clear();
		

	}

	public ArrayList<CirculoPequeno> getCirculoPequeno() {
		return Stuff.circulosPequenos;
	}
	
}
