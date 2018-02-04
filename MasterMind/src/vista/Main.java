package vista;

import javax.swing.JOptionPane;

public class Main {
	
	Main main = new Main();
	
	public static void main(String[] args) {
		Ventana ventana = new Ventana();
		ventana.setVisible(true);
		JOptionPane.showMessageDialog(null, "Holi", "Bienvenido a MasterMind", JOptionPane.INFORMATION_MESSAGE);
	}

}
