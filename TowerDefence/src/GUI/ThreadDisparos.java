package GUI;
import Main.Juego;
import Mapa.Mapa;
import Personajes.*;
import java.util.*;

public class ThreadDisparos extends Thread {
	private Juego juego;
	private Mapa mapa;
	private Random random;
	public ThreadDisparos(Juego j) {
		this.juego = j;
		mapa= j.getMapa();
		random = new Random();
	}

	public void prueba() {}
	public void run() {
		while(true && juego.getEstado()){
			try {
				Thread.sleep(200);
				mapa.getTorres();
				int rdm = random.nextInt(6); 
				if(rdm % 2 ==0 && mapa.getEnemigos().size()!=0) {
					for(Torre t : mapa.getTorres()) {
						mapa.agregarDisparo(t.atacar());
					}
					rdm = random.nextInt(6);
				}
				juego.getMapa().moverDisparos();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
