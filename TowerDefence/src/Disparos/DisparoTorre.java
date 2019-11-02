package Disparos;

import Personajes.Enemigo;
import Personajes.Personaje;
import Personajes.Torre;

public class DisparoTorre extends Disparo {

	public DisparoTorre(Personaje p) {
		super(p);
	}

	@Override
	public void visitarTorre(Torre p) {	}

	@Override
	public void visitarEnemigo(Enemigo e) {
		//e.restarVida(disparador.getAtaque());
		e.kill();
		System.out.println("colisiono enemigo");
	}
	
}