package modelo;

import java.awt.Color;
import java.util.ArrayList;

import vista.Lienzo;
import vista.LienzoColores;
import vista.LienzoLateral;
import vista.LienzoSuperior;

public class Stuff {
	
	public static Lienzo lienzo = new Lienzo();
	public static LienzoSuperior lienzoSuperior = new LienzoSuperior();
	public static LienzoLateral lienzoLateral = new LienzoLateral();
	public static LienzoColores lienzoColores = new LienzoColores();
	public static ArrayList<Color> colores = new ArrayList<Color>();
	public static ArrayList<Color> comboGanador = new ArrayList<Color>();
	public static ArrayList<Color> colorLateral = new ArrayList<Color>();
	public static ArrayList<CirculoGrande> cg = new ArrayList<CirculoGrande>();
	public static ArrayList<CirculoGrande> circulosGrandes = new ArrayList<CirculoGrande>();
	public static ArrayList<CirculoPequeno> circulosPequenos = new ArrayList<CirculoPequeno>();
	public static Color colorActual = new Color(255,255,255);
	public static Color colorPintura = new Color(255,255,255);
	public static int pos = 0;
	public static int ronda = 1;
	public static int posLateral = 0;
	public static boolean ganado = false;
	public static boolean perdido = false;
	public static boolean reiniciar = false;
	public static int victoriasConsecutivas = 0;
}
