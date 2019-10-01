package GUI;

import Main.Juego;

public class ContadorTiempo extends Thread {

	private Juego elJuego;

	ContadorTiempo(Juego j) {
		this.elJuego = j;
	}

	public void run() {
		while(true){
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			elJuego.moverPersonaje ();
		}
	}
}
