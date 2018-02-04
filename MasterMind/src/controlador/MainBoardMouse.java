package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

import modelo.Stuff;

public class MainBoardMouse implements MouseListener {

	public void mouseClicked(MouseEvent e) {
		if (Stuff.ronda == 1 && !Stuff.ganado && !Stuff.perdido) {
			if (e.getY() >= 425 && e.getY() <= 475) {
				if (e.getX() >= 25 && e.getX() <= 75) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 17;
					Stuff.lienzo.repaint();
				} else if (e.getX() >= 125 && e.getX() <= 175) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 18;
					Stuff.lienzo.repaint();
				} else if (e.getX() >= 225 && e.getX() <= 275) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 19;
					Stuff.lienzo.repaint();
				} else if (e.getX() >= 325 && e.getX() <= 375) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 20;
					Stuff.lienzo.repaint();
				}
			}
		} else if (Stuff.ronda == 2 && !Stuff.ganado && !Stuff.perdido) {
			if (e.getY() >= 325 && e.getY() <= 375) {
				if (e.getX() >= 25 && e.getX() <= 75) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 13;
					Stuff.lienzo.repaint();
				} else if (e.getX() >= 125 && e.getX() <= 175) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 14;
					Stuff.lienzo.repaint();
				} else if (e.getX() >= 225 && e.getX() <= 275) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 15;
					Stuff.lienzo.repaint();
				} else if (e.getX() >= 325 && e.getX() <= 375) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 16;
					Stuff.lienzo.repaint();
				}
			}
		} else if (Stuff.ronda == 3 && !Stuff.ganado && !Stuff.perdido) {
			if (e.getY() >= 225 && e.getY() <= 275) {
				if (e.getX() >= 25 && e.getX() <= 75) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 9;
					Stuff.lienzo.repaint();
				} else if (e.getX() >= 125 && e.getX() <= 175) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 10;
					Stuff.lienzo.repaint();
				} else if (e.getX() >= 225 && e.getX() <= 275) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 11;
					Stuff.lienzo.repaint();
				} else if (e.getX() >= 325 && e.getX() <= 375) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 12;
					Stuff.lienzo.repaint();
				}
			}
		} else if (Stuff.ronda == 4 && !Stuff.ganado && !Stuff.perdido) {
			if (e.getY() >= 125 && e.getY() <= 175) {
				if (e.getX() >= 25 && e.getX() <= 75) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 5;
					Stuff.lienzo.repaint();
				} else if (e.getX() >= 125 && e.getX() <= 175) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 6;
					Stuff.lienzo.repaint();
				} else if (e.getX() >= 225 && e.getX() <= 275) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 7;
					Stuff.lienzo.repaint();
				} else if (e.getX() >= 325 && e.getX() <= 375) {
					Stuff.colorPintura = Stuff.colorActual;
					Stuff.pos = 8;
					Stuff.lienzo.repaint();
				}
			}
		} else if (Stuff.ronda == 5 && !Stuff.ganado && !Stuff.perdido) {
			if (e.getY() >= 25 && e.getY() <= 75) {
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
		}
		
		if(Stuff.victoriasConsecutivas == 3) {
			JOptionPane.showMessageDialog(Stuff.lienzo, "ON FIRE", "Tres vistorias consecutivas", JOptionPane.ERROR_MESSAGE);
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
