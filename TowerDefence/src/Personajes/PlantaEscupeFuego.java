package Personajes;
import javax.swing.*;

import Visitor.Visitor;

public class PlantaEscupeFuego extends Torre
{
	public PlantaEscupeFuego(int x, int y)
	{
		sprite = new ImageIcon("src/main/resources/PlantaEscupefuego/idle1.png");
		ataque = 50;
		vida = 100;
		precio = 500;
		rango = 5;
		velocidadDeAtaque = 50;
		this.x = x;
		this.y = y;
	}

	@Override
	public void accept(Visitor v)
	{		
	}

	@Override
	public void atacar(Personaje p) {
		// TODO Auto-generated method stub
		
	}
	
	
}
