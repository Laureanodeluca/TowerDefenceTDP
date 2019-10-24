package Visitor;

import Enemigos.Enemigo;
import Personajes.Torre;

public class VisitorEscudo extends Visitor
{

	public void visitarTorre(Torre p) {
		p.setEscudo(150);
	}

	@Override
	public void visitarEnemigo(Enemigo e) {
	}

}
