package Visitor;

import Personajes.*;
public class VisitorEscudo implements Visitor
{

	public void visitarTorre(Torre p) {
		p.setEscudo(150);
	}

	@Override
	public void visitarEnemigo(Enemigo e) {
	}

}
