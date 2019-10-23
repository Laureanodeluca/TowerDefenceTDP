package Torres;
import javax.swing.*;

import Disparos.Disparo;
import FabricaDisparos.FabricaDisparoPlantaEscupeFuego;
import Personajes.Torre;
import Visitor.Visitor;

public class PlantaEscupeFuego extends Torre
{
	
	private static final float c = 650;	
	public PlantaEscupeFuego(int x, int y, int e)
	{
		sprite = new ImageIcon("src/main/resources/PlantaEscupefuego/idle1.gif");
		ataque = 50;
		vida = 100;
		precio = 500;
		rango = 5;
		velocidadDeAtaque = 1.6;
		this.x = x;
		this.y = y;
		espacioEnArreglo = e;
		label.setIcon(sprite);
		factory = new FabricaDisparoPlantaEscupeFuego(this);
		contador = c;
	}

	@Override
	public void accept(Visitor v)
	{		
	}

	@Override
	public Disparo atacar()
	{
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
	public int kill() 
	{
		x = 0;
		y = 0;
		cambiarLabel(null);
		return 0;
	}

	@Override
	public void mover(int i) {
		// TODO Auto-generated method stub
		
	}
}
