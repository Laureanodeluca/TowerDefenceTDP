package Visitor;
import Personajes.Personaje;
import Personajes.Enemigo;

public abstract class Visitor 
{
	/**
	 * Visita a una torre 
	 * @param p Torre a visitar.
	 */
	public abstract void visitarTorre(Personaje p);
	
	/**
	 * Visita a un enemigo.
	 * @param e Enemigo a visitar.
	 */
	public abstract void visitarEnemigo(Enemigo e);
	
}
