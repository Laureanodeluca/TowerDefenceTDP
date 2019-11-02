package Visitor;

import Personajes.*;

public class VisitorContinuarMovimiento implements Visitor
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
