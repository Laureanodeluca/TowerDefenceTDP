package Premios;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import Visitor.*;

public class Escudo extends MagiaTemporal
{
	public Escudo(int x, int y)
	{
		sprite = new ImageIcon("src/Main/resources/Escudo/idle1.gif");
		this.x = x;
		this.y = y;
		miVisitor = new VisitorEscudo();
		this.label = new JLabel(sprite);
	}

	@Override
	public void mover(int i) {
		// TODO Auto-generated method stub
	}

	@Override
	public void accept(Visitor v) {
	}

	@Override
	public int kill() {
		return 0;
	}

	@Override
	public void reducirTiempoDeVida() {
	}
}
