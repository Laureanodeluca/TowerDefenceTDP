package Visitor;

import Personajes.Enemigo;
import Personajes.Personaje;

public class VisitorContinuarMovimiento extends Visitor
{

	@Override
	public void visitarTorre(Personaje p) {
	}

	@Override
	public void visitarEnemigo(Enemigo e) 
	{
		e.setVelocidadDeMovimiento(e.getMovimientoOriginal());
	}
}
