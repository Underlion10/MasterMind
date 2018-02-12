package controlador;

import java.awt.Color;
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
		for(int i = 0; i < Stuff.circulosPequenos.size(); i++) {
			Stuff.circulosPequenos.set(i, null);
		}
		Stuff.circulosPequenos.clear();
		Stuff.colorLateral.clear();
		Stuff.lienzoSuperior.crearComboGanador();
		Stuff.cg.get(0).setSeleccionado(false);
		Stuff.cg.get(1).setSeleccionado(false);
		Stuff.cg.get(2).setSeleccionado(false);
		Stuff.cg.get(3).setSeleccionado(false);
		Stuff.colorActual = new Color(255,255,255);
		Stuff.colorPintura = new Color(255,255,255);
		Stuff.lienzoColores.repaint();
		Stuff.lienzo.repaint();
		Stuff.lienzoLateral.repaint();
		Stuff.lienzoSuperior.repaint();
	}

}
