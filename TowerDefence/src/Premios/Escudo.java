package Premios;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import Visitor.*;

public class Escudo extends MagiaTemporal{
	public Escudo(){
		sprite = new ImageIcon("src/Main/resources/Escudo/idle1.gif");

		miVisitor = new VisitorEscudo();
		this.label = new JLabel(sprite);
	}

/**
	@Override
	public void accept(Visitor v) {
	}
*/
	public int kill() {
		return 0;
	}

	public void reducirTiempoDeVida() {
	}
}
