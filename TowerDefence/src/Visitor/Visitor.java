package Visitor;
import Enemigos.Enemigo;
import Personajes.Torre;

public abstract class Visitor 
{
	/**
	 * Visita a una torre 
	 * @param p Torre a visitar.
	 */
	public abstract void visitarTorre(Torre p);
	
	/**
	 * Visita a un enemigo.
	 * @param e Enemigo a visitar.
	 */
	public abstract void visitarEnemigo(Enemigo e);	
}
