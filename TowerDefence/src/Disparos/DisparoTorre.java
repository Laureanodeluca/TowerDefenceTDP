package Disparos;

import Personajes.Enemigo;
import Personajes.Personaje;
import Personajes.Torre;

public class DisparoTorre extends Disparo {

	public DisparoTorre(Personaje p) {
		super(p);
	}

	
	public void visitarTorre(Torre p) {	}

	public void visitarEnemigo(Enemigo e) {
		e.restarVida(disparador.getAtaque());
		this.setVida(false);
		System.out.println("colisiono enemigo");
		System.out.println(""+e.getVida());
		
	}
	
}