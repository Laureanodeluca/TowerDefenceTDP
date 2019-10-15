package GUI;

import Main.Juego;
import Visitor.*;

public class ThreadDisparos extends Thread {

	private Juego juego;
	private boolean colision;

	ThreadDisparos(Juego j) {
		this.juego = j;
	}

	public void run() {
		while(true){
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			for (int i = 0; (i < juego.getCantTorres()) && (juego.getTorre(i)!=null); i++)
			{
				juego.getTorre(i).atacar();
				System.out.println("Disparo generado.");
			}
			
		}
	}
}
