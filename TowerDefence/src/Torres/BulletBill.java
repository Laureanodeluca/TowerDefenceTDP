package Torres;
import javax.swing.ImageIcon;

import FabricaDisparos.*;
import Personajes.*;
import Visitor.Visitor;

public class BulletBill extends Torre 
{
	public BulletBill(int x, int y, int e)
	{
		sprite = new ImageIcon("src/main/resources/Bullet Bill/idle1.gif");
		ataque = 250;
		vida = 250;
		precio = 500;
		rango = 5;
		velocidadDeAtaque = 5;
		this.x = x;
		this.y = y;
		espacioEnArreglo = e;
		label.setIcon(sprite);
		factory = new FabricaDisparoBulletBill(this);
	}

	@Override
	public Disparo atacar() {
		return factory.generarDisparo();
	}

	@Override
	public void mover(int i) {
		// TODO Auto-generated method stub
		
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
