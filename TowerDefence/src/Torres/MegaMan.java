package Torres;

import javax.swing.ImageIcon;

import FabricaDisparos.Disparo;
import FabricaDisparos.FabricaDisparoMegaMan;
import Personajes.Torre;
import Visitor.Visitor;

public class MegaMan extends Torre
{
	public MegaMan(int x, int y, int e)
	{
		sprite = new ImageIcon("src/main/resources/Mega Man/idle1.gif");
		ataque = 150;
		vida = 100;
		precio = 650;
		rango = 5;
		velocidadDeAtaque = 15;
		this.x = x;
		this.y = y;
		espacioEnArreglo = e;
		label.setIcon(sprite);
		factory = new FabricaDisparoMegaMan(this);
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
