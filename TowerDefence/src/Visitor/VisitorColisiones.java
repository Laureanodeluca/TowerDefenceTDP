package Visitor;

import Personajes.*;

public class VisitorColisiones implements Visitor
{

	@Override
	public void visitarTorre(Torre p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitarEnemigo(Enemigo e)
	{
		e.setVelocidadDeMovimiento(0);
	}
}
