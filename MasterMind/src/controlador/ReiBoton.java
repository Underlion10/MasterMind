package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Stuff;

public class ReiBoton implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		Stuff.ronda = 1;
		Stuff.reiniciar = true;
		Stuff.ganado = false;
		Stuff.perdido = false;
		Stuff.comboGanador.clear();
		Stuff.lienzoSuperior.crearComboGanador();
		Stuff.lienzo.repaint();
		Stuff.lienzoLateral.repaint();
		Stuff.lienzoSuperior.repaint();
	}

}
