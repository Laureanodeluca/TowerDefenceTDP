package GUI;

import Disparos.Disparo;
import Main.Juego;
import Mapa.Mapa;
import Personajes.*;

public class ThreadDisparos extends Thread {
	private Juego juego;
	private Mapa mapa;
	public ThreadDisparos(Juego j) {
		this.juego = j;
		mapa= j.getMapa();
	}

	public void run() {
		while(true){
			try {
				Thread.sleep(200);
				mapa.getTorres();
				for(Torre t : mapa.getTorres()) {
					mapa.agregarDisparo(t.atacar());
				}
				juego.getMapa().moverDisparos();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
