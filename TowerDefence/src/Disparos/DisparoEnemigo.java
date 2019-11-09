package Disparos;

import Personajes.Enemigo;
import Personajes.Personaje;
import Personajes.Torre;

public class DisparoEnemigo extends Disparo {

	public DisparoEnemigo(Personaje p) {
		super(p);
	}

	@Override
	public void visitarTorre(Torre p) {
		p.restarVida(disparador.getAtaque());
		System.out.println("mierda");
	}

	@Override
	public void visitarEnemigo(Enemigo e) {}
	
}