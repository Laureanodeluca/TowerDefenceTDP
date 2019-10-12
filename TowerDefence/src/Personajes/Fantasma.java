package Personajes;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Visitor.Visitor;

public class Fantasma extends Enemigo
{
	
	public Fantasma(int x, int y)
	{
		this.x = x;
		this.y = y;
		sprite = new ImageIcon("src/Main/resources/Fantasma/idle1.png");
		this.ataque = 25;
		this.vida = 55;
		this.monedas = 100;
		this.velocidadDeAtaque = 50;
		this.velocidadDeMovimiento = 25;
		this.rango = 0;
		this.label = new JLabel(sprite);
	}	
	

	public void accept(Visitor v)
	{
		v.visitarEnemigo(this);
	}

	@Override
	public void atacar(Personaje p) {
		// TODO Auto-generated method stub
		
	}
}
