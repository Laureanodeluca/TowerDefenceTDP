package GUI;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI extends JFrame{
//-----------------------------------Atributos de Instancia-------------------------------------------------/
	//private JButton [][] mTablero;
	private JButton [] torres;
	private JPanel Tablero;
	private JPanel Botonera;
	private JPanel Monedas;
	private JLabel LabelMonedas;
	private JLabel cantMonedas;
	
//-----------------------------------Atributos de Instancia-------------------------------------------------/
	
//-----------------------Constructor------------------------------------------------------------------------/	
	public GUI() {		
		super("Tower Defense");
		inicializarGUI();
		//inicializarCeldas();
		inicializarBotoneraTorre();
		inicializarBotonesTorres();
		inicializarPanelMonedas();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 700);
		setVisible(true);
		
	/*	
		mTablero[1][1].addActionListener(new OyenteBoton());
		mTablero[1][2].addActionListener(new OyenteBoton());
	*/
	/*
		for(int i=0; i<mTablero.length; i++) {
			for(int j=0; j<mTablero[0].length; j++) {
				mTablero[i][j].addActionListener(new OyenteBoton(i, j));

			}
		}
	*/	

	}
	
//-----------------------Constructor------------------------------------------------------------------------/	

	private void inicializarGUI() {
		Color fondo = new Color(0,0,0); //color de fondo de las componentes, negro
		
		//panel de celdas
		Tablero = new JPanel();
		Tablero.setLayout(new GridLayout(6,15));
		Tablero.setBorder(new LineBorder(new Color(0, 0, 0)));
		Tablero.setBounds(0, 0, 1182, 530);
		getContentPane().add(Tablero);	
		Tablero.addMouseListener(new insertarTorre());
		
		
	}
	
	
//---------------------------BOTONES PARA COMPRAR TORRES-----------------------------------------------------/
		
	private void inicializarBotoneraTorre() {
		getContentPane().setLayout(null);		
		Botonera = new JPanel();
		Botonera.setLayout(new GridLayout(1,5));
		Botonera.setBorder(new LineBorder(new Color(0, 0, 0)));
		Botonera.setLayout(new GridLayout());
		Botonera.setBounds(0, 529, 789, 124);
		getContentPane().add(Botonera);
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

	
	private void inicializarPanelMonedas() {
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
	
	private void mostrarMonedas() {
		
	}

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
		Icon icon = new ImageIcon("src/main/resources/idle1.png");
		
		
		public void mouseClicked(MouseEvent e)
		{
			
			int x = e.getX();
			int y = e.getY();
			JLabel lab = new JLabel(icon);
			Tablero.add(lab);
			lab.setBounds(acomodarX(x,10),acomodarY(y,6),75,85);
			
		}
	}
}
//-------------------------METODO PARA INICIAR LA EJECUCION DE LA GUI---------------------------------------/



    