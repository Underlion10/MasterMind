package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

import modelo.CirculoGrande;
import modelo.Stuff;

public class AccionBoton implements ActionListener {

	private ArrayList<CirculoGrande> circulosGrandes;

	public AccionBoton(ArrayList<CirculoGrande> circulosGrandes) {
		this.circulosGrandes = circulosGrandes;
	}

	public void actionPerformed(ActionEvent e) {
		
		switch(Stuff.ronda) {
		case 1:
			intentarCombo(20,16);
			Stuff.lienzoLateral.repaint();
			break;
		case 2:
			intentarCombo(16,12);
			Stuff.lienzoLateral.repaint();
			break;
		case 3:
			intentarCombo(12,8);
			Stuff.lienzoLateral.repaint();
			break;
		case 4:
			intentarCombo(8,4);
			Stuff.lienzoLateral.repaint();
			break;
		case 5:
			intentarCombo(4,0);
			Stuff.lienzoLateral.repaint();
		}

	}

	private void intentarCombo(int posicionInicial, int posicionFinal) {
		System.out.println("He llegado");
		int correcto = 0;
		ArrayList<Color> comboIntento = new ArrayList<Color>();
		for (int i = posicionInicial-1; i >= posicionFinal; i--) {
			if (circulosGrandes.get(i).getColor().equals(new Color(255,255,255))) {
				JOptionPane.showMessageDialog(Stuff.lienzo, "Seleccione un color para poder Adivinar");
				return;
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
		crearCodigoAleatorio(posicionInicial, posicionFinal, correcto);
		Stuff.posLateral = posicionFinal;
		Stuff.ronda++;
		System.out.println(Stuff.lienzo.getCirculoGrande().get(posicionFinal-1).getColor());
		
	}
	
	private  void crearCodigoAleatorio(int posicionInicial, int posicionFinal, int correcto) {
		int correctoRelleno = correcto;
		Random rnd = new Random();
		for(int i = 0; i<4; i++) {
			Stuff.colorLateral.add(new Color(255,255,255));
		}
		
		for(int i = 0; i<Stuff.colorLateral.size(); i++) {
			if(correctoRelleno > 0) {
				int num = rnd.nextInt(4);
				if(!Stuff.colorLateral.get(num).equals(new Color(0,0,0))) {
					Stuff.colorLateral.set(num, new Color(0,0,0));
					correctoRelleno--;
					continue;
				}
				i--;
			}
		}
	}
}
