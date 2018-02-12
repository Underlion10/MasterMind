package vista;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Ventana ventana = new Ventana();
		ventana.setVisible(true);
		JOptionPane.showMessageDialog(null,
				"Espero que disfrutes de este pequeño juego que tengo preparado para ti.\nBueno, vamos al grano, tienes que adivinar el código misterioso, en la parte superior.\nTienes cinco intentos para adivinarlo, los puntos que ves a la derecha te señalarán\n el número de aciertos, pero no te fijes mucho porque el orden de los puntos\n no importa. Tras todo esto: \n                                                                SUERTE",
				"Bienvenido a MasterMind", JOptionPane.INFORMATION_MESSAGE);
	}
}
