package GUI;

import Disparos.Disparo;
import Main.Juego;

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
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			for (int i = 0; (i < juego.getCantTorres()) && (juego.getTorre(i)!=null); i++)
			{
				
				Disparo d = juego.getTorre(i).atacar();
				if (d != null)
				{
					juego.insertarDisparo(d, juego.getCantDisparos());
					
					d.getLabel().setBounds(d.getX(), d.getY(), 21, 21);
					miGui.getTablero().add(d.getLabel());
					miGui.repaint();
				}
			}			
		}
	}
}
