package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import modelo.CirculoGrande;
import modelo.Stuff;

public class AccionBoton implements ActionListener {

	private ArrayList<CirculoGrande> circulosGrandes;

	public AccionBoton(ArrayList<CirculoGrande> circulosGrandes) {
		this.circulosGrandes = circulosGrandes;
	}

	public void actionPerformed(ActionEvent e) {

		switch (Stuff.ronda) {
		case 1:
			intentarCombo(20, 16);
			Stuff.lienzoLateral.repaint();
			break;
		case 2:
			intentarCombo(16, 12);
			Stuff.lienzoLateral.repaint();
			break;
		case 3:
			intentarCombo(12, 8);
			Stuff.lienzoLateral.repaint();
			break;
		case 4:
			intentarCombo(8, 4);
			Stuff.lienzoLateral.repaint();
			break;
		case 5:
			intentarCombo(4, 0);
			Stuff.lienzoLateral.repaint();
			break;
		}

	}

	private void intentarCombo(int posicionInicial, int posicionFinal) {
		System.out.println("He llegado");
		int correcto = 0;
		int correctoColor = 0;
		ArrayList<Color> comboIntento = new ArrayList<Color>();
		for (int i = posicionInicial - 1; i >= posicionFinal; i--) {
			if (circulosGrandes.get(i).getColor().equals(new Color(255, 255, 255))) {
				if (Stuff.ganado) {
					JOptionPane.showMessageDialog(Stuff.lienzo, "Para volver a jugar, pulse \"Jugar de nuevo\"");
					Stuff.ganado = true;
					return;
				}
				JOptionPane.showMessageDialog(Stuff.lienzo, "Seleccione un color para poder Adivinar");
				return;
			}
			comboIntento.add(Stuff.lienzo.getCirculoGrande().get(i).getColor());
		}

		int contadorRojo = 0;
		int contadorVerde = 0;
		int contadorAzul = 0;
		int contadorAmarillo = 0;
		int numCodR = 0;
		int numCodV = 0;
		int numCodA = 0; 
		int numCodAma = 0;
		int correctoColorRojo = 0;
		int correctoColorVerde = 0;
		int correctoColorAzul = 0;
		int correctoColorAmarillo = 0;

		for (int i = 0; i < Stuff.comboGanador.size(); i++) {
			if (Stuff.comboGanador.get(i).equals(new Color(255, 0, 0))) {
				numCodR++;
			} else if (Stuff.comboGanador.get(i).equals(new Color(0, 255, 0))) {
				numCodV++;
			} else if (Stuff.comboGanador.get(i).equals(new Color(0, 0, 255))) {
				numCodA++;
			} else if (Stuff.comboGanador.get(i).equals(new Color(255, 243, 0))) {
				numCodAma++;
			}
		}

		for (int i = 0; i < Stuff.comboGanador.size(); i++) {
			if (comboIntento.get(i).equals(Stuff.comboGanador.get(i))) {
				if (comboIntento.get(i).equals(new Color(255, 0, 0))) {
					contadorRojo++;
				} else if (comboIntento.get(i).equals(new Color(0, 255, 0))) {
					contadorVerde++;
				} else if (comboIntento.get(i).equals(new Color(0, 0, 255))) {
					contadorAzul++;
				} else if (comboIntento.get(i).equals(new Color(255, 243, 0))) {
					contadorAmarillo++;
				}
			}
		}

		int[] contador = { contadorRojo, contadorVerde, contadorAzul, contadorAmarillo };

		for (int i = 0; i < Stuff.comboGanador.size(); i++) {
			for (int j = 0; j < Stuff.comboGanador.size(); j++) {
				if (comboIntento.get(i).equals(Stuff.comboGanador.get(j))) {
					if (comboIntento.get(i).equals(new Color(255, 0, 0)) && correctoColorRojo < numCodR) {
						correctoColorRojo++;
					} else if (comboIntento.get(i).equals(new Color(0, 255, 0)) && correctoColorVerde < numCodV) {
						correctoColorVerde++;
					} else if (comboIntento.get(i).equals(new Color(0, 0, 255)) && correctoColorAzul < numCodA) {
						correctoColorAzul++;
					} else if (comboIntento.get(i).equals(new Color(255, 243, 0)) && correctoColorAmarillo < numCodAma) {
						correctoColorAmarillo++;
					}
					break;
				}
			}
		}

		int[] contadorColor = { correctoColorRojo - contadorRojo, correctoColorVerde - contadorVerde,
				correctoColorAzul - contadorAzul, correctoColorAmarillo - contadorAmarillo };

		for (int i = 0; i < contadorColor.length; i++) {
			correcto += contador[i];
			correctoColor += contadorColor[i];
		}

		System.out.println("Correctas: " + correcto + "CorrectoColor: " + correctoColor);

		if (correcto == 4) {
			JOptionPane.showMessageDialog(Stuff.lienzo, "Has acertado el codigo, enhorabuena");
			Stuff.ganado = true;
			System.out.println(Stuff.victoriasConsecutivas);
			correctoColor = 0;
			Stuff.victoriasConsecutivas++;
			Stuff.lienzoSuperior.repaint();
			if (Stuff.victoriasConsecutivas == 3) {
				ImageIcon onfire = new ImageIcon(getClass().getResource("/modelo/recursos/fuego.gif"));
				JOptionPane.showMessageDialog(Stuff.lienzo, "", "ON FIRE - TRES VICTORIAS CONSECUTIVAS !!!",
						JOptionPane.PLAIN_MESSAGE, onfire);
			}
		} else if (Stuff.ronda == 5) {
			JOptionPane.showMessageDialog(Stuff.lienzo, "Has perdido, suerte la próxima vez.");
			Stuff.perdido = true;
			Stuff.victoriasConsecutivas = 0;
		}

		crearCodigoAleatorio(posicionInicial, posicionFinal, correcto, correctoColor);
		Stuff.posLateral = posicionFinal;
		Stuff.ronda++;
		System.out.println(Stuff.lienzo.getCirculoGrande().get(posicionFinal).getColor());
	}

	private void crearCodigoAleatorio(int posicionInicial, int posicionFinal, int correcto, int correctoColor) {
		int correctoRelleno = correcto;
		int correctoColorRelleno = correctoColor;
		if (correctoColorRelleno + correctoRelleno > 4) {
			correctoColorRelleno--;
		}
		Random rnd = new Random();
		for (int i = 0; i < 4; i++) {
			Stuff.colorLateral.add(new Color(255, 255, 255));
		}

		for (int i = 0; i < Stuff.colorLateral.size(); i++) {
			if (correctoRelleno > 0) {
				int num = rnd.nextInt(4);
				if (!Stuff.colorLateral.get(num).equals(new Color(0, 0, 0))) {
					Stuff.colorLateral.set(num, new Color(0, 0, 0));
					correctoRelleno--;
					continue;
				}
				i--;
			}
		}

		for (int i = 0; i < Stuff.colorLateral.size(); i++) {
			if (correctoColorRelleno > 0) {
				int num = rnd.nextInt(4);
				if (!Stuff.colorLateral.get(num).equals(new Color(0, 0, 0))
						&& !Stuff.colorLateral.get(num).equals(new Color(255, 0, 0))) {
					Stuff.colorLateral.set(num, new Color(255, 0, 0));
					correctoColorRelleno--;
					continue;
				}
				i--;
			}
		}
	}
}
