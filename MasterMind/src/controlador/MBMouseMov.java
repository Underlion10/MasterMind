package controlador;

import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import modelo.Stuff;

public class MBMouseMov implements MouseMotionListener{

	public void mouseDragged(MouseEvent e) {
		
	}

	public void mouseMoved(MouseEvent e) {
		if (Stuff.ronda == 1) {
			if (e.getY() >= 425 && e.getY() <= 475) {
				if (e.getX() >= 25 && e.getX() <= 75) {
					Stuff.lienzo.setCursor(new Cursor(Cursor.HAND_CURSOR));
					return;
				} else if (e.getX() >= 125 && e.getX() <= 175) {
					Stuff.lienzo.setCursor(new Cursor(Cursor.HAND_CURSOR));
					return;
				} else if (e.getX() >= 225 && e.getX() <= 275) {
					Stuff.lienzo.setCursor(new Cursor(Cursor.HAND_CURSOR));
					return;
				} else if (e.getX() >= 325 && e.getX() <= 375) {
					Stuff.lienzo.setCursor(new Cursor(Cursor.HAND_CURSOR));
					return;
				}
				Stuff.lienzo.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				return;
			}
			Stuff.lienzo.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			return;
		} else if (Stuff.ronda == 2) {
			if (e.getX() >= 425 && e.getX() <= 475) {
				if (e.getY() >= 25 && e.getY() <= 75) {
					Stuff.lienzo.setCursor(new Cursor(Cursor.HAND_CURSOR));
					return;
				} else if (e.getY() >= 125 && e.getY() <= 175) {
					Stuff.lienzo.setCursor(new Cursor(Cursor.HAND_CURSOR));
					return;
				} else if (e.getY() >= 225 && e.getY() <= 275) {
					Stuff.lienzo.setCursor(new Cursor(Cursor.HAND_CURSOR));
					return;
				} else if (e.getY() >= 325 && e.getY() <= 375) {
					Stuff.lienzo.setCursor(new Cursor(Cursor.HAND_CURSOR));
					return;
				}
				Stuff.lienzo.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				return;
			}
			Stuff.lienzo.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			return;
		} else if (Stuff.ronda == 3) {
			if (e.getX() >= 425 && e.getX() <= 475) {
				if (e.getY() >= 25 && e.getY() <= 75) {
					Stuff.lienzo.setCursor(new Cursor(Cursor.HAND_CURSOR));
					return;
				} else if (e.getY() >= 125 && e.getY() <= 175) {
					Stuff.lienzo.setCursor(new Cursor(Cursor.HAND_CURSOR));
					return;
				} else if (e.getY() >= 225 && e.getY() <= 275) {
					Stuff.lienzo.setCursor(new Cursor(Cursor.HAND_CURSOR));
					return;
				} else if (e.getY() >= 325 && e.getY() <= 375) {
					Stuff.lienzo.setCursor(new Cursor(Cursor.HAND_CURSOR));
					return;
				}
				Stuff.lienzo.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				return;
			}
			Stuff.lienzo.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			return;
		} else if (Stuff.ronda == 4) {
			if (e.getX() >= 425 && e.getX() <= 475) {
				if (e.getY() >= 25 && e.getY() <= 75) {
					Stuff.lienzo.setCursor(new Cursor(Cursor.HAND_CURSOR));
					return;
				} else if (e.getY() >= 125 && e.getY() <= 175) {
					Stuff.lienzo.setCursor(new Cursor(Cursor.HAND_CURSOR));
					return;
				} else if (e.getY() >= 225 && e.getY() <= 275) {
					Stuff.lienzo.setCursor(new Cursor(Cursor.HAND_CURSOR));
					return;
				} else if (e.getY() >= 325 && e.getY() <= 375) {
					Stuff.lienzo.setCursor(new Cursor(Cursor.HAND_CURSOR));
					return;
				}
				Stuff.lienzo.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				return;
			}
			Stuff.lienzo.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			return;
		} else if (Stuff.ronda == 5) {
			if (e.getX() >= 425 && e.getX() <= 475) {
				if (e.getY() >= 25 && e.getY() <= 75) {
					Stuff.lienzo.setCursor(new Cursor(Cursor.HAND_CURSOR));
					return;
				} else if (e.getY() >= 125 && e.getY() <= 175) {
					Stuff.lienzo.setCursor(new Cursor(Cursor.HAND_CURSOR));
					return;
				} else if (e.getY() >= 225 && e.getY() <= 275) {
					Stuff.lienzo.setCursor(new Cursor(Cursor.HAND_CURSOR));
					return;
				} else if (e.getY() >= 325 && e.getY() <= 375) {
					Stuff.lienzo.setCursor(new Cursor(Cursor.HAND_CURSOR));
					return;
				}
				Stuff.lienzo.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				return;
			}
			Stuff.lienzo.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			return;
		}
	}

}
