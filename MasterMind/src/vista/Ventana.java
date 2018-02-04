package vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controlador.AccionBoton;
import controlador.MBMouseMov;
import controlador.MainBoardMouse;
import controlador.MouseMov;
import controlador.MousePick;
import controlador.ReiBoton;
import modelo.Stuff;

public class Ventana extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4601737718372115147L;
	
	Image icono = new ImageIcon(getClass().getResource("/modelo/recursos/IconoMasterMind.png")).getImage();

	public Ventana() {
		super("MasterMind");
		setSize(600,600);
		setIconImage(icono);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cn = getContentPane();
		cn.setLayout(new GridLayout());
		JPanel panelContenedor = new JPanel();
		JPanel panelBot = new JPanel();
		panelBot.setLayout(new FlowLayout());
		JButton botonEnv = new JButton("Adivinar");
		JButton botonRei = new JButton("Reintentar");
		botonRei.setToolTipText("Reinicia el tablero, cambiando el código misterioso");
		botonEnv.setBounds(150, 25, 175, 50);
		botonRei.setBounds(150,25,175,50);
		panelBot.add(botonEnv);
		panelBot.add(botonRei);
		panelContenedor.setLayout(new BorderLayout());
		Stuff.lienzoColores.rellenarColores();
		Stuff.lienzoColores.addMouseListener(new MousePick());
		Stuff.lienzoColores.addMouseMotionListener(new MouseMov());
		Stuff.lienzoSuperior.crearComboGanador();
		Stuff.lienzo.addMouseListener(new MainBoardMouse());
		Stuff.lienzo.addMouseMotionListener(new MBMouseMov());
		botonEnv.addActionListener(new AccionBoton(Stuff.lienzo.getCirculoGrande()));
		botonRei.addActionListener(new ReiBoton());
		panelContenedor.add(Stuff.lienzoSuperior, BorderLayout.NORTH);
		panelContenedor.add(Stuff.lienzo, BorderLayout.CENTER);
		panelContenedor.add(Stuff.lienzoLateral, BorderLayout.EAST);
		panelContenedor.add(Stuff.lienzoColores, BorderLayout.WEST);
		panelContenedor.add(panelBot, BorderLayout.SOUTH);
		cn.add(panelContenedor);
		pack();
		validate();
	}

}
