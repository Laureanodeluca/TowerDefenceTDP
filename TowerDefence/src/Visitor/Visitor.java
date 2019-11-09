package Visitor;
import Personajes.*;

public interface Visitor {
	public abstract void visitarTorre(Torre p);
	public abstract void visitarEnemigo(Enemigo e);	
}
