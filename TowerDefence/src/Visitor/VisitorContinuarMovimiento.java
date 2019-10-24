package Visitor;

import Enemigos.Enemigo;
import Personajes.Torre;

public class VisitorContinuarMovimiento extends Visitor
{

	@Override
	public void visitarTorre(Torre p) {
	}

	@Override
	public void visitarEnemigo(Enemigo e) 
	{
		e.setVelocidadDeMovimiento(e.getMovimientoOriginal());
	}
}
