package Personajes;
import javax.swing.*;

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
		velocidadDeAtaque = 50;
		this.x = x;
		this.y = y;
		espacioEnArreglo = e;
		label.setIcon(sprite);
	}

	@Override
	public void accept(Visitor v)
	{		
	}

	@Override
	public void atacar(Personaje p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int kill() 
	{
		x = 0;
		y = 0;
		cambiarLabel(null);
		return 0;
	}
}
