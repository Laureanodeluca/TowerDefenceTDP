package GUI;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import Objetos.GameObject;
import Personajes.PlantaEscupeFuego;

import java.awt.Color;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class GUI extends JFrame{
//-----------------------------------Atributos de Instancia-------------------------------------------------/
	//private JButton [][] mTablero;
	private JButton [] torres;
	private JPanel Tablero;
	private JPanel Botonera;
	private JPanel Monedas;
	private JLabel LabelMonedas;
	private JLabel cantMonedas;
	private static final int CANT_X = 10;
	private static final int CANT_Y = 6;
//-----------------------------------Atributos de Instancia-------------------------------------------------/
	
//-----------------------Constructor------------------------------------------------------------------------/	
	public GUI() {		
		super("Tower Defense");
		setAutoRequestFocus(false);
		setForeground(Color.WHITE);
		inicializarGUI();
		inicializarBotoneraTorre();
		inicializarBotonesTorres();
		//inicializarPanelMonedas();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 700);
		setVisible(true);
	}
		
//-----------------------Constructor------------------------------------------------------------------------/	

	private void inicializarGUI() {
		Tablero = new JPanel();
		Tablero.setOpaque(false);
		Tablero.setBorder(new LineBorder(new Color(0, 0, 0)));
		Tablero.setBounds(0, 0, 1182, 530);
		Tablero.setBackground(Color.WHITE);
		getContentPane().add(Tablero);
		Tablero.setLayout(null);
		Tablero.addMouseListener(new insertarTorre());
		Botonera = new JPanel();
		Botonera.setLayout(new GridLayout(1,5));
		Botonera.setBorder(new LineBorder(new Color(0, 0, 0)));
		Botonera.setLayout(new GridLayout());
		Botonera.setBounds(0, 529, 789, 124);
		getContentPane().add(Botonera);
		Monedas = new JPanel();
		Monedas.setBorder(new LineBorder(new Color(0, 0, 0)));
		Monedas.setBounds(789, 529, 393, 124);
		getContentPane().add(Monedas);
		Monedas.setLayout(null);
		{
			LabelMonedas = new JLabel("Monedas Disponibles:");
			LabelMonedas.setBounds(244, 0, 149, 37);
			Monedas.add(LabelMonedas);
		}
		{
			cantMonedas = new JLabel("New label");
			cantMonedas.setBounds(244, 37, 99, 37);
			Monedas.add(cantMonedas);
		}
	}
	
	
	
//---------------------------BOTONES PARA COMPRAR TORRES-----------------------------------------------------/
		
	private void inicializarBotoneraTorre() {
		getContentPane().setLayout(null);		
		
		JPanel Fondo = new JPanel();
		Fondo.setBounds(0, -10, 1182, 530);
		getContentPane().add(Fondo);
		
		JLabel Background = new JLabel("");
		Background.setIcon(new ImageIcon("C:\\Users\\Laureano\\Documents\\GitHub\\TowerDefenceTDP\\TowerDefence\\src\\Main\\resources\\Mapa.jpg"));
		Fondo.add(Background);
	}
	
	private void inicializarBotonesTorres() {
		torres = new JButton[5];
		for(int i=0; i<torres.length; i++) {
			torres[i]= new JButton();
			torres[i].setBorder(new LineBorder(new Color(0,0,0)));
			torres[i].setBackground(new Color(100,100,100));
			torres[i].setText("Torre "+(i+1));
			Botonera.add(torres[i]);
		}
	}
		
//---------------------------BOTONES PARA COMPRAR TORRES----------------------------------------------------/
	
//---------------------------PANEL PARA VER MONEDAS---------------------------------------------------------/

	/**
	private void inicializarPanelMonedas() {
	}
	
	private void mostrarMonedas() 
	{	
		
	}
	**/

//---------------------------PANEL PARA VER MONEDAS---------------------------------------------------------/

//---------------------------METODO PARA INICIAR LA EJECUCION DE LA GUI-------------------------------------/

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private int acomodarX(int x, int ancho)
	{
		int anchoCelda = Tablero.getWidth()/ancho;
		int posX = x/anchoCelda;
		posX = posX*anchoCelda + anchoCelda/2;
		return posX-anchoCelda/3;
	}
	
	private int acomodarY(int y, int largo)
	{
		int largoCelda = Tablero.getHeight()/largo;
		int posY = y/largoCelda;
		posY = posY*largoCelda + largoCelda/2;
		return posY-largoCelda/3;
	}
	
	class insertarTorre extends MouseAdapter
	{				
		public void mouseClicked(MouseEvent e)
		{
			GameObject plant = new PlantaEscupeFuego(e.getX(),e.getY());
			JLabel lab = new JLabel(plant.getSprite());
			Tablero.add(lab);
			lab.setBounds(acomodarX(plant.getX(),CANT_X),acomodarY(plant.getY(),CANT_Y),75,85);
			
		}
	}
}    