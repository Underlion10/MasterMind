package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import modelo.Stuff;

public class LienzoSuperior extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1896694854895083602L;

	public LienzoSuperior() {
		setBackground(new Color(232, 154, 223));
		setBorder(BorderFactory.createLineBorder(new Color(51, 63, 213)));
		JLabel solucion = new JLabel("SOLUCIÓN: ");
		add(solucion);
	}

	public Dimension getPreferredSize() {
		return new Dimension(400, 100);
	}

	public void crearComboGanador() {
		Random rnd = new Random();

		for (int i = 0; i < 4; i++) {
			Stuff.comboGanador.add(Stuff.colores.get(rnd.nextInt(4)));
			System.out.println(Stuff.comboGanador.get(i));
		}

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		int x = 425;
		int y = 25;

		if (!Stuff.ganado && !Stuff.perdido) {
			g.setColor(new Color(143, 151, 147));

			for (int i = 0; i < 4; i++) {
				g.fillOval(x, y, 50, 50);
				x -= 100;
			}
		} else {
			for (int i = 0; i < Stuff.comboGanador.size(); i++) {
				g.setColor(Stuff.comboGanador.get(i));
				g.fillOval(x, y, 50, 50);
				x -= 100;
			}
		}
	}

}
