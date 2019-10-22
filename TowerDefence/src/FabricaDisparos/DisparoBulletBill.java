package FabricaDisparos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Visitor.Visitor;

public class DisparoBulletBill extends Disparo {

	public DisparoBulletBill(int x, int y, int ataque, int velocidaddeAtaque) 
	{
		super(x+40, y+25, ataque, velocidaddeAtaque);
		sprite=new ImageIcon("src/main/resources/Bullet Bill/disparo.gif");
		label = new JLabel(sprite);
	}

	@Override
	public void mover(int i)
	{
		if (i != 0)
			this.x = this.x-i;
		cambiarLabel(this.sprite);
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

}
