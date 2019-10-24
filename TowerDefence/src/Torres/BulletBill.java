package Torres;
import javax.swing.ImageIcon;

import Disparos.Disparo;
import FabricaDisparos.*;
import Personajes.*;
import State.Normal;
import Visitor.Visitor;

public class BulletBill extends Torre 
{
	public static final double c = 840;
	public BulletBill(int x, int y, int e)
	{
		sprite = new ImageIcon("src/main/resources/Bullet Bill/idle1.gif");
		ataque = 250;
		vida = 250;
		precio = 500;
		rango = 5;
		velocidadDeAtaque = 1.6;
		this.x = x;
		this.y = y;
		espacioEnArreglo = e;
		label.setIcon(sprite);
		factory = new FabricaDisparoBulletBill(this);
		contador = c;
		estado = new Normal(c);
	}

	@Override
	public Disparo atacar() {
		if (contador > 0)
			contador = contador-velocidadDeAtaque;
		else
		{
			contador = c;
			return factory.generarDisparo();
		}
		
		return null;	
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
