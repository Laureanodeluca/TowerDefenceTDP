package Enemigos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Personajes.Disparo;
import Personajes.Enemigo;
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
		this.velocidadDeMovimiento = 1;
		this.rango = 0;
		this.label = new JLabel(sprite);
		this.movimientoOriginal = 1;
	}	
	

	public void accept(Visitor v)
	{
		v.visitarEnemigo(this);
	}

	@Override
	public Disparo atacar() {
		return null;
	}
}
