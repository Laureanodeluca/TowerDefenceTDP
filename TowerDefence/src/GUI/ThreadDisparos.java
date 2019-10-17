package GUI;

import Main.Juego;
import Personajes.Disparo;

public class ThreadDisparos extends Thread {

	private Juego juego;
	//private boolean colision;
	private GUI miGui;

	ThreadDisparos(Juego j, GUI g) {
		this.juego = j;
		miGui = g;
	}

	public void run() {
		while(true){
			try {
				Thread.sleep(256);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			for (int i = 0; (i < juego.getCantTorres()) && (juego.getTorre(i)!=null); i++)
			{
				
				Disparo d = juego.getTorre(i).atacar();
				juego.insertarDisparo(d, juego.getCantDisparos());
				
				d.getLabel().setBounds(d.getX(), d.getY(), 9, 9);
				miGui.getTablero().add(d.getLabel());
				miGui.repaint();
			}			
		}
	}
}
