package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import modelo.Stuff;

public class MainBoardMouse implements MouseListener {

	public void mouseClicked(MouseEvent e) {
		if (Stuff.ronda == 1) {
			if (e.getY() >= 425 && e.getY() <= 475) {
				if (e.getX() >= 25 && e.getX() <= 75) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 1;
					Stuff.lienzo.repaint();
				} else if (e.getX() >= 125 && e.getX() <= 175) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 2;
					Stuff.lienzo.repaint();
				} else if (e.getX() >= 225 && e.getX() <= 275) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 3;
					Stuff.lienzo.repaint();
				} else if (e.getX() >= 325 && e.getX() <= 375) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 4;
					Stuff.lienzo.repaint();
				}
			}
		} else if (Stuff.ronda == 2) {
			if (e.getY() >= 425 && e.getY() <= 475) {
				if (e.getX() >= 25 && e.getX() <= 75) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 5;
				} else if (e.getX() >= 125 && e.getX() <= 175) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 6;
				} else if (e.getX() >= 225 && e.getX() <= 275) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 7;
				} else if (e.getX() >= 325 && e.getX() <= 375) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 8;
				}
			}
		} else if (Stuff.ronda == 3) {
			if (e.getY() >= 425 && e.getY() <= 475) {
				if (e.getX() >= 25 && e.getX() <= 75) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 9;
				} else if (e.getX() >= 125 && e.getX() <= 175) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 10;
				} else if (e.getX() >= 225 && e.getX() <= 275) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 11;
				} else if (e.getX() >= 325 && e.getX() <= 375) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 12;
				}
			}
		} else if (Stuff.ronda == 4) {
			if (e.getY() >= 425 && e.getY() <= 475) {
				if (e.getX() >= 25 && e.getX() <= 75) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 13;
				} else if (e.getX() >= 125 && e.getX() <= 175) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 14;
				} else if (e.getX() >= 225 && e.getX() <= 275) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 15;
				} else if (e.getX() >= 325 && e.getX() <= 375) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 16;
				}
			}
		} else if (Stuff.ronda == 5) {
			if (e.getY() >= 425 && e.getY() <= 475) {
				if (e.getX() >= 25 && e.getX() <= 75) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 17;
				} else if (e.getX() >= 125 && e.getX() <= 175) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 18;
				} else if (e.getX() >= 225 && e.getX() <= 275) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 19;
				} else if (e.getX() >= 325 && e.getX() <= 375) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 20;
				}
			}
		}
		System.out.println(e.getX() + " " + e.getY());
		System.out.println(Stuff.pos);
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
