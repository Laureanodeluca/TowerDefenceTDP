package GUI;

import Main.Juego;
import Visitor.*;

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
			//System.out.println("X = "+elJuego.getEnemy().getX());
			if ((elJuego.getTorre() != null) && (elJuego.getEnemy().getX() == elJuego.getTorre().getX()))
				elJuego.getEnemy().accept(new VisitorEnemigo());
			elJuego.moverPersonaje();
			
		}
	}
}
