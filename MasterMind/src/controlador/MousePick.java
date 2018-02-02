package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import modelo.Stuff;

public class MousePick implements MouseListener{

	public void mouseClicked(MouseEvent e) {
		if(e.getX() >= 25 && e.getX() <= 75) {
			if(e.getY() >= 25 && e.getY() <= 75) {
				Stuff.colorActual = Stuff.colores.get(0);
				System.out.println("rojo");
			} else if(e.getY() >= 125 && e.getY() <= 175) {
				Stuff.colorActual = Stuff.colores.get(1);
				System.out.println("verde");
			} else if(e.getY() >= 225 && e.getY() <= 275) {
				Stuff.colorActual = Stuff.colores.get(2);
				System.out.println("azul");
			} else if(e.getY() >= 325 && e.getY() <= 375) {
				Stuff.colorActual = Stuff.colores.get(3);
				System.out.println("amarillo");
			}
		}
	}

	public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {
		
	}

	public void mousePressed(MouseEvent e) {
		
	}

	public void mouseReleased(MouseEvent e) {
		
	}

}
