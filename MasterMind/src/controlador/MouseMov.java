package controlador;

import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import modelo.Stuff;

public class MouseMov implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		if(e.getX() >= 25 && e.getX() <= 75) {
			if(e.getY() >= 25 && e.getY() <= 75) {
				Stuff.lienzoColores.setCursor(new Cursor(Cursor.HAND_CURSOR));
				return;
			} else if(e.getY() >= 125 && e.getY() <= 175) {
				Stuff.lienzoColores.setCursor(new Cursor(Cursor.HAND_CURSOR));
				return;
			} else if(e.getY() >= 225 && e.getY() <= 275) {
				Stuff.lienzoColores.setCursor(new Cursor(Cursor.HAND_CURSOR));
				return;
			} else if(e.getY() >= 325 && e.getY() <= 375) {
				Stuff.lienzoColores.setCursor(new Cursor(Cursor.HAND_CURSOR));
				return;
			}
			Stuff.lienzoColores.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			return;
		}
		Stuff.lienzoColores.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		
	}

}
