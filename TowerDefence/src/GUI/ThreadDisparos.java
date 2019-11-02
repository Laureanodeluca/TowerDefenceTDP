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
				Thread.sleep(100);
				mapa.getTorres();
				for(Torre t : mapa.getTorres()) {
					mapa.agregarDisparo(t.atacar());
				}
				juego.getMapa().moverDisparos();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			/*for (int i = 0; (i < juego.getCantTorres()) && (juego.getTorre(i)!=null); i++)
			{
				
				Disparo d = juego.getTorre(i).atacar();
				if (d != null)
				{
					juego.insertarDisparo(d, juego.getCantDisparos());
					
					d.getLabel().setBounds(d.getX(), d.getY(), 21, 21);
					miGui.getTablero().add(d.getLabel());
					miGui.repaint();
				}
			}		*/	
		}
	}
}
