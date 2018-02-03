package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

import modelo.CirculoGrande;
import modelo.CirculoPequeno;
import modelo.Stuff;

public class AccionBoton implements ActionListener {

	private ArrayList<CirculoGrande> circulosGrandes;
	private ArrayList<CirculoPequeno> circulosPequenos;

	public AccionBoton(ArrayList<CirculoGrande> circulosGrandes, ArrayList<CirculoPequeno> circulosPequenos) {
		this.circulosGrandes = circulosGrandes;
		this.circulosPequenos = circulosPequenos;
	}

	public void actionPerformed(ActionEvent e) {
		
		switch(Stuff.ronda) {
		case 1:
			intentarCombo(20,16);
			break;
		case 2:
			intentarCombo(16,12);
			break;
		case 3:
			intentarCombo(12,8);
			break;
		case 4:
			intentarCombo(8,4);
			break;
		case 5:
			intentarCombo(4,0);
		}

	}

	private int intentarCombo(int posicionInicial, int posicionFinal) {
		System.out.println("He llegado");
		int correcto = 0;
		ArrayList<Color> comboIntento = new ArrayList<Color>();
		for (int i = posicionInicial-1; i >= posicionFinal; i--) {
			if (circulosGrandes.get(i).getColor().equals(new Color(255,255,255))) {
				JOptionPane.showMessageDialog(Stuff.lienzo, "Seleccione un color para poder Adivinar");
				return correcto;
			}
			comboIntento.add(Stuff.lienzo.getCirculoGrande().get(i).getColor());
		}
		
		for(int i = 0; i<comboIntento.size(); i++) {
			if(comboIntento.get(i).equals(Stuff.comboGanador.get(i))) {
				correcto++;
			}
		}
		
		if(correcto == 4) {
			JOptionPane.showMessageDialog(Stuff.lienzo, "Has acertado el codigo, enhorabuena");
			Stuff.ganado = true;
			Stuff.lienzoSuperior.repaint();
			//System.exit(1);
		}
		
		Stuff.ronda++;
		System.out.println(Stuff.lienzo.getCirculoGrande().get(posicionFinal-1).getColor());
		return correcto;
		
	}
	
	private  void crearCodigoAleatorio(int posicionInicial, int posicionFinal, int correcto) {
		int correctoRelleno = correcto;
		Random rnd = new Random();
		for(int i = 0; i<4; i++) {
			
		}
	}
}
