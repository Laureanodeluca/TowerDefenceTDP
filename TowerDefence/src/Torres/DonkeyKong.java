package Torres;

import javax.swing.ImageIcon;

import Disparos.Disparo;
import FabricaDisparos.FabricaDisparoDonkeyKong;
import Personajes.Torre;
import Visitor.Visitor;

public class DonkeyKong extends Torre
{
	public static final double c = 800;
	public DonkeyKong(int x, int y, int e)
	{
		sprite = new ImageIcon("src/main/resources/Donkey Kong/idle1.gif");
		ataque = 500;
		vida = 350;
		precio = 600;
		rango = 5;
		velocidadDeAtaque = 1.6;
		this.x = x;
		this.y = y;
		espacioEnArreglo = e;
		label.setIcon(sprite);
		factory = new FabricaDisparoDonkeyKong(this);
		contador = c;
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
