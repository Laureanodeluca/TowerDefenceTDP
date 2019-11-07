package GUI;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import Main.Juego;
import Personajes.*;
import Factory.*;
//import Visitor.*;
import Mapa.*;

import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

@SuppressWarnings("serial")
public class GUI extends JFrame{
//-----------------------------------Atributos de Instancia-------------------------------------------------/
	private JButton [] torres;
	private JPanel Tablero;
	private JPanel Botonera;
	private JPanel Monedas;
	private JLabel LabelMonedas;
	private JLabel cantMonedas;
	private static final int CANT_X = 10;
	private static final int CANT_Y = 6;
	private Juego j;
	private JLabel displayMonedas;
//-----------------------------------Atributos de Instancia-------------------------------------------------/
	
//-----------------------CONSTRUCTOR------------------------------------------------------------------------/	
	public GUI(Juego j) {	
		super("Tower Defense");
		this.j = j;
		setAutoRequestFocus(false);
		setForeground(Color.WHITE);
		inicializarGUI();
		inicializarBotonesTorres();
		//inicializarPanelMonedas();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 700);
		setVisible(true);
	}	

	private void inicializarGUI() {
		Tablero = new JPanel();
		Tablero.setForeground(Color.RED);
		Tablero.setOpaque(false);
		Tablero.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		Tablero.setBounds(0, 0, 1071, 516);
		Tablero.setBackground(Color.WHITE);
		getContentPane().add(Tablero);
		Tablero.setLayout(null);
		Tablero.addMouseListener(new OyenteClickTablero());

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
		LabelMonedas = new JLabel("Monedas:");
		LabelMonedas.setBounds(176, 0, 110, 37);
		Monedas.add(LabelMonedas);
		cantMonedas = new JLabel(j.getMonedas());
		cantMonedas.setBounds(176, 48, 99, 37);
    	Monedas.add(cantMonedas);
		displayMonedas = new JLabel("");
		displayMonedas.setEnabled(false);
		displayMonedas.setBounds(236, 11, 46, 14);
		Monedas.add(displayMonedas);
		
		getContentPane().setLayout(null);		

		JPanel Fondo = new JPanel();
		Fondo.setBounds(0, -10, 1182, 530);
		getContentPane().add(Fondo);
		
		JLabel Background = new JLabel("");
		Background.setIcon(new ImageIcon("src/Main/resources/Mapa.jpg"));
		Fondo.add(Background);
	}
	
//-----------------------CONSTRUCTOR------------------------------------------------------------------------/	

//-----------------------COMANDOS------------------------------------------------------------------------/	

	public int getAltoCelda() {
		return Tablero.getHeight()/6;
	}
	
	public int getAnchoCelda() {
		return Tablero.getWidth()/10;		
	}

	public JPanel getTablero(){
		return Tablero;
	}
	
	public void agregarAlTablero(JLabel l, Celda c) {
		Tablero.add(l);
		l.setBounds(c.getJ()*getAnchoCelda(), c.getI()*getAltoCelda(), getAnchoCelda(), getAltoCelda());
	}
	
	public void sacarDelTablero(JLabel l) {
		Tablero.remove(l);
		
	}
	
	public void refrescarTienda() {
		cantMonedas.setText(j.getMonedas());
	}
	
	public void juegoTerminado() {
		JOptionPane.showMessageDialog(Tablero, "PERDISTE!!!!!!1");
		
	}
//-----------------------COMANDOS------------------------------------------------------------------------/	

//---------------------------BOTONES PARA COMPRAR TORRES-----------------------------------------------------/
	private void inicializarBotonesTorres() {
		torres = new JButton[5];
		for(int i=0; i<torres.length; i++) {
			torres[i]= new JButton();
			torres[i].setBorder(new LineBorder(new Color(0,0,0)));
			torres[i].setBackground(new Color(100,100,100));
			Botonera.add(torres[i]);
		}
		
		torres[0].setText("Planta Escupe Fuego");
		torres[1].setText("MegaMan");
		torres[2].setText("Donkey Kong");
		torres[3].setText("BulletBill");	
		
		torres[0].addActionListener(new OyenteClickPEF());
		torres[1].addActionListener(new OyenteClickMM());	
		torres[2].addActionListener(new OyenteClickDK());
		torres[3].addActionListener(new OyenteClickBB());
	}	
//---------------------------BOTONES PARA COMPRAR TORRES----------------------------------------------------/
	
//---------------------------PANEL PARA VER MONEDAS---------------------------------------------------------/


//---------------------------PANEL PARA VER MONEDAS---------------------------------------------------------/
	
//---------------------------OYENTE TABLERO DE JUEGO---------------------------------------------------------/
	private class OyenteClickTablero extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			int ancho = Tablero.getWidth()/10;
			int alto = Tablero.getHeight()/6;		
			int columna = e.getX()/ancho;
			int fila = e.getY()/alto; 
			
			j.clickSobreTablero(fila, columna);
		}
	}
//---------------------------OYENTE TABLERO DE JUEGO---------------------------------------------------------/

//---------------------------OYENTE BOTONES DE TORRES---------------------------------------------------------/
	private class OyenteClickPEF implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			if(Integer.parseInt(j.getMonedas())>499) {
				j.clickSobrePEF();
				cantMonedas.setText(j.getMonedas());
			}	
			else
				System.out.println("No se puede realizar esta compra");
		}
	}
	
	private class OyenteClickMM implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			if(Integer.parseInt(j.getMonedas())>649) {
				j.clickSobreMM();	
				cantMonedas.setText(j.getMonedas());
			}	
			else
				System.out.println("No se puede realizar esta compra");
		}
	}
	
	private class OyenteClickDK implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			if(Integer.parseInt(j.getMonedas())>599) {
				j.clickSobreDK();
				cantMonedas.setText(j.getMonedas());
			}
			else
				System.out.println("No se puede realizar esta compra");
		}
	}
	
	private class OyenteClickBB implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			if(Integer.parseInt(j.getMonedas())>499) {
				j.clickSobreBB();
				cantMonedas.setText(j.getMonedas());
			}
			else
				System.out.println("No se puede realizar esta compra");
		}	
	}
//---------------------------OYENTE BOTONES DE TORRES---------------------------------------------------------/

}    