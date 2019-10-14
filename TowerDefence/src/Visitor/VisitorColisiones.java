package Visitor;

import Personajes.Enemigo;
import Personajes.Personaje;

public class VisitorColisiones extends Visitor
{

	@Override
	public void visitarTorre(Personaje p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitarEnemigo(Enemigo e)
	{
		e.setVelocidadDeMovimiento(0);
	}
}