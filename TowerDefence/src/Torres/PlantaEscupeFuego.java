package Torres;
import javax.swing.*;

import FabricaDisparos.Disparo;
import FabricaDisparos.FabricaDisparoPlantaEscupeFuego;
import Personajes.Torre;
import Visitor.Visitor;

public class PlantaEscupeFuego extends Torre
{
	public PlantaEscupeFuego(int x, int y, int e)
	{
		sprite = new ImageIcon("src/main/resources/PlantaEscupefuego/idle1.png");
		ataque = 50;
		vida = 100;
		precio = 500;
		rango = 5;
		velocidadDeAtaque = 20;
		this.x = x;
		this.y = y;
		espacioEnArreglo = e;
		label.setIcon(sprite);
		factory = new FabricaDisparoPlantaEscupeFuego(this);
	}

	@Override
	public void accept(Visitor v)
	{		
	}

	@Override
	public Disparo atacar()
	{
		return factory.generarDisparo();
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
