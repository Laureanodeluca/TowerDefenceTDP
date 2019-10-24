package Visitor;

import Enemigos.Enemigo;
import Personajes.Torre;

public class VisitorColisiones extends Visitor
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
