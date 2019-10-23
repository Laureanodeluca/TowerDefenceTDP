package GUI;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import Enemigos.*;
import Main.Juego;
import Personajes.*;
//import Visitor.*;

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
	private Juego j;
	private ContadorTiempo tiempo;
	private ThreadDisparos threadDisparo;
	private JLabel displayMonedas;
	private FactoryPersonajes f;
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
		
		j = new Juego(this);
		tiempo = new ContadorTiempo(j);
		threadDisparo = new ThreadDisparos(j, this);
		insertarEnemigo();
		tiempo.start();
		threadDisparo.start();
	}
	
	public JPanel getTablero()
	{
		return Tablero;
	}
	
	public void insertarEnemigo()
	{
		Goomba en = (Goomba) j.getEnemy();
		en.getLabel().setBounds(acomodarX(en.getX(),CANT_X),acomodarY(en.getY(),CANT_Y),75,85);
		Tablero.add(en.getLabel());
	}
	
	
	
		
//-----------------------Constructor------------------------------------------------------------------------/	

	private void inicializarGUI() {
		Tablero = new JPanel();
		Tablero.setForeground(Color.RED);
		Tablero.setOpaque(false);
		Tablero.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		Tablero.setBounds(97, 49, 1071, 393);
		Tablero.setBackground(Color.WHITE);
		getContentPane().add(Tablero);
		Tablero.setLayout(null);
		Tablero.addMouseListener(new insertarTorre());
		//Tablero.addMouseListener(new eliminarEnemigo());
		Tablero.addMouseListener(new eliminarTorre());
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
			LabelMonedas = new JLabel("Monedas:");
			LabelMonedas.setBounds(176, 0, 110, 37);
			Monedas.add(LabelMonedas);
		}
		{
			cantMonedas = new JLabel("New label");
			cantMonedas.setBounds(176, 48, 99, 37);
			Monedas.add(cantMonedas);
		}
		
		displayMonedas = new JLabel("0");
		displayMonedas.setEnabled(false);
		displayMonedas.setBounds(236, 11, 46, 14);
		Monedas.add(displayMonedas);
	}
	
	
	
//---------------------------BOTONES PARA COMPRAR TORRES-----------------------------------------------------/
		
	private void inicializarBotoneraTorre() {
		getContentPane().setLayout(null);		
		
		JPanel Fondo = new JPanel();
		Fondo.setBounds(0, -10, 1182, 530);
		getContentPane().add(Fondo);
		
		JLabel Background = new JLabel("");
		Background.setIcon(new ImageIcon("src/Main/resources/Mapa.jpg"));
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
	
	public int acomodarX(int x, int ancho)
	{
		int anchoCelda = Tablero.getWidth()/ancho;
		int posX = x/anchoCelda;
		posX = posX*anchoCelda + anchoCelda/2;
		return posX-anchoCelda/2;
	}
	
	public int acomodarY(int y, int largo)
	{
		int largoCelda = Tablero.getHeight()/largo;
		int posY = y/largoCelda;
		posY = posY*largoCelda + largoCelda/2;
		return (posY-largoCelda/2);
	}
	
	class insertarTorre extends MouseAdapter
	{				
		public void mouseClicked(MouseEvent e)
		{
			if (e.getButton() == MouseEvent.BUTTON1)
			{
				f= new FabricaPersonaje();
				Personaje plant = f.BulletBill(acomodarX(e.getX(), CANT_X),acomodarY(e.getY(), CANT_Y), j.getCantTorres());
				j.insertarTorre(plant);
				plant.getLabel().setBounds(plant.getX(),plant.getY(),75,85);
				Tablero.add(plant.getLabel());
				Tablero.repaint();
			}
			
		}
	}
	
	/**
	class eliminarEnemigo extends MouseAdapter
	{
		public void mouseClicked(MouseEvent e)
		{
			if(e.getButton() == MouseEvent.BUTTON3)
			{
				int cantMonedas = Integer.parseInt(displayMonedas.getText());
				cantMonedas = cantMonedas + j.getEnemy().getMonedas();
				displayMonedas.setText(""+cantMonedas);
				j.killCharacter();
			}
		}
	}**/
	
	class eliminarTorre extends MouseAdapter
	{
		public void mouseClicked(MouseEvent e)
		{
			if(e.getButton() == MouseEvent.BUTTON3)
			{
				j.getTorre(j.getCantTorres()-1).cambiarLabel(null);
				//j.getTorre(j.getCantTorres()-1).setLabel(null);
				j.killTower(j.getCantTorres()-1);
				Tablero.repaint();
			}
		}
	}
}    