package GUI;

import Main.Juego;
import Visitor.*;

public class ContadorTiempo extends Thread {

	private Juego elJuego;
	private boolean colision;

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
			colision = false;
			for (int i = 0; i < elJuego.getCantTorres(); i++)
			{
				if ((elJuego.getTorre(i) != null) && (elJuego.getEnemy().getX() == elJuego.getTorre(i).getX()) && (elJuego.getEnemy().getY() == elJuego.getTorre(i).getY()))
				{
					colision = true;
					elJuego.getEnemy().accept(new VisitorColisiones());
				}
			}
			if (!colision)
			{
				elJuego.getEnemy().accept(new VisitorContinuarMovimiento());
			}
			elJuego.moverPersonaje();
			
		}
	}
}
