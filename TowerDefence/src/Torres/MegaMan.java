package Torres;

import javax.swing.ImageIcon;

import Disparos.Disparo;
import FabricaDisparos.FabricaDisparoMegaMan;
import Personajes.Torre;
import State.Normal;
import Visitor.Visitor;

public class MegaMan extends Torre
{
	public static final double c = 500;
	public MegaMan(int x, int y, int e)
	{
		sprite = new ImageIcon("src/main/resources/Mega Man/idle1.gif");
		ataque = 150;
		vida = 100;
		precio = 650;
		rango = 5;
		velocidadDeAtaque = 1.6;
		this.x = x;
		this.y = y;
		espacioEnArreglo = e;
		label.setIcon(sprite);
		factory = new FabricaDisparoMegaMan(this);
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
