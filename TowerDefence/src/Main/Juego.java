package Main;

import java.awt.EventQueue;
import java.util.ArrayList;

import GUI.ContadorTiempo;
import GUI.GUI;
import GUI.ThreadDisparos;
import Mapa.Mapa;
import Nivel.*;
import Personajes.*;

public class Juego {
	private GUI gui;
	private ThreadDisparos threadDisparo;
	private Thread tiempo;
	private Mapa mapa;
    protected Nivel nivel;
    protected Torre ultimoComprado;
    protected int tienda; 

	private Juego() {
		tienda=2500;
		gui = new GUI(this);
		gui.setVisible(true);
		mapa = new Mapa(this);
		tiempo = new ContadorTiempo(this);
		threadDisparo = new ThreadDisparos(this);
		tiempo.start();
		nivel = new NivelUno(mapa);	
		threadDisparo.start();
	}
	
	public Nivel getNivel() {
		return nivel;
	}
	
	public void insertarEnemigo() {
		Enemigo e = nivel.getNextEnemigo();
		if (e != null)
			mapa.agregarEnemigo(e);
		
	}
	
	
	
	
	// ---------------------------METODO PARA INICIAR LA EJECUCION DE LA GUI-------------------------------------/
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Juego();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	// ---------------------------METODO PARA INICIAR LA EJECUCION DE LA GUI-------------------------------------/

	public Mapa getMapa() {
		return mapa;
	}
	
	public GUI getGUI() {
		return gui;
	}
	
	public String getMonedas() {
		return Integer.toString(tienda);
	}
	
	public void setMonedas(int m) {
		tienda = tienda + m;
	}
	
	public void clickSobreTablero(int fila, int columna) {
		if(ultimoComprado!=null) {
			mapa.agregarPersonaje(ultimoComprado, fila, columna);
			ultimoComprado=null;
		}
	}

	public void clickSobrePEF() {
		ultimoComprado = new PlantaEscupeFuego();
		tienda = tienda-ultimoComprado.getPrecio();
	}
	
	public void clickSobreMM() {
		ultimoComprado = new MegaMan();
		tienda = tienda-ultimoComprado.getPrecio();
	}
	
	public void clickSobreDK() {
		ultimoComprado = new DonkeyKong();
		tienda = tienda-ultimoComprado.getPrecio();
	}
	
	public void clickSobreBB() {
		ultimoComprado = new BulletBill();
		tienda = tienda-ultimoComprado.getPrecio();
	}

}