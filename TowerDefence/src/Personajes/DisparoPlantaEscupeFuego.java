package Personajes;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Visitor.Visitor;

public class DisparoPlantaEscupeFuego extends Disparo {

	public DisparoPlantaEscupeFuego(int x, int y, int ataque, int velocidaddeAtaque) {
		super(x+40, y+25, ataque, velocidaddeAtaque);
		sprite=new ImageIcon("src/main/resources/PlantaEscupefuego/bolafuego.png");
		label = new JLabel(sprite);
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int kill() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void mover(int i)
	{
		if (i != 0)
			this.x = this.x-i;
		cambiarLabel(this.sprite);
	}
}
