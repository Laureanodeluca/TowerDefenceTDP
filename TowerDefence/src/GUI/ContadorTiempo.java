package GUI;

import Main.Juego;
import Visitor.*;

public class ContadorTiempo extends Thread {

	private Juego juego;
	private final int NUM_TANDAS = 3;
	private final int VELOCIDAD = 1000; //en milis

	public ContadorTiempo(Juego j) {
		this.juego = j;
		
	}

	public void run() {
	
		try {
			int tandaActual =0;
			
			while(tandaActual<NUM_TANDAS) {
				int sizeoleada=0;
				while(sizeoleada<5) {
					Thread.sleep(VELOCIDAD);
					juego.getMapa().moverEnemigos();
					juego.insertarEnemigo();
					sizeoleada++;
				}
				int descanso=0;
				while(descanso<5) {
					Thread.sleep(VELOCIDAD);
					juego.getMapa().moverEnemigos();
					descanso++;
				}
				
				tandaActual++;
			}
			
			
	
			
		} catch (InterruptedException exc) {
			exc.printStackTrace();
		}
		juego.getMapa().moverEnemigos();

		
		//juego.getMapa().moverEnemigos();
		//juego.insertarEnemigo();
	}
}
